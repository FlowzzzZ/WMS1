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
import cn.hhu.ssm.mapper.WmsBoxLogMapper;
import cn.hhu.ssm.mapper.WmsBoxMapper;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsBox;
import cn.hhu.ssm.po.WmsBoxExample;
import cn.hhu.ssm.po.WmsBoxLog;
import cn.hhu.ssm.po.WmsExplanLog;
import cn.hhu.ssm.service.WmsBoxService;
import cn.hhu.ssm.test.ExplanTest;
import net.sf.json.JSONObject;

public class WmsBoxServiceImpl implements WmsBoxService {
	
	@Autowired
	private WmsBoxMapper wmsBoxMapper;
	@Autowired
	private WmsBoxLogMapper wmsBoxLogMapper;
	
	@Override
	public Map<String, Object> findBoxById(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//使用wmsBoxMapper根据id查找
			WmsBox wmsBox = wmsBoxMapper.selectByPrimaryKey(id);
			resultMap.put("data", wmsBox);
		} catch (Exception e) {
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> findBoxByCriteria(WmsBox wmsBox,PageBean pageBean) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//通过criteria构建查询条件
			WmsBoxExample BoxExample = new WmsBoxExample();
			WmsBoxExample.Criteria criteria = BoxExample.createCriteria();
			//查询的箱子可能为多个
			List<WmsBox> wmsBoxList = new ArrayList<WmsBox>();
			if(wmsBox!=null) {
				//根据包装箱型号进行查询
				if(wmsBox.getBoxtype()!=null) {
					Integer boxType = wmsBox.getBoxtype();
					//将包装箱型号这个条件添加到criteria里面
					criteria.andBoxtypeEqualTo(wmsBox.getBoxtype());
				}
				//将包装箱体积作为查询条件
				if(wmsBox.getVolume()!=null&&wmsBox.getVolume()>=0) {
				//查询体积大于某个范围的包装箱
					criteria.andVolumeGreaterThan(wmsBox.getVolume());
				}
			}
			//获取查询总记录数
			Integer totalCount = wmsBoxMapper.countByExample(BoxExample);
			//如果查到了记录则...
			if(null!=totalCount&&totalCount>0) {
				//页面信息反射到查询条件里
				pageBean.setPageParam(BoxExample);
				//根据之前构造的条件来查询记录
				wmsBoxList = wmsBoxMapper.selectByExample(BoxExample);
				//把记录总数和数据存在pagebean中
				pageBean.setTotalCount(totalCount);
				pageBean.setData(wmsBoxList);
				//把pagebean封装到data里面
				resultMap.put("data", pageBean);
			}else {
				//如果查询记录为空，则添加错误代码为没有数据代码
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NO_DATA);
				resultMap.put("errmsg", "查询成功，查询结果为空");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> addBox(WmsBox wmsBox) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			int result = 0;
			//如果有id不为空
			if(wmsBox.getBoxId()!=null) {
				//根据id去查找包装箱
				WmsBox box = wmsBoxMapper.selectByPrimaryKey(wmsBox.getBoxId());
				if(box!=null) {
					//如果box存在，则说明记录已经存在不能再插入
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_EXISTED_DATA);
					resultMap.put("errmsg", "数据已存在，不能新增加数据");
				}else {
					//如果box=null则说明记录不存在可以插入
					result = wmsBoxMapper.insert(wmsBox);
				}
					
				}else {
					//如果没有id属性则直接插入
					result = wmsBoxMapper.insert(wmsBox);
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
	public Map<String, Object> deleteBoxById(Integer id,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//现根据id查找对应数据
			WmsBox wmsBox = wmsBoxMapper.selectByPrimaryKey(id);
			if(wmsBox==null) {
				//如果查询记录为空，则不能进行删除
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
				resultMap.put("errmsg", "数据不存在不能删除");	
			}else {
				//如果查询记录不为空，则进行删除操作
				int result = wmsBoxMapper.deleteByPrimaryKey(id);
				addBoxLog(wmsBox, null, employee);
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
	public Map<String, Object> deleteAllBox(Integer[] ids,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//循环遍历
			for (int i = 0; i < ids.length; i++) {
				//根据id判断数据是否存在
				WmsBox wmsBox = wmsBoxMapper.selectByPrimaryKey(ids[i]);
				if(wmsBox==null) {
					//如果查询记录为空，则不能进行删除操作
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
					resultMap.put("errmsg", "数据不存在不能删除");
					break;
				}else {
					//如果查询记录不为空则进行删除
					int result = wmsBoxMapper.deleteByPrimaryKey(ids[i]);
					addBoxLog(wmsBox, null, employee);
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
	@Transactional
	public Map<String, Object> updateBox(WmsBox wmsBox,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//如果没有提供逐渐无法进行更新操作
			if(wmsBox.getBoxId()==null) {
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_PRIMARY_KEY);
				resultMap.put("errmsg", "没有主键无法进行更新操作");
			}else {
				WmsBox preBox = wmsBoxMapper.selectByPrimaryKey(wmsBox.getBoxId());
				int result = wmsBoxMapper.updateByPrimaryKey(wmsBox);
				addBoxLog(preBox, wmsBox, employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> addBoxLog(WmsBox preBox,WmsBox afterBox,WmsBaseEmployee employee) {
		Map<String, Object> resultMap = getResultMap();
		try {
			//log表添加记录
			WmsBoxLog wmsBoxLog = new WmsBoxLog();
			String preStr = null;
			String afterStr = null;
			
			if(preBox!=null||afterBox!=null) {
				if(preBox!=null&&preBox.getBoxId()!=null) {
					//设置Boxlog的Boxid值
					wmsBoxLog.setBoxId(preBox.getBoxId());
					//记录Box更新前的状态
					preStr = JSONObject.fromObject(preBox).toString();
				}
				if (afterBox!=null&&afterBox.getBoxId()!=null) {
					//设置Boxlog的Boxid值
					wmsBoxLog.setBoxId(afterBox.getBoxId());
					afterStr = JSONObject.fromObject(afterBox).toString();
				}
				if(wmsBoxLog.getBoxId()==null||employee==null||employee.getEmployeeId()==null) {
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
			wmsBoxLog.setBoxPremodifiedstate(preStr);
			wmsBoxLog.setBoxModifiedstate(afterStr);
			wmsBoxLog.setEmployeeId(employeeId);
			
			wmsBoxLog.setModifyman(employeeName);
			wmsBoxLog.setModifieddate(modifieddate);
			wmsBoxLogMapper.insert(wmsBoxLog);
		}catch (Exception e) {
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
