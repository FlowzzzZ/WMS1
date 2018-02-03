package cn.hhu.ssm.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.hhu.ssm.common.Code;
import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.mapper.WmsExcheckLogMapper;
import cn.hhu.ssm.mapper.WmsExcheckMapper;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExcheck;
import cn.hhu.ssm.po.WmsExcheckExample;
import cn.hhu.ssm.po.WmsExcheckLog;
import cn.hhu.ssm.service.WmsExCheckService;
import net.sf.json.JSONObject;

public class WmsExCheckServiceImpl implements WmsExCheckService {
	@Autowired
	private WmsExcheckMapper wmsExcheckMapper;
	@Autowired
	private WmsExcheckLogMapper wmsExcheckLogMapper;
	@Override
	public Map<String, Object> findExcheckById(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//使用wmsExcheckMapper根据id查找
			WmsExcheck wmsExcheck = wmsExcheckMapper.selectByPrimaryKey(id);
			resultMap.put("data", wmsExcheck);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	//根据出库明细id,复核人作为查询条件来进行出库复核的查询
	@Override
	public Map<String, Object> findExcheckByCriteria(WmsExcheck wmsExcheck, PageBean pageBean) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//根据criteria构建查询条件
			WmsExcheckExample excheckExample = new WmsExcheckExample();
			WmsExcheckExample.Criteria criteria = excheckExample.createCriteria();
			//查询的出库复核可能为多条
			List<WmsExcheck> wmsExcheckList = new ArrayList<WmsExcheck>();
			if(wmsExcheck!=null) {
				//根据出库明细id作为查询条件来进行出库复核的查询
				if(wmsExcheck.getDetailId()!=null&&wmsExcheck.getDetailId()>=0) {
					Integer detailId = wmsExcheck.getDetailId();
					//如果存在这个查询条件，则把这个查询条件添加到criteria里面
					criteria.andDetailIdEqualTo(detailId);
					}
				//根据复核人作为查询条件来进行出库复核的查询
				if(wmsExcheck.getCheckman()!=null&&wmsExcheck.getCheckman().length()>0) {
					criteria.andCheckmanLike("%"+wmsExcheck.getCheckman()+"%");
				}
			}
			
			//获取查询总记录数
			Integer totalCount = wmsExcheckMapper.countByExample(excheckExample);
			//如果查到记录了则..
			if(null != totalCount && totalCount >0) {
				//页面的信息反射到查询条件里
				pageBean.setPageParam(excheckExample);
				//根据之前构造的查询条件来查询记录
				wmsExcheckList = wmsExcheckMapper.selectByExample(excheckExample);
				//把记录总数和数据存在pagebean中
				pageBean.setTotalCount(totalCount);
				pageBean.setData(wmsExcheckList);
				//把pagebean封装到data里面
				resultMap.put("data", pageBean);
			}else {
				//如果查询记录为空，则添加错误代码为没有数据代码
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NO_DATA);
				resultMap.put("errmsg", "查询成功，查询结果为空");
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> addExcheck(WmsExcheck wmsExcheck) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//如果有id属性切补位空
			if(wmsExcheck.getExcheckId()!=null) {
				//根据id去查找出库复核
				WmsExcheck excheck = wmsExcheckMapper.selectByPrimaryKey(wmsExcheck.getExcheckId());
				if(excheck!=null) {
					//如果Excheck不为空，则说明记录存在不能再插入
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_EXISTED_DATA);
					resultMap.put("errmsg", "数据已存在，不能新增加数据");
				}else {
					//如果excheck为空，则说明记录不存在进行插入
					int result = wmsExcheckMapper.insert(wmsExcheck);
				}
			}else {
					//如果id属性不存在，则直接进行插入操作
					int result = wmsExcheckMapper.insert(wmsExcheck);
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
	public Map<String, Object> updateExcheck(WmsExcheck wmsExcheck,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//如果没有提供主键则无法进行更新操作
			if(wmsExcheck.getExcheckId()==null) {
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_PRIMARY_KEY);
				resultMap.put("errmsg", "没有主键无法进行更新操作");	
			}else {
				WmsExcheck preExcheck = wmsExcheckMapper.selectByPrimaryKey(wmsExcheck.getExcheckId());
				int result = wmsExcheckMapper.updateByPrimaryKey(wmsExcheck);
				addExcheckLog(preExcheck, wmsExcheck, employee);

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
	public Map<String, Object> deleteExcheckById(Integer id,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//先根据id查找对应出库复核是否存在
			WmsExcheck excheck = wmsExcheckMapper.selectByPrimaryKey(id);
			if(excheck==null) {
				//如果数据不存在，则不能删除
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
				resultMap.put("errmsg", "数据不存在不能删除");	
			}else {
				//如果对应数据存在，则执行删除操作
				int result = wmsExcheckMapper.deleteByPrimaryKey(id);
				addExcheckLog(excheck, null, employee);
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
	public Map<String, Object> deleteAllExcheck(Integer[] ids,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//循环遍历
			for (int i = 0; i < ids.length; i++) {
				//根据id查找对应出库复核
				WmsExcheck excheck = wmsExcheckMapper.selectByPrimaryKey(ids[i]);
				if(excheck==null) {
					//如果excheck为空，则说明数据不存在不能进行删除
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
					resultMap.put("errmsg", "数据不存在不能删除");
					break;
				}else {
					int result = wmsExcheckMapper.deleteByPrimaryKey(ids[i]);
					addExcheckLog(excheck, null, employee);
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
	public Map<String, Object> addExcheckLog(WmsExcheck preExcheck, WmsExcheck afterExcheck, WmsBaseEmployee employee) {
		Map<String, Object> resultMap = getResultMap();
		try {
			//log表添加记录
			WmsExcheckLog excheckLog = new WmsExcheckLog();
			String preStr = null;
			String afterStr = null;
			if(preExcheck!=null||afterExcheck!=null) {
				//设置exchecklog的excheckid值
				excheckLog.setExcheckId(preExcheck.getExcheckId());
				//记录excheck更新前的状态
				preStr = JSONObject.fromObject(preExcheck).toString();
			}
			if(afterExcheck!=null&&afterExcheck.getExcheckId()!=null) {
				//设置exchecklog的excheckid值
				excheckLog.setExcheckId(afterExcheck.getExcheckId());
				afterStr = JSONObject.fromObject(afterExcheck).toString();
			}
			if(excheckLog.getExcheckId()==null||employee==null||employee.getEmployeeId()==null) {
				resultMap.put("errcode", Code.RESPONSE_CODE.LOG_NON_PRIMARY_KEY);
				resultMap.put("errmsg", "log表缺乏主键信息");
			}else {
				resultMap.put("errcode", Code.RESPONSE_CODE.LOG_NON_UPDATE_INFO);
				resultMap.put("errmsg", "log表缺乏主键信息");
			}
			
			//得到修改人的员工id和员工姓名
			Integer employeeId = employee.getEmployeeId();
			String employeeName = employee.getName();
			//获取当前时间
			Date mofifieddate = new Date();
			excheckLog.setExcheckPremodifiedstate(preStr);
			excheckLog.setExcheckModifiedstate(afterStr);
			excheckLog.setEmployeeId(employeeId);
			
			excheckLog.setModifyman(employeeName);
			excheckLog.setModifieddate(mofifieddate);
			wmsExcheckLogMapper.insert(excheckLog);
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
