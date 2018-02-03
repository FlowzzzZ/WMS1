package cn.hhu.ssm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

import cn.hhu.ssm.common.PageBean;


/**
 * Controller基类
 * @author Administrator
 *
 */
public class BaseController {
	
//	@Value("${page.size}")
	private String page_size="10";
	
	public PageBean getPageBean(){
		PageBean pageBean = new PageBean();
		pageBean.setPageSize(Integer.valueOf(page_size));
		return pageBean;
	}
	
	public PageBean getPageBean(Integer page){
		PageBean pageBean = new PageBean();
		if (null != page && page > 0) {
			pageBean.setPage(page);
		}
		return pageBean;
	}
	
	public PageBean getPageBean(Integer page,Integer pageSize){
		if (null == page && null == pageSize) {
			return getPageBean();
		}
		PageBean pageBean = getPageBean(page);
		if (null != pageSize && pageSize > 0) {
			pageBean.setPageSize(pageSize);
		} else {
			pageBean.setPageSize(Integer.valueOf(page_size));
		}
		return pageBean;
	}
	
	public Map<String,Object> getResultMap(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("errcode", 0);
		map.put("errmsg", "ok");
		map.put("data", "");
		return map;
	}
}
