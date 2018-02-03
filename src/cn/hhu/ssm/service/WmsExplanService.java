package cn.hhu.ssm.service;

import java.util.Map;

import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExplan;


public interface WmsExplanService {
	
	//查询出库计划
	public Map<String, Object> findExplanById(Integer id) throws Exception;
	
	//批量查询出库计划
	public Map<String, Object> findExplanByCriteria(WmsExplan explan,PageBean pageBean) throws Exception;
	
	//添加出库计划
	public Map<String, Object> addExplan(WmsExplan wmsExplan) throws Exception;
	
	//修改出库计划
	public Map<String, Object> updateExplan(WmsExplan wmsExplan,WmsBaseEmployee employee) throws Exception;
	
	//删除出库计划
	public Map<String, Object> deleteExplanById(Integer id,WmsBaseEmployee employee) throws Exception;
	
	//批量删除出库计划
	public Map<String, Object> deleteAllExplan(Integer[] ids,WmsBaseEmployee employee) throws Exception;
	
	//出库计划log表增加记录
	public Map<String, Object> addExplanLog(WmsExplan preExplan,WmsExplan afterExplan, WmsBaseEmployee employee)throws Exception;
	
	//批量查询出库计划
	//public Map<String, Object> findExplanByCriteria1(WmsExplanQueryVo explanQueryVo,PageBean pageBean) throws Exception;
	
	//查询所有货主信息，获取货主姓名展示到下拉框,供新增出库计划选择
	public Map<String, Object> findAllShipper() throws Exception;

}
