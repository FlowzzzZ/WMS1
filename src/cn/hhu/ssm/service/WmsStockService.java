package cn.hhu.ssm.service;

import java.util.Map;

import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsStock;

public interface WmsStockService {
	//查找库存统计信息通过商品id
	public Map<String, Object> findStockCountByGoodsId(Integer id) throws Exception;
	
	//查询所有可用库存统计信息
	public Map<String, Object> findAllStockCount(PageBean pageBean) throws Exception;
	
	//查询出出库选货的库存列表
	public Map<String, Object> findAllStock(PageBean pageBean) throws Exception;
	
	//模糊查询出库选货的库存列表，通过商品名称，商品代码
//	public Map<String, Object> findPickStockCountByStock(WmsStock stock, PageBean pageBean) throws Exception;
	
	//更新库存统计信息的可用库存
	//public Map<String, Object> updateStockCount(float abledGoods,WmsBaseEmployee employee) throws Exception;
	

}
