package cn.hhu.ssm.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.hhu.ssm.common.CodeUtil;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExorder;
import cn.hhu.ssm.po.WmsExplan;
import cn.hhu.ssm.service.WmsExorderService;
import cn.hhu.ssm.service.WmsExplanService;

@Controller
//为了对url进行管理，在这里添加根路径，实际请求url为跟路径加子路径，下面配置的@RequestMapping("。。。")
@RequestMapping("/WmsExorder")
public class WmsExorderController extends BaseController {
	@Autowired
	private WmsExorderService exorderService;
	@Autowired
	private WmsExplanService explanService;
	@RequestMapping("/queryExorderById")
	@ResponseBody
	public Map<String, Object> queryExorderById(@RequestBody @RequestParam(value="id",required=true)Integer exorder_id) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		try {
			//出单
			resultMap = exorderService.findExorderById(exorder_id);
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	
	//查询所有的出库单
	@RequestMapping("/queryAllExorder")
	@ResponseBody
	public  Map<String, Object> queryAllExorder(@RequestBody WmsExorder exorder,
			@RequestParam(required = false) Integer page
			) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		try {
			page = exorder.getPage();
			Integer pageSize = exorder.getPageSize();
			//
			WmsExorder wmsExorder = new WmsExorder();
			wmsExorder.setOrderBy(exorder.getOrderBy());
			wmsExorder.setSortOrder(exorder.getSortOrder());
			
			
			resultMap = exorderService.findExorders(wmsExorder,getPageBean(page,pageSize));
				
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	//实现根据出库单编号，出库日期模糊查询出库单
	@RequestMapping("/queryExorderByCriteria")
	@ResponseBody
	public Map<String, Object> queryExorderByCriteria(HttpServletRequest request ,
			@RequestBody WmsExorder exorder,
			@RequestParam(required = true) Integer page ,
			@RequestParam(required = false) Integer pageSize
			) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		/*if(exorder.getCustomername()!=null) {
		System.out.println(exorder.getCustomername());
		}*/
		try {
			//模糊查询出库单
			resultMap = exorderService.findExorders(exorder,getPageBean(page, pageSize));
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	//根据出库计划生成出库单
	@RequestMapping("/addExorderByExplan")
	@ResponseBody
	public Map<String, Object> addExorderByExplan(HttpServletRequest request, 
			@RequestBody @RequestParam(value="id",required=true)Integer id
			) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		WmsExplan wmsExplan = new WmsExplan();
		WmsExorder wmsExorder = new WmsExorder();
		System.out.println(id);
		try {
			wmsExplan = (WmsExplan) explanService.findExplanById(id).get("data");
			if(wmsExplan.getExplanNumber()!=null) {
				wmsExorder.setExorderNumber("O"+wmsExplan.getExplanNumber());
			}else {
				//设置出库单编号
				String orderNumber = "O"+CodeUtil.getNumber();
				wmsExorder.setExorderNumber(orderNumber);
			}
			//设置出库单的详细信息
			wmsExorder.setShipperId(wmsExplan.getShipperId());
			wmsExorder.setPlanId(wmsExplan.getExplanId());
			wmsExorder.setCustomerId(wmsExplan.getCustomerId());
			wmsExorder.setCustomername(wmsExplan.getCustomername());
			wmsExorder.setFromaddress(wmsExplan.getFromaddress());
			wmsExorder.setToaddress(wmsExplan.getToaddress());
			wmsExorder.setExdate(wmsExplan.getExdate());
			wmsExorder.setBusinesstype(wmsExplan.getBusinesstype());
			wmsExorder.setIsbonded(wmsExplan.getIsbonded());
			wmsExorder.setStoragetransportationrequirement(wmsExplan.getStoragetransportationrequirement());
			wmsExorder.setIssupervision(wmsExplan.getIssupervision());
			wmsExorder.setCustomernumber(wmsExplan.getCustomernumber());
			wmsExorder.setServiceId(wmsExplan.getServiceId());
			wmsExorder.setContactman(wmsExplan.getContactman());
			wmsExorder.setContacttel(wmsExplan.getContacttel());
			wmsExorder.setExstatus(wmsExplan.getPlanstatus());
			//备注，制单日期，制单人，。。。
			wmsExorder.setRemark(wmsExplan.getRemark());
			wmsExorder.setMakeorderdate(wmsExplan.getMakeorderdate());
			wmsExorder.setStorehouseId(wmsExplan.getStorehouseId());
			wmsExorder.setExpresscompany(wmsExplan.getExpress());
			wmsExorder.setShippingmethod(wmsExplan.getShippingmethod());
			wmsExorder.setClearingform(wmsExplan.getClearingform());
			wmsExorder.setExpressnumber(wmsExplan.getExpressnumber());
			resultMap = exorderService.addExorder(wmsExorder);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	
	
	//新增出库单
	@RequestMapping("/addExorder")
	@ResponseBody
	public Map<String, Object> addExorder(HttpServletRequest request, @RequestBody WmsExorder wmsExorder) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		
		try {

			String orderNumber = "O"+CodeUtil.getNumber();
			wmsExorder.setExorderNumber(orderNumber);
			
			
			resultMap = exorderService.addExorder(wmsExorder);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	//删除出库单
	@RequestMapping("/deleteExorder")
	@ResponseBody
	public Map<String, Object> deleteExorder(HttpServletRequest request, Integer id) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		//没有做登录，先假设获取登录信息
		WmsBaseEmployee employee = getEmployee();
		try {
			resultMap = exorderService.deleteExorderById(id,employee);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
		
	}	
	//批量删除出库计划
	@RequestMapping("/deleteExorders")
	@ResponseBody
	public Map<String, Object> deleteExorders(HttpServletRequest request, String exorderIds) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		
		//没有做登录，先假设获取登录信息
		WmsBaseEmployee employee = getEmployee();
		
		String[] ids = exorderIds.split(",");
		Integer[] intIds = new Integer[ids.length];
		for(int i  = 0 ;i < ids.length ;i++) {
			intIds[i] = Integer.valueOf(ids[i]);
		}
		try {
			resultMap = exorderService.deleteExorders(intIds,employee);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
		
	}
	//修改出库单
	@RequestMapping("/editExorder")
	@ResponseBody
	public Map<String, Object> editExorder(HttpServletRequest request, @RequestBody WmsExorder exorder) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		//没有做登录，先假设获取登录信息
		WmsBaseEmployee employee = getEmployee();
		try {
			resultMap = exorderService.updateExorder(exorder, employee);
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	
	
	/*
	 * 查询相关信息用于形成页面下拉框等等
	 * 
	 * */
	//查询所有货主信息，用于展示到页面下拉框，供新增出库单时选择
	@RequestMapping("/queryAllShipper")
	@ResponseBody
	public Map<String, Object> queryAllShipper(HttpServletRequest request) throws Exception{
		Map<String, Object> resultMap = getResultMap();
	
		try {
			resultMap = exorderService.findAllShipper();
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}	
	//查询所有仓库信息，用于展示到页面下拉框，供新增出库单时选择
	@RequestMapping("/queryAllStorehouse")
	@ResponseBody
	public Map<String, Object> queryAllStorehouse(HttpServletRequest request) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		
		try {
			resultMap = exorderService.findAllStorehouse();
				
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}	
	//查询出客服信息（id和name）用于展示到新增页面的下拉框
	@RequestMapping("/queryAllServiceInfo")
	@ResponseBody
	public Map<String, Object> queryAllServiceInfo(HttpServletRequest request) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		
		try {
			resultMap = exorderService.findAllServiceInfo();
				
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}	
	
	
	
	//由于还没有实现登录注册，先用此方法获取employee传到后台，之后登录注册完成之后再修改
	public WmsBaseEmployee getEmployee() {
		WmsBaseEmployee employee = new WmsBaseEmployee();
		employee.setEmployeeId(100);
		employee.setName("zyk");
		return employee;
		
	}
	//跳转到编辑出库单页面
	@RequestMapping("/toEditExorderPage")
	public ModelAndView  toEditExplanPage(HttpServletRequest request)throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		String id = request.getParameter("id");
		Integer exorderId = Integer.parseInt(id);
		modelAndView.addObject("id",exorderId);
		modelAndView.setViewName("exorder/editExorder");
		return modelAndView;
	}
	//跳到新增出库单界面
	@RequestMapping("/toAddExorderPage")
	public ModelAndView toAddExorderPage(HttpServletRequest request)throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("exorder/editExorder");
		return modelAndView;
	}
	//调到操作页面
	@RequestMapping("/toExorderListPage")
	public ModelAndView toExordersListPage(HttpServletRequest request)throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("exorder/exoperation");
		return modelAndView;
	}
	
}
