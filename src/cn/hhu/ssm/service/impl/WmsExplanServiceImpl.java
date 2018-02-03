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
import cn.hhu.ssm.mapper.WmsBaseShipperMapper;
import cn.hhu.ssm.mapper.WmsExplanLogMapper;
import cn.hhu.ssm.mapper.WmsExplanMapper;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsBaseShipper;
import cn.hhu.ssm.po.WmsExplan;
import cn.hhu.ssm.po.WmsExplanExample;
import cn.hhu.ssm.po.WmsExplanLog;
import cn.hhu.ssm.service.WmsExplanService;
import net.sf.json.JSONObject;



public class WmsExplanServiceImpl implements WmsExplanService{

	@Autowired
	private WmsExplanMapper wmsExplanMapper;
	@Autowired
	private WmsBaseShipperMapper wmsShipperMapper;
	
	
	@Autowired
	private WmsExplanLogMapper wmsExplanLogMapper;
	@Override
	public Map<String, Object> findExplanById(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//使用wmsExplanMapper根据id查找
			WmsExplan wmsExplan =  wmsExplanMapper.selectByPrimaryKey(id);
			resultMap.put("data", wmsExplan);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	@Override
	public Map<String, Object> findExplanByCriteria(WmsExplan explan, PageBean pageBean) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			
			//通过criteria构建查询条件
			WmsExplanExample explanExample = new WmsExplanExample();
			WmsExplanExample.Criteria criteria = explanExample.createCriteria();
			//
			//查询的出库计划可能为多条
			List<WmsExplan> wmsExplanList = new ArrayList<WmsExplan>();
			//定义客户姓名
			String customer = null;
			if(explan!=null) {
				//客户名称模糊查询条件
				if(explan.getCustomername()!=null) {
					customer = explan.getCustomername();  
//					System.out.println(customer);
					//处理乱码问题
					/*String strCustomer = new String(customer.getBytes("iso-8859-1"), "utf-8");
					System.out.println(strCustomer);
					explan.setCustomername(strCustomer);*/
				}
				//如果存在这个查询条件，则把查询条件添加到criteria里面
				if(explan.getCustomernumber()!=null&&explan.getCustomernumber().length()>0) {
					criteria.andCustomernumberLike("%"+explan.getCustomernumber()+"%");
				}
				
				if(customer!=null&&customer.length()>0)
					criteria.andCustomernameLike("%"+explan.getCustomername()+"%");
				if(explan.getStartTime()!=null&&explan.getEndTime()!=null) {
					//查询日期在xx-xx之间的
					criteria.andExdateBetween((Date)explan.getStartTime(), (Date)explan.getEndTime());
				}else if(explan.getStartTime()!=null) {
					criteria.andExdateGreaterThan((Date)explan.getStartTime());
				}else if(explan.getEndTime()!=null) {
					criteria.andExdateLessThan((Date)explan.getEndTime());
				}
				if(explan.getOrderBy()!=null&&explan.getOrderBy().equalsIgnoreCase("explanId"))
					explanExample.setOrderByClause("Explan_ID "+explan.getSortOrder());
				
			}
			//获取查询总记录数
			Integer totalCount = wmsExplanMapper.countByExample(explanExample);
//			System.out.println(totalCount);
			//如果查到记录了则..
			if (null != totalCount && totalCount > 0) {
				//页面信息反射到查询条件里
				pageBean.setPageParam(explanExample);
				//根据之前构造的查询条件来查询记录
				wmsExplanList =  wmsExplanMapper.selectExplans(explanExample);
//				System.out.println(wmsExplanList.get(0).getExplanId());
				//把记录总数和数据存到pagebean中
				pageBean.setTotalCount(totalCount);
				pageBean.setData(wmsExplanList);
				//把pageBean封装到data里面
				resultMap.put("data",pageBean);
			} else {
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
	public Map<String, Object> addExplan(WmsExplan wmsExplan) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			int result = 0;
			//如果有id不为空
			if(wmsExplan.getExplanId()!=null) {
				//根据id去查找出库计划，
				WmsExplan explan = wmsExplanMapper.selectByPrimaryKey(wmsExplan.getExplanId());
				if(explan!=null) {
					//如果explan存在，则说明记录以及存在不能再插入
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_EXISTED_DATA);
					resultMap.put("errmsg", "数据已存在，不能新增加数据");
				}else {
					//如果explan=null则说明记录不存在可以插入
					result = wmsExplanMapper.insert(wmsExplan);
				}
			}
			else{
				//如果没有id属性则直接插入
				result = wmsExplanMapper.insert(wmsExplan);
			}
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	@Override
	@Transactional
	public Map<String, Object> deleteExplanById(Integer id,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//先根据id查找explanid对应数据是否存在
			WmsExplan explan = wmsExplanMapper.selectByPrimaryKey(id);
			if (explan==null) {
				//如果不存在，则不能删除
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
				resultMap.put("errmsg", "数据不存在不能删除");
			}else {
				//如果存在则执行删除操作
				int result = wmsExplanMapper.deleteByPrimaryKey(id);
				addExplanLog(explan, null, employee);
			}
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	@Override
	@Transactional
	public Map<String, Object> deleteAllExplan(Integer[] ids,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//循环遍历
			for(int i = 0;i<ids.length;i++) {
				//查找判断是否存在
				WmsExplan explan = wmsExplanMapper.selectByPrimaryKey(ids[i]);
				if (explan==null) {
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
					resultMap.put("errmsg", "数据不存在不能删除");
					break;
				}else {
					int result = wmsExplanMapper.deleteByPrimaryKey(ids[i]);
					addExplanLog(explan, null, employee);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	@Override
	@Transactional
	public Map<String, Object> updateExplan(WmsExplan wmsExplan,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//如果没有提供主键则无法进行更新操作
			if(wmsExplan.getExplanId()==null) {
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_PRIMARY_KEY);
				resultMap.put("errmsg", "没有主键无法进行更新操作");
			}else {
				
				WmsExplan preExplan = wmsExplanMapper.selectByPrimaryKey(wmsExplan.getExplanId());
				int result = wmsExplanMapper.updateByPrimaryKey(wmsExplan);
				addExplanLog(preExplan, wmsExplan, employee);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	@Override
	public Map<String, Object> addExplanLog(WmsExplan preExplan, WmsExplan afterExplan, WmsBaseEmployee employee) throws Exception {

		Map<String, Object> resultMap = getResultMap();
		try {
			//log表添加记录
			WmsExplanLog wmsExplanLog = new WmsExplanLog();
			String preStr = null;
			String afterStr = null;
			
			if(preExplan!=null||afterExplan!=null) {
				if(preExplan!=null&&preExplan.getExplanId()!=null) {
					//设置explanlog的explanid值
					wmsExplanLog.setExplanId(preExplan.getExplanId());
					//记录explan更新前的状态
					preStr = JSONObject.fromObject(preExplan).toString();
				}
				if (afterExplan!=null&&afterExplan.getExplanId()!=null) {
					//设置explanlog的explanid值
					wmsExplanLog.setExplanId(afterExplan.getExplanId());
					afterStr = JSONObject.fromObject(afterExplan).toString();
				}
				if(wmsExplanLog.getExplanId()==null||employee==null||employee.getEmployeeId()==null) {
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
			wmsExplanLog.setExplanPremodifiedstate(preStr);
			wmsExplanLog.setExplanModifiedstate(afterStr);
			wmsExplanLog.setEmployeeId(employeeId);
			
			wmsExplanLog.setModifyman(employeeName);
			wmsExplanLog.setModifieddate(modifieddate);
			wmsExplanLogMapper.insert(wmsExplanLog);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	
	
	
	
	//查询所有货主信息，获取货主姓名展示到下拉框供新增出库计划选择
	@Override
	public Map<String, Object> findAllShipper() throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//使用Mapper根据id查找
			List<WmsBaseShipper> shippers = wmsShipperMapper.selectByExample(null);
			resultMap.put("data", shippers);
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