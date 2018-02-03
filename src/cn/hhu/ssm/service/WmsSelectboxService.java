package cn.hhu.ssm.service;

import java.util.Map;

import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsSelectbox;

public interface WmsSelectboxService {
	//查询选箱
	public Map<String, Object> findSelectboxById(Integer id) throws Exception;
	
	//添加选箱
	public Map<String, Object> addSelectbox(WmsSelectbox wmsSelectBox) throws Exception;
	
	//修改选箱
	public Map<String, Object> updateSelectbox(WmsSelectbox wmsSelectbox,WmsBaseEmployee employee) throws Exception;
	
	//删除选箱
	public Map<String, Object> deleteSelectboxById(Integer id,WmsBaseEmployee employee) throws Exception;
	
	//批量删除选箱
	public Map<String, Object> deleteAllSelectbox(Integer[] ids,WmsBaseEmployee employee) throws Exception;
	
	//选箱log表增加记录
	public Map<String, Object> addSelectboxLog(WmsSelectbox preSelectbox, WmsSelectbox afterSelectbox,WmsBaseEmployee employee) throws Exception;
	
	
}
