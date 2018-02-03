package cn.hhu.ssm.service;

import java.util.Map;

import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsBaseUser;

public interface WmsBaseUserService {
	//查询用户
	public Map<String, Object> findUserById(Integer id) throws Exception;
	
	//批量查询用户
	public Map<String, Object> findUserByCriteria(WmsBaseUser wmsUser,PageBean pageBean) throws Exception;
	
	//添加用户
	public Map<String, Object> addUser(WmsBaseUser wmsUser) throws Exception;
	
	//修改用户
	public Map<String, Object> updateUser(WmsBaseUser wmsUser,WmsBaseEmployee employee) throws Exception;
	
	//删除用户
	public Map<String, Object> deleteUserById(Integer id,WmsBaseEmployee employee) throws Exception;
	
	//批量删除用户
	public Map<String, Object> deleteAllUser(Integer[] ids,WmsBaseEmployee employee) throws Exception;
	
	//用户log表增加记录
	public Map<String, Object> addUserLog(WmsBaseUser preUser, WmsBaseUser afterUser, WmsBaseEmployee employee)throws Exception;
}
