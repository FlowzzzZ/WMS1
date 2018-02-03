package cn.hhu.ssm.service;

import java.util.Map;

import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExhistory;

public interface WmsExhistoryService {
	//查询出库历史
	public Map<String, Object> findExhistoryById(Integer id) throws Exception;
	//批量查询出库历史
	public Map<String, Object> findExhistoryByCriteria(WmsExhistory wmsExhistory,PageBean pageBean) throws Exception;
	//添加出库历史
	public Map<String, Object> addExhistory(WmsExhistory wmsExhistory)throws Exception;
	
}
