package cn.hhu.ssm.service;

import java.util.Map;

import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.po.WmsBaseEmployee;

public interface WmsBaseEmployeeService {
	//查询员工信息
	public Map<String, Object> findEmployeeById(Integer id) throws Exception;
	
	//批量查询员工信息
	public Map<String, Object> findEmployeeByCriteria(WmsBaseEmployee employee,PageBean pageBean) throws Exception;
	
	//添加员工信息
	public Map<String, Object> addEmployee(WmsBaseEmployee employee)throws Exception;
	
	//修改员工信息
	public Map<String, Object> updateEmployee(WmsBaseEmployee employee)throws Exception;
	
	//删除员工信息
	public Map<String, Object> deleteEmployeeById(Integer id) throws Exception;
	
	//查询员工信息
	//public Map<String, Object> findAllEmployee() throws Exception;
	
	//批量删除员工信息
	public Map<String, Object> deleteEmployees(Integer[] employeeIds);
	
	
	
	
	
	
}
