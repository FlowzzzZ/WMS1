package cn.hhu.ssm.controller;


import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

import cn.hhu.ssm.common.CodeUtil;
import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExplan;
import cn.hhu.ssm.service.WmsExplanService;

@Controller
//为了对url进行管理，在这里添加根路径，实际请求url为跟路径加子路径，下面配置的@RequestMapping("。。。")
@RequestMapping("/WmsExplan")
public class WmsExplanController extends BaseController{
	private static int num = 1;
	
	@Autowired
	private WmsExplanService explanService;
	
	@RequestMapping("/queryExplanById")
	@ResponseBody
	public Map<String, Object> queryExplanById(@RequestBody @RequestParam(value="id",required=true)Integer explan_id) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		try {
			//出库计划
			resultMap = explanService.findExplanById(explan_id);
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	//查询所有的出库计划
	@RequestMapping("/queryAllExplan")
	@ResponseBody
	public  Map<String, Object> queryAllExplan(@RequestBody WmsExplan explan,
			@RequestParam(required = false) Integer page
			) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		try {
			page = explan.getPage();
			Integer pageSize = explan.getPageSize();
			//
			WmsExplan wmsExplan = new WmsExplan();
			wmsExplan.setOrderBy(explan.getOrderBy());
			wmsExplan.setSortOrder(explan.getSortOrder());
			resultMap = explanService.findExplanByCriteria(wmsExplan,getPageBean(page,pageSize));
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	
	//实现模糊查询出库计划
	@RequestMapping("/queryExplanByCriteria")
	@ResponseBody
	public Map<String, Object> queryExplanByCriteria(HttpServletRequest request ,
			@RequestBody WmsExplan explan ,
			@RequestParam(required = false) Integer page
			) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		/*if(explan.getCustomername()!=null) {
		System.out.println(explan.getCustomername());
		}*/
//		System.out.println(explan.getCustomernumber());
		
		page = explan.getPage();
		Integer pageSize = explan.getPageSize();

		try {
			//模糊查询出库计划
			resultMap = explanService.findExplanByCriteria(explan,getPageBean(page, pageSize));
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}	

	//新增出库计划
	@RequestMapping("/addExplan")
	@ResponseBody
	public Map<String, Object> addExplan(HttpServletRequest request, @RequestBody WmsExplan wmsExplan) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		try {
			//设置出库计划编号
			wmsExplan.setExplanNumber(CodeUtil.getNumber());
			resultMap = explanService.addExplan(wmsExplan);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	//删除出库计划
	@RequestMapping("/deleteExplan")
	@ResponseBody
	public Map<String, Object> deleteExplan(HttpServletRequest request, Integer id) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		//没有做登录，先假设获取登录信息
		WmsBaseEmployee employee = getEmployee();
		try {
			resultMap = explanService.deleteExplanById(id,employee);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
		
	}
	//批量删除出库计划
	@RequestMapping("/deleteExplans")
	@ResponseBody
	public Map<String, Object> deleteExplans(HttpServletRequest request,
			String explanIds) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		System.out.println(explanIds);
		//没有做登录，先假设获取登录信息
		WmsBaseEmployee employee = getEmployee();
		
		String[] ids = explanIds.split(",");
		Integer[] intIds = new Integer[ids.length];
		for(int i  = 0 ;i < ids.length ;i++) {
			intIds[i] = Integer.valueOf(ids[i]);
		}
		try {
			resultMap = explanService.deleteAllExplan(intIds,employee);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
		
	}
	//修改出库计划
	@RequestMapping("/editExplan")
	@ResponseBody
	public Map<String, Object> editExplan(HttpServletRequest request, @RequestBody WmsExplan explan) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		//没有做登录，先假设获取登录信息
		WmsBaseEmployee employee = getEmployee();
		try {
			resultMap = explanService.updateExplan(explan, employee);
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	//查询所有货主信息，用于展示到页面下拉框，供新增出库计划时选择
	@RequestMapping("/queryAllShipper")
	@ResponseBody
	public Map<String, Object> queryAllShipper(HttpServletRequest request) throws Exception{
		Map<String, Object> resultMap = getResultMap();
	
		try {
			resultMap = explanService.findAllShipper();
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	
	
	
	
	
	//跳转到新增出库计划页面
	@RequestMapping("/toAddExplanPage")
	public ModelAndView  toAddExplanPage(HttpServletRequest request)throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("explan/editExplan");
		return modelAndView;
	}
	
	//跳转到新增出库计划页面
	@RequestMapping("/toExplanListPage")
	public ModelAndView toExplanListPage(HttpServletRequest request)throws Exception{
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("explan/explanList");
		return modelAndView;
	}
	//跳转到编辑出库计划页面
	@RequestMapping("/toEditExplanPage")
	public ModelAndView  toEditExplanPage(HttpServletRequest request)throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		String id = request.getParameter("id");
		Integer explanId = Integer.parseInt(id);
		modelAndView.addObject("id",explanId);
		modelAndView.setViewName("explan/editExplan");
		return modelAndView;
	}
	//由于还没有实现登录注册，先用此方法获取employee传到后台，之后登录注册完成之后再修改
	public WmsBaseEmployee getEmployee() {
		WmsBaseEmployee employee = new WmsBaseEmployee();
		employee.setEmployeeId(100);
		employee.setName("zyk");
		return employee;
		
	}
	
}
