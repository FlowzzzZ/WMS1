package cn.hhu.ssm.service;

import java.util.Map;

import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExorder;

public interface WmsExorderService {
	//查询出库单信息
	public Map<String, Object> findExorderById(Integer id) throws Exception;
	
	//批量查询出库单
	public Map<String, Object> findExorders(WmsExorder exorder,PageBean pageBean) throws Exception;
	
	//添加出库单
	public Map<String, Object> addExorder(WmsExorder exorder) throws Exception;
	
	//修改出库单
	public Map<String, Object> updateExorder(WmsExorder exorder, WmsBaseEmployee employee) throws Exception;
	
	//删除出库单
	public Map<String, Object> deleteExorderById(Integer id,WmsBaseEmployee employee) throws Exception;
	
	//批量删除出库单
	public Map<String, Object> deleteExorders(Integer[] ids,WmsBaseEmployee employee) throws Exception;
	
	//向log表添加记录
	public Map<String, Object> addExorderLog(WmsExorder preExorder,WmsExorder afterExorder, WmsBaseEmployee employee) throws Exception;
	
	//查询所有货主信息，用于展示到页面下拉框，供新增出库单时选择
	public Map<String, Object> findAllShipper() throws Exception;
	
	//查询所有仓库信息，用于展示到页面下拉框，供新增出库单时选择
	public Map<String, Object> findAllStorehouse() throws Exception;

	public Map<String, Object> findAllServiceInfo() throws Exception;
	
}
