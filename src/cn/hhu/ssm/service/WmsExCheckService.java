package cn.hhu.ssm.service;

import java.util.Map;

import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExcheck;

public interface WmsExCheckService {
	//查询出库复核
	public Map<String, Object> findExcheckById(Integer id) throws Exception;
	
	//批量查询出库复核
	public Map<String, Object> findExcheckByCriteria(WmsExcheck wmsExcheck,PageBean pageBean) throws Exception;
	
	//添加出库复核
	public Map<String, Object> addExcheck(WmsExcheck wmsExcheck) throws Exception;
	
	//修改出库复核
	public Map<String, Object> updateExcheck(WmsExcheck wmsExcheck,WmsBaseEmployee employee) throws Exception;
	
	//删除出库复核
	public Map<String, Object> deleteExcheckById(Integer id,WmsBaseEmployee employee) throws Exception;
	
	//批量删除出库复核
	public Map<String, Object> deleteAllExcheck (Integer[] ids,WmsBaseEmployee employee) throws Exception;
	
	//出库复核log表增加记录
	public Map<String, Object> addExcheckLog(WmsExcheck preExcheck,WmsExcheck afterExcheck,WmsBaseEmployee employee);
	
	
}
