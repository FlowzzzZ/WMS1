package cn.hhu.ssm.service;

import java.util.Map;

import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsBox;

public interface WmsBoxService {
	//查询包装箱
	public Map<String, Object> findBoxById(Integer id) throws Exception;
	//批量查询包装箱
	public Map<String, Object> findBoxByCriteria(WmsBox wmsBox,PageBean pageBean) throws Exception;
	//添加包装箱
	public Map<String, Object> addBox(WmsBox wmsBox) throws Exception;
	//删除包装箱
	public Map<String, Object> deleteBoxById(Integer id,WmsBaseEmployee employee)throws Exception;
	//批量删除包装箱
	public Map<String, Object> deleteAllBox(Integer[] ids,WmsBaseEmployee employee) throws Exception;
	//修改包装箱
	public Map<String, Object> updateBox(WmsBox wmsBox,WmsBaseEmployee employee) throws Exception;
	//包装箱log表增加记录
	public Map<String, Object> addBoxLog(WmsBox preBox,WmsBox afterBox,WmsBaseEmployee employee);
}
