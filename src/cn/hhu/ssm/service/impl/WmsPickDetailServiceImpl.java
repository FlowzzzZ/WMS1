package cn.hhu.ssm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.hhu.ssm.common.Code;
import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.mapper.WmsPickdetailMapper;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExplan;
import cn.hhu.ssm.po.WmsExplanExample;
import cn.hhu.ssm.po.WmsPickdetail;
import cn.hhu.ssm.po.WmsPickdetailExample;
import cn.hhu.ssm.service.WmsPickDetailService;

public class WmsPickDetailServiceImpl implements WmsPickDetailService {
	@Autowired
	private WmsPickdetailMapper wmsPickDetailMapper;
	@Override
	public Map<String, Object> findPickDetailById(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//使用wmsPickDetailMapper根据id查找
			WmsPickdetail wmsPickDetail = wmsPickDetailMapper.selectByPrimaryKey(id);
			resultMap.put("data", wmsPickDetail);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> addPickDetail(WmsPickdetail wmsPickDetail) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			int result = 0;
			//如果有id不为空
			if(wmsPickDetail.getPickdetailId()!=null){
				//根据id去查找拣货明细
				WmsPickdetail detail = wmsPickDetailMapper.selectByPrimaryKey(wmsPickDetail.getPickdetailId());
				if(detail!=null){
					//如果detail存在 则说明记录存在不能进行插入操作
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_EXISTED_DATA);
					resultMap.put("errmsg", "数据已存在，不能新增加数据");
				}else {
					//如果detail=null则说明记录不存在可以插入
					result = wmsPickDetailMapper.insert(wmsPickDetail);
				}
			}
			else{
				//如果没有id属性则直接插入
				result = wmsPickDetailMapper.insert(wmsPickDetail);
			}
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> updatePickDetail(WmsPickdetail wmsPickDetail, WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//如果没有提供主键则无法进行更新操作
			if(wmsPickDetail.getPickdetailId()==null){
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_PRIMARY_KEY);
				resultMap.put("errmsg", "没有主键无法进行更新操作");
			}else{
				int rusult = wmsPickDetailMapper.updateByPrimaryKey(wmsPickDetail);
			}
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	@Override
	public Map<String, Object> findPickDetailByDetailId(Integer exdetailId,PageBean pageBean) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//通过criteria构建查询条件
			WmsPickdetailExample pickdetailExample = new WmsPickdetailExample();
			WmsPickdetailExample.Criteria criteria = pickdetailExample.createCriteria();
			//查询的出库计划可能为多条
			List<WmsPickdetail> wmsPickdetails = new ArrayList<WmsPickdetail>();
			criteria.andDetailIdEqualTo(exdetailId);
			//获取查询总记录数
			Integer totalCount = wmsPickDetailMapper.countByExample(pickdetailExample);
			//如果查到记录了则..
			if (null != totalCount && totalCount > 0) {
				//页面信息反射到查询条件里
				pageBean.setPageParam(pickdetailExample);
				//根据之前构造的查询条件来查询记录
				wmsPickdetails =  wmsPickDetailMapper.selectByExample(pickdetailExample);
				//把记录总数和数据存到pagebean中
				pageBean.setTotalCount(totalCount);
				pageBean.setData(wmsPickdetails);
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
	
	public Map<String,Object> getResultMap(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("errcode", 0);
		map.put("errmsg", "ok");
		map.put("data", "");
		return map;
	}



}
