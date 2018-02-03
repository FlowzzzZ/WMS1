package cn.hhu.ssm.service;

import java.util.Map;

import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsPackingcontent;


public interface WmsPackingcontentService {
	//查询装箱内容
	public Map<String, Object> findPackingcontentById(Integer id) throws Exception;
	//批量查询装箱内容
	public Map<String, Object> findPackingcontentByCriteria(WmsPackingcontent packingcontent,PageBean pageBean)throws Exception;
	//添加装箱内容
	public Map<String, Object> addPackingcontent(WmsPackingcontent wmspackingcontent) throws Exception;
	//修改装箱内容
	public Map<String, Object> updatePackingcontent(WmsPackingcontent wmsPackingcontent,WmsBaseEmployee employee) throws Exception;
	//删除装箱内容
	public Map<String, Object> deletePackingcontentById(Integer id,WmsBaseEmployee employee) throws Exception;
	//批量删除装箱内容
	public Map<String, Object> deleteAllPackingcontent(Integer[] ids,WmsBaseEmployee employee)throws Exception;
	//装箱内容log表增加记录
	public Map<String, Object> addPackingcontentLog(WmsPackingcontent prePackingcontent, WmsPackingcontent afterPackingcontent, WmsBaseEmployee employee)throws Exception;
}
