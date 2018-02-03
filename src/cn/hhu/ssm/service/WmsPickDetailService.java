package cn.hhu.ssm.service;

import java.util.Map;

import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsPickdetail;


public interface WmsPickDetailService {
	//查询拣货明细
	public Map<String, Object> findPickDetailById(Integer id) throws Exception;
	
	//根据出库明细查询拣货明细
	public Map<String, Object> findPickDetailByDetailId(Integer exdetailId,PageBean pageBean) throws Exception;
	//添加拣货明细
	public Map<String, Object> addPickDetail(WmsPickdetail wmsPickDetail) throws Exception;
	
	//修改拣货明细
	public Map<String, Object> updatePickDetail(WmsPickdetail wmsPickDetail, WmsBaseEmployee employee) throws Exception;
	
	//删除拣货明细
//	public Map<String, Object> deletePickDetailById(Integer id, WmsBaseEmployee employee) throws Exception;
	
	//批量删除拣货明细
//	public Map<String, Object> deleteAllPickDetail(Integer[] ids,WmsBaseEmployee employee) throws Exception;
	
	//拣货明细log表增加记录
	//public Map<String, Object> addPickDetailLog(WmsPickdetail prePickdetail, WmsPickdetail afterPickdetail, WmsBaseEmployee employee)throws Exception;

}
