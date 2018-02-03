package cn.hhu.ssm.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExhistory;
import cn.hhu.ssm.service.WmsExhistoryService;

@Controller
//为了对url进行管理，在这里添加根路径，实际请求url为跟路径加子路径，下面配置的@RequestMapping("。。。")
@RequestMapping("/WmsExhistory")
public class WmsExhistoryController extends BaseController {
	@Autowired
	private WmsExhistoryService exhistoryService;
	@RequestMapping("/queryExhistoryById")
	@ResponseBody
	public Map<String, Object> queryExhistoryById(@RequestBody @RequestParam(value="id",required=true)Integer exhistory_id) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		try {
			//根据id查询出库历史
			resultMap = exhistoryService.findExhistoryById(exhistory_id);
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	
	//查询所有的出库历史
	@RequestMapping("/queryAllExhistory")
	@ResponseBody
	public  Map<String, Object> queryAllExhistory(HttpServletRequest request,
			@RequestParam(required = true) Integer page ,
			@RequestParam(required = false) Integer pageSize
			) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		try {
			resultMap = exhistoryService.findExhistoryByCriteria(null,getPageBean(page,pageSize));
				
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	//实现模糊查询出库历史
	@RequestMapping("/queryExhistoryByCriteria")
	@ResponseBody
	public Map<String, Object> queryExhistoryByCriteria(HttpServletRequest request ,
			@RequestBody WmsExhistory exhistory,
			@RequestParam(required = true) Integer page ,
			@RequestParam(required = false) Integer pageSize
			) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		/*if(exhistory.getCustomername()!=null) {
		System.out.println(exhistory.getCustomername());
		}*/
		try {
			//模糊查询出库历史
			resultMap = exhistoryService.findExhistoryByCriteria(exhistory,getPageBean(page, pageSize));
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}		
	//新增出库历史
	@RequestMapping("/addExhistory")
	@ResponseBody
	public Map<String, Object> addExhistory(HttpServletRequest request, @RequestBody WmsExhistory wmsExhistory) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		try {
			resultMap = exhistoryService.addExhistory(wmsExhistory);
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
	
}
