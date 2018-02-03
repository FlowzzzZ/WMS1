package cn.hhu.ssm.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hhu.ssm.po.WmsPickGoods;
import cn.hhu.ssm.service.WmsStockService;

@Controller
//为了对url进行管理，在这里添加根路径，实际请求url为跟路径加子路径，下面配置的@RequestMapping("。。。")
@RequestMapping("/WmsExpick")
public class WmsExpickController extends BaseController{
	@Autowired
	private WmsStockService stockService;
	
	@RequestMapping("/queryAllPickGoods")
	@ResponseBody
	public Map<String, Object> queryAllPickGoods(HttpServletRequest request) throws Exception{
		Map<String, Object> resultMap = getResultMap();
		WmsPickGoods pickGoods = new WmsPickGoods();
		try {
			Map<String, Object> stockMap = stockService.findAllStock(getPageBean());
//			Map<String, Object> stockMap = stockService.findAllStockCount(getPageBean());
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		
		return resultMap;
		
	}
	
}
