package cn.hhu.ssm.test;


import java.util.Date;

import java.util.Map;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsExplan;
import cn.hhu.ssm.service.WmsExplanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-dao.xml",
		"classpath*:spring/applicationContext-service.xml",
		"classpath*:spring/applicationContext-transaction.xml",
		"classpath*:springmvc.xml",
		"classpath*:sqlMapConfig.xml",
		"classpath*:mybatis/sqlMapConfig.xml"
}) 
public class ExplanTest {
	@Autowired
	private WmsExplanService explanService;
//	@Test
//	public void testexplan() throws Exception {
///*		WmsExplan wmsExplan = new WmsExplan();
//		wmsExplan.setBusinesstype(1);
//		wmsExplan.setCustomerId(1);
//		wmsExplan.setCustomername("周杰伦");
//		wmsExplan.setExdate(new Date());
//		*/
//		WmsExplanServiceImpl explanService = new WmsExplanServiceImpl();
//		Map<String,Object> map = explanService.findExplanById(9);
//		WmsExplan explan = (WmsExplan) map.get("data");
//		System.out.println(explan.getCustomername());
//	}
	@Test
	public void testLog() throws Exception{
		
		WmsExplan wmsExplanPre = new WmsExplan();
		wmsExplanPre.setExplanId(1);
		wmsExplanPre.setBusinesstype(1);
		wmsExplanPre.setCustomerId(1);
		wmsExplanPre.setCustomername("周杰伦");
		wmsExplanPre.setExdate(new Date());
		
		WmsExplan wmsExplanAfter = new WmsExplan();
		wmsExplanAfter.setExplanId(1);
		wmsExplanAfter.setBusinesstype(3);
		wmsExplanAfter.setCustomerId(3);
		wmsExplanAfter.setCustomername("杰伦周");
		wmsExplanAfter.setExdate(new Date());
		
		WmsBaseEmployee employee = new WmsBaseEmployee();
		employee.setEmployeeId(123);
		employee.setName("香蕉皮");
//		Map<String, Object> map = explanService.addExplanLog(wmsExplanPre, null, employee );
//		Map<String, Object> map = explanService.addExplanLog(null, wmsExplanAfter, employee );
//		Map<String, Object> map = explanService.addExplanLog(wmsExplanPre, wmsExplanAfter, null );
		Map<String, Object> map = explanService.addExplanLog(wmsExplanPre, wmsExplanAfter, employee );
		String msg = (String) map.get("errmsg");
		System.out.println(msg);
		
		
	}
	
	@Test
	public void testPage() throws Exception{
		
		
	}
	
	
	
	
	
}
