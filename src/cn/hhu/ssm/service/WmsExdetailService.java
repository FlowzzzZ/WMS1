package cn.hhu.ssm.service;

import java.util.Map;

import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExdetail;

public interface WmsExdetailService {
	//查询出库明细
	public Map<String, Object> findExdetailById(Integer id) throws Exception;
		
	//批量查询出库明细
//	public Map<String, Object> findExdetailByCriteria(WmsExdetail exdetail,PageBean pageBean) throws Exception;
	
	//根据出库单id查询出库明细
	public Map<String, Object> findExdetailByOrderId(Integer id,PageBean pageBean) throws Exception;

	//添加出库明细
	public Map<String, Object> addExdetail(WmsExdetail wmsExdetail) throws Exception;
		
	//修改出库明细
	public Map<String, Object> updateExdetail(WmsExdetail wmsExdetail,WmsBaseEmployee employee) throws Exception;
		
	//删除出库明细
	public Map<String, Object> deleteExdetailById(Integer id,WmsBaseEmployee employee) throws Exception;
		
	//批量删除出库明细
	public Map<String, Object> deleteAllExdetail(Integer[] ids,WmsBaseEmployee employee) throws Exception;
		
	//出库明细log表增加记录
	public Map<String, Object> addExdetailLog(WmsExdetail preExdetail,WmsExdetail afterExdetail, WmsBaseEmployee employee)throws Exception;
	
}
