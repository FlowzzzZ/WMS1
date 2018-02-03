package cn.hhu.ssm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.hhu.ssm.common.Code;
import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.mapper.WmsExhistoryMapper;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExhistory;
import cn.hhu.ssm.po.WmsExhistoryExample;
import cn.hhu.ssm.service.WmsExhistoryService;

public class WmsExhistoryServiceImpl implements WmsExhistoryService{
	
	@Autowired
	private WmsExhistoryMapper wmsExhistoryMapper;
	@Override
	public Map<String, Object> findExhistoryById(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//使用wmsHistoryMapper来根据id进行查询
			WmsExhistory wmsExhistory = wmsExhistoryMapper.selectByPrimaryKey(id);
			resultMap.put("data", wmsExhistory);
			
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> findExhistoryByCriteria(WmsExhistory wmsExhistory,PageBean pageBean) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//通过criteria构建查询条件
			WmsExhistoryExample exhistoryExample = new WmsExhistoryExample();
			WmsExhistoryExample.Criteria criteria = exhistoryExample.createCriteria();
			List<WmsExhistory> wmsExhistoryList =  new ArrayList<WmsExhistory>();
			String customer = null;
			if(wmsExhistory!=null) {
				//收货客户名称模糊查询条件
				if(wmsExhistory.getReceivingcustomername()!=null) {				
				customer = wmsExhistory.getReceivingcustomername();}

				//如果存在这个查询条件，则把这个查询条件添加到criteria里面
				if(customer!=null&&customer.length()>0)
					criteria.andReceivingcustomernameLike("%"+wmsExhistory.getReceivingcustomername()+"%");
					if(wmsExhistory.getStartTime()!=null&&wmsExhistory.getEndTime()!=null) {
					//查询日期在xx-xx之间的
					criteria.andExdateBetween(wmsExhistory.getStartTime(), wmsExhistory.getEndTime());
				}else if(wmsExhistory.getStartTime()!=null) {
					criteria.andExdateGreaterThan(wmsExhistory.getStartTime());
				}else if(wmsExhistory.getEndTime()!=null) {
					criteria.andExdateLessThan(wmsExhistory.getEndTime());
				}
			}
			//获取查询总记录数
			Integer totalCount = wmsExhistoryMapper.countByExample(exhistoryExample);
			//如果查到了记录则...
			if(null != totalCount && totalCount >0) {
				//页面信息反射到查询条件里
				pageBean.setPageParam(exhistoryExample);
				//根据之前构造的查询条件来查询记录
				wmsExhistoryList = wmsExhistoryMapper.selectByExample(exhistoryExample);
				//把记录总数和数据存在pagebean中
				pageBean.setTotalCount(totalCount);
				pageBean.setData(wmsExhistoryList);
				//把pagebean封装到data中
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
	public Map<String, Object> addExhistory(WmsExhistory wmsExhistory) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			int result = 0;
			if(wmsExhistory.getExhistoryId()!=null) {
				//根据id去查找出库历史
				WmsExhistory exhistory = wmsExhistoryMapper.selectByPrimaryKey(wmsExhistory.getExhistoryId());
				if(exhistory!=null) {
					//如果exhistory存在，则说明记录已经存在不能再插入
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_EXISTED_DATA);
					resultMap.put("errmsg", "数据已存在，不能新增加数据");
				}else {
					//如果exhistory为空则说明记录不存在可以插入
					result = wmsExhistoryMapper.insert(wmsExhistory);
				}
			}else {
				//如果没有id属性则直接执行插入操作
				result = wmsExhistoryMapper.insert(wmsExhistory);
			}
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
