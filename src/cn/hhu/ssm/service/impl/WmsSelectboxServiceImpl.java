package cn.hhu.ssm.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.hhu.ssm.common.Code;
import cn.hhu.ssm.mapper.WmsSelectboxLogMapper;
import cn.hhu.ssm.mapper.WmsSelectboxMapper;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsSelectbox;
import cn.hhu.ssm.po.WmsSelectboxLog;
import cn.hhu.ssm.service.WmsSelectboxService;
import net.sf.json.JSONObject;

public class WmsSelectboxServiceImpl implements WmsSelectboxService {
	@Autowired
	private WmsSelectboxMapper wmsSelectboxMapper;
	@Autowired
	private WmsSelectboxLogMapper wmsSelectboxLogMapper;
	@Override
	public Map<String, Object> findSelectboxById(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//使用wmsselectboxMapper根据id查找数据
			WmsSelectbox wmsSelectbox = wmsSelectboxMapper.selectByPrimaryKey(id);
			resultMap.put("data", wmsSelectbox);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
			}
		return resultMap;
		}

	@Override
	public Map<String, Object> addSelectbox(WmsSelectbox wmsSelectBox) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			int result = 0;
			//如果有id不为空
			if(wmsSelectBox.getSelectboxId()!=null) {
				//根据id去查找出库几乎
				WmsSelectbox selectbox = wmsSelectboxMapper.selectByPrimaryKey(wmsSelectBox.getSelectboxId());
				if(selectbox!=null) {
					//如果selectbox存在，则说明记录已经存在不能再插入
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_EXISTED_DATA);
					resultMap.put("errmsg", "数据已存在，不能新增加数据");
				}else {
					//如果selectbox为空，则说明记录不存在可以进行插入
					result = wmsSelectboxMapper.insert(wmsSelectBox);
				}
			}else {
				//如果没有id属性，则直接进行插入
				result = wmsSelectboxMapper.insert(wmsSelectBox);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
			return resultMap;
	}

	@Override
	@Transactional
	public Map<String, Object> updateSelectbox(WmsSelectbox wmsSelectbox,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//如果没有主键，则无法进行更新操作
			if(wmsSelectbox.getSelectboxId()==null) {
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_PRIMARY_KEY);
				resultMap.put("errmsg", "没有主键无法进行更新操作");
			}else {
				WmsSelectbox preSelectbox = wmsSelectboxMapper.selectByPrimaryKey(wmsSelectbox.getSelectboxId());
				int result = wmsSelectboxMapper.updateByPrimaryKey(wmsSelectbox);
				addSelectboxLog(preSelectbox, wmsSelectbox, employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	@Transactional
	public Map<String, Object> deleteSelectboxById(Integer id,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			WmsSelectbox selectbox = wmsSelectboxMapper.selectByPrimaryKey(id);
			//根据id查找selectbox，如果为空则不能进行删除操作
			if(selectbox==null) {
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
				resultMap.put("errmsg", "数据不存在不能删除");	
			}else {
				//如果不为空，则执行删除操作
				int result = wmsSelectboxMapper.deleteByPrimaryKey(id);
				addSelectboxLog(selectbox, null, employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	@Transactional
	public Map<String, Object> deleteAllSelectbox(Integer[] ids,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//循环遍历
			for (int i = 0; i < ids.length; i++) {
				//根据id查找selectbox，如果数据不存在则不能进行删除
				WmsSelectbox selectbox = wmsSelectboxMapper.selectByPrimaryKey(ids[i]);
				//数据为空，不能进行删除操作
				if(selectbox==null) {
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
					resultMap.put("errmsg", "数据不存在不能删除");
					break;
				}else {
					//查找数据不为空，则进行删除操作
					int result = wmsSelectboxMapper.deleteByPrimaryKey(ids[i]);
					addSelectboxLog(selectbox, null, employee);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> addSelectboxLog(WmsSelectbox preSelectbox, WmsSelectbox afterSelectbox, WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//log表添加记录
			WmsSelectboxLog wmsSelectboxLog = new WmsSelectboxLog();
			String preStr = null;
			String afterStr = null;
			
			if(preSelectbox!=null||afterSelectbox!=null) {
				if(preSelectbox!=null&&preSelectbox.getSelectboxId()!=null) {
					//设置Selectboxlog的Selectboxid值
					wmsSelectboxLog.setSelectboxId(preSelectbox.getSelectboxId());
					//记录Selectbox更新前的状态
					preStr = JSONObject.fromObject(preSelectbox).toString();
				}
				if (afterSelectbox!=null&&afterSelectbox.getSelectboxId()!=null) {
					//设置Selectboxlog的Selectboxid值
					wmsSelectboxLog.setSelectboxId(afterSelectbox.getSelectboxId());
					afterStr = JSONObject.fromObject(afterSelectbox).toString();
				}
				if(wmsSelectboxLog.getSelectboxId()==null||employee==null||employee.getEmployeeId()==null) {
					resultMap.put("errcode", Code.RESPONSE_CODE.LOG_NON_PRIMARY_KEY);
					resultMap.put("errmsg", "log表缺乏主键信息");
				}
			}else {
				resultMap.put("errcode", Code.RESPONSE_CODE.LOG_NON_UPDATE_INFO);
				resultMap.put("errmsg", "log表缺乏主键信息");
			}
			
			//得到修改人的员工id和员工姓名
			Integer employeeId = employee.getEmployeeId();
			String employeeName = employee.getName();
			//获取当前时间
			Date modifieddate = new Date();
			wmsSelectboxLog.setSelectboxPremodifiedstate(preStr);
			wmsSelectboxLog.setSelectboxModifiedstate(afterStr);
			wmsSelectboxLog.setEmployeeId(employeeId);
			
			wmsSelectboxLog.setModifyman(employeeName);
			wmsSelectboxLog.setModifieddate(modifieddate);
			wmsSelectboxLogMapper.insert(wmsSelectboxLog);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	
	public Map<String,Object> getResultMap(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("errcode", 0);
		map.put("errmsg", "ok");
		map.put("data", "");
		return map;
	}
}
