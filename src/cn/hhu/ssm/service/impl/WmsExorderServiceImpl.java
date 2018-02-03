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
import cn.hhu.ssm.mapper.WmsBaseEmployeeMapper;
import cn.hhu.ssm.mapper.WmsBaseShipperMapper;
import cn.hhu.ssm.mapper.WmsExorderLogMapper;
import cn.hhu.ssm.mapper.WmsExorderMapper;
import cn.hhu.ssm.mapper.WmsStorehouseMapper;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsBaseShipper;
import cn.hhu.ssm.po.WmsExorder;
import cn.hhu.ssm.po.WmsExorderExample;
import cn.hhu.ssm.po.WmsExorderLog;
import cn.hhu.ssm.po.WmsExplan;
import cn.hhu.ssm.po.WmsExplanExample;
import cn.hhu.ssm.po.WmsExplanLog;
import cn.hhu.ssm.po.WmsStorehouse;
import cn.hhu.ssm.service.WmsExorderService;
import net.sf.json.JSONObject;

public class WmsExorderServiceImpl implements WmsExorderService {
	//自动注入mapper
	@Autowired
	private WmsExorderMapper exorderMapper;
	@Autowired
	private WmsBaseShipperMapper shipperMapper;
	@Autowired
	private WmsStorehouseMapper storehouseMapper;
	@Autowired
	private WmsBaseEmployeeMapper employeeMapper;
	
	@Autowired
	private WmsExorderLogMapper exorderLogMapper;
	
