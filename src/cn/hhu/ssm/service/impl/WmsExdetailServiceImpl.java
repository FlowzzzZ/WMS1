package cn.hhu.ssm.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.ant.FindLeaksTask;
import org.springframework.beans.factory.annotation.Autowired;

import cn.hhu.ssm.common.Code;
import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.mapper.WmsExdetailLogMapper;
import cn.hhu.ssm.mapper.WmsExdetailMapper;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExdetail;
import cn.hhu.ssm.po.WmsExdetail;
import cn.hhu.ssm.po.WmsExdetailExample;
import cn.hhu.ssm.po.WmsExdetailLog;
import cn.hhu.ssm.po.WmsExdetail;
import cn.hhu.ssm.po.WmsExdetail;
import cn.hhu.ssm.po.WmsExdetail;
import cn.hhu.ssm.service.WmsExdetailService;
import net.sf.json.JSONObject;

public class WmsExdetailServiceImpl implements WmsExdetailService {
	
	@Autowired
	private WmsExdetailMapper exdetailMapper;
	@Autowired
	private WmsExdetailLogMapper exdetailLogMapper;
	
	//根据出库明细id查询出库明细
	@Override
	public Map<String, Object> findExdetailById(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//使用wmsExdetailMapper根据id查找
			WmsExdetail wmsExdetail = exdetailMapper.selectByPrimaryKey(id);
			resultMap.put("data", wmsExdetail);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	//根据出库单id查询出库明细
	public Map<String, Object> findExdetailByOrderId(Integer id,PageBean pageBean) throws Exception{
		// 根据商品代码，明细的
		Map<String, Object> resultMap = getResultMap();
		try {
			
			//通过criteria构建查询条件
			WmsExdetailExample exdetailExample = new WmsExdetailExample();
			WmsExdetailExample.Criteria criteria = exdetailExample.createCriteria();
			//查询的出库明细可能为多条
			List<WmsExdetail> wmsExdetailList = new ArrayList<WmsExdetail>();
			if(id!=null)
				criteria.andExorderIdEqualTo(id);
			//获取查询总记录数
			Integer totalCount = exdetailMapper.countByExample(exdetailExample);
			//如果查到记录了则..
			if (null != totalCount && totalCount > 0) {
				//页面信息反射到查询条件里
				pageBean.setPageParam(exdetailExample);
				//根据之前构造的查询条件来查询记录
				wmsExdetailList =  exdetailMapper.selectByExample(exdetailExample);
				//把记录总数和数据存到pagebean中
				pageBean.setTotalCount(totalCount);
				pageBean.setData(wmsExdetailList);
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
	
	
	/*@Override
	public Map<String, Object> findExdetailByCriteria(WmsExdetail exdetail, PageBean pageBean) throws Exception {
		// 根据商品代码，明细的
		Map<String, Object> resultMap = getResultMap();
		try {
			
			//通过criteria构建查询条件
			WmsExdetailExample exdetailExample = new WmsExdetailExample();
			WmsExdetailExample.Criteria criteria = exdetailExample.createCriteria();
			//查询的出库明细可能为多条
			List<WmsExdetail> wmsExdetailList = new ArrayList<WmsExdetail>();

			//获取查询总记录数
			Integer totalCount = exdetailMapper.countByExample(exdetailExample);
			//如果查到记录了则..
			if (null != totalCount && totalCount > 0) {
				//页面信息反射到查询条件里
				pageBean.setPageParam(exdetailExample);
				//根据之前构造的查询条件来查询记录
				wmsExdetailList =  exdetailMapper.selectByExample(exdetailExample);
				//把记录总数和数据存到pagebean中
				pageBean.setTotalCount(totalCount);
				pageBean.setData(wmsExdetailList);
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
	}*/
	//增加出库明细
	@Override
	public Map<String, Object> addExdetail(WmsExdetail wmsExdetail) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			int result = 0;
			//如果有id不为空
			if(wmsExdetail.getExdetailId()!=null) {
				//根据id去查找出库计划，
				WmsExdetail exdetail = exdetailMapper.selectByPrimaryKey(wmsExdetail.getExdetailId());
				if(exdetail!=null) {
					//如果exdetail存在，则说明记录以及存在不能再插入
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_EXISTED_DATA);
					resultMap.put("errmsg", "数据已存在，不能新增加数据");
				}else {
					//如果exdetail=null则说明记录不存在可以插入
					result = exdetailMapper.insert(wmsExdetail);
				}
			}
			else{
				//如果没有id属性则直接插入
				result = exdetailMapper.insert(wmsExdetail);
			}
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> updateExdetail(WmsExdetail wmsExdetail, WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//如果没有提供主键则无法进行更新操作
			if(wmsExdetail.getExdetailId()==null) {
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_PRIMARY_KEY);
				resultMap.put("errmsg", "没有主键无法进行更新操作");
			}else {
				
				WmsExdetail preExdetail = exdetailMapper.selectByPrimaryKey(wmsExdetail.getExdetailId());
				int result = exdetailMapper.updateByPrimaryKey(wmsExdetail);
				addExdetailLog(preExdetail, wmsExdetail, employee);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> deleteExdetailById(Integer id, WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//先根据id查找exdetailid对应数据是否存在
			WmsExdetail exdetail = exdetailMapper.selectByPrimaryKey(id);
			if (exdetail==null) {
				//如果不存在，则不能删除
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
				resultMap.put("errmsg", "数据不存在不能删除");
			}else {
				//如果存在则执行删除操作
				int result = exdetailMapper.deleteByPrimaryKey(id);
				addExdetailLog(exdetail, null, employee);
			}
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> deleteAllExdetail(Integer[] ids, WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//循环遍历
			for(int i = 0;i<ids.length;i++) {
				//查找判断是否存在
				WmsExdetail exdetail = exdetailMapper.selectByPrimaryKey(ids[i]);
				if (exdetail==null) {
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
					resultMap.put("errmsg", "数据不存在不能删除");
					break;
				}else {
					int result = exdetailMapper.deleteByPrimaryKey(ids[i]);
					addExdetailLog(exdetail, null, employee);
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
	public Map<String, Object> addExdetailLog(WmsExdetail preExdetail, WmsExdetail afterExdetail,
			WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//log表添加记录
			WmsExdetailLog wmsExdetailLog = new WmsExdetailLog();
			String preStr = null;
			String afterStr = null;
			
			if(preExdetail!=null||afterExdetail!=null) {
				if(preExdetail!=null&&preExdetail.getExdetailId()!=null) {
					//设置exdetaillog的exdetailid值
					wmsExdetailLog.setExdetailId(preExdetail.getExdetailId());
					//记录exdetail更新前的状态
					preStr = JSONObject.fromObject(preExdetail).toString();
				}
				if (afterExdetail!=null&&afterExdetail.getExdetailId()!=null) {
					//设置exdetaillog的exdetailid值
					wmsExdetailLog.setExdetailId(afterExdetail.getExdetailId());
					afterStr = JSONObject.fromObject(afterExdetail).toString();
				}
				if(wmsExdetailLog.getExdetailId()==null||employee==null||employee.getEmployeeId()==null) {
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
			wmsExdetailLog.setExdetailPremodifiedstate(preStr);
			wmsExdetailLog.setExdetailModifiedstate(afterStr);
			wmsExdetailLog.setEmployeeId(employeeId);
			
			wmsExdetailLog.setModifyman(employeeName);
			wmsExdetailLog.setModifieddate(modifieddate);
			exdetailLogMapper.insert(wmsExdetailLog);
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
