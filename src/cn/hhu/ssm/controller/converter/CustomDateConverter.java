package cn.hhu.ssm.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class CustomDateConverter implements Converter<String,Date>{

	
	@Override
	public Date convert(String source) {
		// 实现将日期字符串转换成日期类型（格式是yyyy-MM--dd HH:mm:ss）
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return source.length()>0?simpleDateFormat.parse(source):null;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//如果参数转换失败就返回空，绑定参数也就为空
		return null;
	}

}
