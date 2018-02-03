package cn.hhu.ssm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import cn.hhu.ssm.common.Code;
import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.mapper.WmsStockMapper;
import cn.hhu.ssm.mapper.WmsStockcountMapper;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExorderExample.Criteria;
import cn.hhu.ssm.po.WmsExplan;
import cn.hhu.ssm.po.WmsStock;
import cn.hhu.ssm.po.WmsStockExample;
import cn.hhu.ssm.po.WmsStockcount;
import cn.hhu.ssm.po.WmsStockcountExample;

public class WmsStockServiceImpl implements cn.hhu.ssm.service.WmsStockService {
	@Autowired
	private WmsStockMapper wmsStockMapper;
	
	@Autowired
	private WmsStockcountMapper wmsStockcountMapper;
	
	@Override
	public Map<String, Object> findStockCountByGoodsId(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			WmsStockcountExample stockcountExample = new WmsStockcountExample();
			WmsStockcountExample.Criteria criteria = stockcountExample.createCriteria();
			criteria.andGoodsIdEqualTo(id);
			
			//使用wmsStockcountMapper根据goodsid查找
			List<WmsStockcount> stockcounts = wmsStockcountMapper.selectByExample(stockcountExample);
			WmsStockcount stockcount = stockcounts.get(0);
			resultMap.put("data", stockcount);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> findAllStockCount(PageBean pageBean) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		// 查询所有库存统计信息
		try {
			WmsStockcountExample stockcountExample = new WmsStockcountExample();
			WmsStockcountExample.Criteria criteria = stockcountExample.createCriteria();
			
			List<WmsStockcount> stockcounts = new ArrayList<WmsStockcount>();
					
			//获取查询总记录数
			Integer totalCount = wmsStockcountMapper.countByExample(stockcountExample);
			//如果查到记录了则..
			if (null != totalCount && totalCount > 0) {
				//页面信息反射到查询条件里
				pageBean.setPageParam(stockcountExample);
				//根据之前构造的查询条件来查询记录
				stockcounts = wmsStockcountMapper.selectByExample(stockcountExample);
				//把记录总数和数据存到pagebean中
				pageBean.setTotalCount(totalCount);
				pageBean.setData(stockcounts);
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
	public Map<String, Object> findAllStock(PageBean pageBean) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		// 查询所有库存信息
		try {
			WmsStockExample stockExample = new WmsStockExample();
			WmsStockExample.Criteria criteria = stockExample.createCriteria();
			
			List<WmsStock> stocks = new ArrayList<WmsStock>();
					
			//获取查询总记录数
			Integer totalCount = wmsStockMapper.countByExample(stockExample);
			//如果查到记录了则..
			if (null != totalCount && totalCount > 0) {
				//页面信息反射到查询条件里
				pageBean.setPageParam(stockExample);
				//根据之前构造的查询条件来查询记录
				stocks = wmsStockMapper.selectByExample(stockExample);
				//把记录总数和数据存到pagebean中
				pageBean.setTotalCount(totalCount);
				pageBean.setData(stocks);
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
/*
	@Override
	public Map<String, Object> updateStockCount(float abledGoods, WmsBaseEmployee employee) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	//商品名称，商品代码
/*	@Override
	public Map<String, Object> findPickStockCountByStock(WmsStock stock, PageBean pageBean) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}*/
	public Map<String,Object> getResultMap(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("errcode", 0);
		map.put("errmsg", "ok");
		map.put("data", "");
		return map;
	}
}
