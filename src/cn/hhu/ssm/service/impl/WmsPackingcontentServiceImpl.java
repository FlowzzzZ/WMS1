package cn.hhu.ssm.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.ibatis.executor.ResultExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsPackingcontent;
import cn.hhu.ssm.po.WmsPackingcontentExample;
import cn.hhu.ssm.po.WmsPackingcontentLog;
import cn.hhu.ssm.service.WmsPackingcontentService;
import net.sf.json.JSONObject;
import cn.hhu.ssm.common.Code;
import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.exception.CustomException;
import cn.hhu.ssm.mapper.WmsPackingcontentLogMapper;
import cn.hhu.ssm.mapper.WmsPackingcontentMapper;

public class WmsPackingcontentServiceImpl implements WmsPackingcontentService {
	@Autowired
	private WmsPackingcontentMapper wmsPackingcontentMapper;
	@Autowired
	private WmsPackingcontentLogMapper wmsPackingcontentLogMapper;
	@Override
	public Map<String, Object> findPackingcontentById(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
		//调用wmsPackingcontentMapper方法,利用id进行查找
		WmsPackingcontent wmsPackingcontent = wmsPackingcontentMapper.selectByPrimaryKey(id);
		resultMap.put("data", wmsPackingcontent);

		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	
	//批量查询装箱内容
	@Override
	public Map<String, Object> findPackingcontentByCriteria(WmsPackingcontent packingcontent,PageBean pageBean)
			throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			
			//通过criteria构建查询条件
			WmsPackingcontentExample packingcontentExample = new WmsPackingcontentExample();
			WmsPackingcontentExample.Criteria criteria = packingcontentExample.createCriteria();
			//查询的出库计划可能为多条
			List<WmsPackingcontent> wmsPackingcontentList = new ArrayList<WmsPackingcontent>();
			if(packingcontent!=null) {
			//根据制单日期进行装箱内容的查找
			if(packingcontent.getStartTime()!=null&&packingcontent.getEndTime()!=null) {
				//查询日期在xx-xx之间的
				criteria.andMakeorderdateBetween(packingcontent.getStartTime(), packingcontent.getEndTime());
			}else if(packingcontent.getStartTime()!=null) {
				criteria.andMakeorderdateGreaterThan(packingcontent.getStartTime());
			}else if (packingcontent.getEndTime()!=null) {
				criteria.andMakeorderdateLessThan(packingcontent.getEndTime());
			}
		}
		//获取查询总记录数
			Integer totalCount = wmsPackingcontentMapper.countByExample(packingcontentExample);
		//如果查到了记录，则...
			if(null!=totalCount && totalCount>0) {
		//页面信息反射到查询条件里
		pageBean.setPageParam(packingcontentExample);
		//根据之前构造的查询条件来查询记录
		wmsPackingcontentList = wmsPackingcontentMapper.selectByExample(packingcontentExample);
		//把记录数和数据存在pagebean中
		pageBean.setTotalCount(null);
		pageBean.setData(wmsPackingcontentList);
		//把pagebean封装到pagebean中
		resultMap.put("data", pageBean);	
			}else {
		//如果查询记录为空，则添加错误代码为没有数据代码
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NO_DATA);
				resultMap.put("errmsg", "查询成功，查询结果为空");
			}
		} catch (Exception e) {
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
		}

	@Override
	public Map<String, Object> addPackingcontent(WmsPackingcontent wmsPackingcontent) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			int result = 0;
			//如果id不为空
			if(wmsPackingcontent.getPackingcontentId()!=null) {
				//根据id查找装箱内容
				WmsPackingcontent packingcontent = wmsPackingcontentMapper.selectByPrimaryKey(wmsPackingcontent.getPackingcontentId());
				if(packingcontent!=null) {
					//如果Packingcontent存在，则说明记录已经存在不能再插入
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_EXISTED_DATA);
					resultMap.put("errmsg", "数据已存在，不能新增加数据");
				}else {				
				//如果Packingcontent为空，则说明记录不存在可以进行插入
				result = wmsPackingcontentMapper.insert(wmsPackingcontent);
				}
			}else {
				//如果id属性为空，则直接进行插入操作
				result = wmsPackingcontentMapper.insert(wmsPackingcontent);
				}

			return resultMap;
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	@Transactional
	public Map<String, Object> updatePackingcontent(WmsPackingcontent wmsPackingcontent,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//如果没有提供主键，则无法进行更新操作
			if(wmsPackingcontent.getPackingcontentId()==null) {
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_PRIMARY_KEY);
				resultMap.put("errmsg", "没有主键无法进行更新操作");
			}else {
				WmsPackingcontent prePackingcontent = wmsPackingcontentMapper.selectByPrimaryKey(wmsPackingcontent.getPackingcontentId());
				int result = wmsPackingcontentMapper.updateByPrimaryKey(wmsPackingcontent);
				addPackingcontentLog(prePackingcontent, wmsPackingcontent, employee);
	
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
	public Map<String, Object> deletePackingcontentById(Integer id,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//现根据id查询数据是否存在
			WmsPackingcontent packingContent = wmsPackingcontentMapper.selectByPrimaryKey(id);
			if(packingContent==null) {
				//数据不存在不能进行删除
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
				resultMap.put("errmsg", "数据不存在不能删除");
			}else {
				//如果存在则进行删除
				int result = wmsPackingcontentMapper.deleteByPrimaryKey(id);
				addPackingcontentLog(packingContent, null, employee);
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
	public Map<String, Object> deleteAllPackingcontent(Integer[] ids,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//循环遍历
			for (int i = 0; i < ids.length; i++) {
				//根据id查找，判断数据是否存在
				WmsPackingcontent packingcontent = wmsPackingcontentMapper.selectByPrimaryKey(ids[i]);
				//如果数据不存在则不能进行删除
				if(packingcontent==null) {
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
					resultMap.put("errmsg", "数据不存在不能删除");
					break;
				}else {
					//如果数据存在，则执行删除操作
					int result = wmsPackingcontentMapper.deleteByPrimaryKey(ids[i]);
					addPackingcontentLog(packingcontent, null, employee);
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
	public Map<String, Object> addPackingcontentLog(WmsPackingcontent prePackingcontent, WmsPackingcontent afterPackingcontent, WmsBaseEmployee employee)
			throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//log表添加记录
			WmsPackingcontentLog wmsPackingcontentLog = new WmsPackingcontentLog();
			String preStr = null;
			String afterStr = null;
			
			if(prePackingcontent!=null||afterPackingcontent!=null) {
				if(prePackingcontent!=null&&prePackingcontent.getPackingcontentId()!=null) {
					//设置Packingcontentlog的Packingcontentid值
					wmsPackingcontentLog.setPackingcontentId(prePackingcontent.getPackingcontentId());
					//记录Packingcontent更新前的状态
					preStr = JSONObject.fromObject(prePackingcontent).toString();
				}
				if (afterPackingcontent!=null&&afterPackingcontent.getPackingcontentId()!=null) {
					//设置Packingcontentlog的Packingcontentid值
					wmsPackingcontentLog.setPackingcontentId(afterPackingcontent.getPackingcontentId());
					afterStr = JSONObject.fromObject(afterPackingcontent).toString();
				}
			if(wmsPackingcontentLog.getPackingcontentId()==null||employee==null||employee.getEmployeeId()==null) {
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
			wmsPackingcontentLog.setPackingcontentPremodifiedstate(preStr);
			wmsPackingcontentLog.setPackingcontentModifiedstate(afterStr);
			wmsPackingcontentLog.setEmployeeId(employeeId);
			
			wmsPackingcontentLog.setModifyman(employeeName);
			wmsPackingcontentLog.setModifieddate(modifieddate);
			wmsPackingcontentLogMapper.insert(wmsPackingcontentLog);
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