	@Override
	public Map<String, Object> findExorderById(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//通过id查询出库单信息
			WmsExorder exorder = exorderMapper.selectByPrimaryKey(id);
			//把出库单信息存储到map中返回
			resultMap.put("data", exorder);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> findExorders(WmsExorder exorder, PageBean pageBean) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//获取example
			WmsExorderExample exorderExample = new WmsExorderExample();
			//通过criteria构建查询条件
			WmsExorderExample.Criteria criteria = exorderExample.createCriteria();
			//查询结果可能为多条
			List<WmsExorder> wmsExorders = new ArrayList<WmsExorder>();
			//定义查询信息
			if(exorder!=null) {
				//出库单编号添加到查询条件中
				if (exorder.getExorderNumber()!=null&&(exorder.getExorderNumber().length()>0)) {
					criteria.andExorderNumberEqualTo(exorder.getExorderNumber());
				}
				if(exorder.getCustomername()!=null&&exorder.getCustomername().length()>0) {
					criteria.andCustomernameLike("%"+exorder.getCustomername()+"%");
				}
				//出库时间范围添加到查询条件中
				if(exorder.getStartTime()!=null&&exorder.getEndTime()!=null) {
					//查询日期在xx-xx之间的
					criteria.andExdateBetween((Date)exorder.getStartTime(), (Date)exorder.getEndTime());
				}else if(exorder.getStartTime()!=null) {
					criteria.andExdateGreaterThan((Date)exorder.getStartTime());
				}else if(exorder.getEndTime()!=null) {
					criteria.andExdateLessThan((Date)exorder.getEndTime());
				}
				// new String(xxx.getBytes("iso-8859-1"), "utf-8");处理乱码信息
				if(exorder.getOrderBy()!=null&&exorder.getOrderBy().equalsIgnoreCase("exorderId"))
					exorderExample.setOrderByClause("Exorder_ID "+exorder.getSortOrder());
			}
			//获取查询总记录数
			Integer totalCount = exorderMapper.countByExample(exorderExample);
			//如果查到记录了则..
			if (null != totalCount && totalCount > 0) {
				//页面信息反射到查询条件里
				pageBean.setPageParam(exorderExample);
				//根据之前构造的查询条件来查询记录
				wmsExorders =  exorderMapper.selectExordersByExample(exorderExample);
				//把记录总数和数据存到pagebean中
				pageBean.setTotalCount(totalCount);
				pageBean.setData(wmsExorders);
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
	public Map<String, Object> addExorder(WmsExorder exorder) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			int result = 0;
			//如果有id不为空
			if(exorder.getExorderId()!=null) {
				//根据id去查找出库单，
				WmsExorder wmsExorder = exorderMapper.selectByPrimaryKey(exorder.getExorderId());
				if(wmsExorder!=null) {
					//如果Exorder存在，则说明记录以及存在不能再插入
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_EXISTED_DATA);
					resultMap.put("errmsg", "数据已存在，不能新增加数据");
				}else {
					//如果Exorder=null则说明记录不存在可以插入
					result = exorderMapper.insert(exorder);
				}
			}
			else{
				//如果没有id属性则直接插入
				result = exorderMapper.insert(exorder);

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
	public Map<String, Object> updateExorder(WmsExorder exorder, WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//如果没有提供主键则无法进行更新操作
			if(exorder.getExorderId()==null) {
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_PRIMARY_KEY);
				resultMap.put("errmsg", "没有主键无法进行更新操作");
			}else {
				WmsExorder preExorder = exorderMapper.selectByPrimaryKey(exorder.getExorderId());
				int result = exorderMapper.updateByPrimaryKey(exorder);
				addExorderLog(preExorder, exorder, employee);
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
	public Map<String, Object> deleteExorderById(Integer id, WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			WmsExorder exorder = exorderMapper.selectByPrimaryKey(id);
			if (exorder==null) {
				//如果不存在，则不能删除
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
				resultMap.put("errmsg", "数据不存在不能删除");
			}else {
				int result = exorderMapper.deleteByPrimaryKey(id);
				addExorderLog(exorder, null, employee);
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
	public Map<String, Object> deleteExorders(Integer[] ids, WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//循环遍历
			for(int i = 0;i<ids.length;i++) {
				WmsExorder exorder = exorderMapper.selectByPrimaryKey(ids[i]);
				if (exorder==null) {
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
					resultMap.put("errmsg", "数据不存在不能删除");
					break;
				}else {
					int result = exorderMapper.deleteByPrimaryKey(ids[i]);
					addExorderLog(exorder, null, employee);
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
	public Map<String, Object> addExorderLog(WmsExorder preExorder, WmsExorder afterExorder, WmsBaseEmployee employee)
			throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//log表添加记录
			WmsExorderLog wmsExorderLog = new WmsExorderLog();
			String preStr = null;
			String afterStr = null;
			if(preExorder!=null||afterExorder!=null) {
				if(preExorder!=null&&preExorder.getExorderId()!=null) {
					//设置exorderlog的exorderid的值
					wmsExorderLog.setExorderId(preExorder.getExorderId());
					//记录exorder更新前的状态
					preStr = JSONObject.fromObject(preExorder).toString();
				}
				if (afterExorder!=null&&afterExorder.getExorderId()!=null) {
					//设置explanlog的explanid值
					wmsExorderLog.setExorderId(afterExorder.getExorderId());
					afterStr = JSONObject.fromObject(afterExorder).toString();
				}
				if(wmsExorderLog.getExorderId()==null||employee==null||employee.getEmployeeId()==null) {
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
			wmsExorderLog.setExorderPremodifiedstate(preStr);
			wmsExorderLog.setExorderModifiedstate(afterStr);
			wmsExorderLog.setEmployeeId(employeeId);
			
			wmsExorderLog.setModifyman(employeeName);
			wmsExorderLog.setModifeddate(modifieddate);
			exorderLogMapper.insert(wmsExorderLog);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	@Override
	public Map<String, Object> findAllShipper() throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//使用Mapper根据id查找
			List<WmsBaseShipper> shippers = shipperMapper.selectByExample(null);
			resultMap.put("data", shippers);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> findAllStorehouse() throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//使用Mapper根据id查找
			List<WmsStorehouse> storehouses = storehouseMapper.selectByExample(null);
			resultMap.put("data", storehouses);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	
	@Override
	public Map<String, Object> findAllServiceInfo() throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//使用Mapper根据id查找
			List<WmsBaseEmployee> employees = employeeMapper.selectByExample(null);
			resultMap.put("data", employees);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	//设置返回map 的默认值
	public Map<String,Object> getResultMap(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("errcode", 0);
		map.put("errmsg", "ok");
		map.put("data", "");
		return map;
	}




}
