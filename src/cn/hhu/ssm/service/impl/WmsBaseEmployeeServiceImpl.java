package cn.hhu.ssm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import cn.hhu.ssm.common.Code;
import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.mapper.WmsBaseEmployeeMapper;

import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsBaseEmployeeExample;

import cn.hhu.ssm.service.WmsBaseEmployeeService;

public class WmsBaseEmployeeServiceImpl implements WmsBaseEmployeeService {
	//静态注入
	@Autowired
	private WmsBaseEmployeeMapper employeeMapper;
	
	//查询员工信息
	@Override
	public Map<String, Object> findEmployeeById(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//根据id查询员工信息
			WmsBaseEmployee employee = employeeMapper.selectByPrimaryKey(id);
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> findEmployeeByCriteria(WmsBaseEmployee employee,PageBean pageBean) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//通过criteria构建查询条件
			WmsBaseEmployeeExample employeeExample = new WmsBaseEmployeeExample();
			WmsBaseEmployeeExample.Criteria criteria = employeeExample.createCriteria();
			List<WmsBaseEmployee> employeeList = new ArrayList<WmsBaseEmployee>();
			if(employee!=null) {
				//如果查询条件不为空
				
				//用于获取查询条件
				String employeeNumber = employee.getEmployeeNumber();
				String employeeName =  employee.getName();
				String employeeDepartment = employee.getDepartment();
				//先判断查询条件里用户编号是否为空
				if(employeeNumber!=null&&employeeNumber.length()>0)
					criteria.andEmployeeNumberEqualTo(employeeNumber);
				//判断查询条件的用户姓名是否为空,姓名为模糊查询
				if(employeeName!=null&&employeeName.length()>0)
					criteria.andNameLike("%"+employeeName+"%");
				//判断查询条件的部门是否为空
				if(employeeDepartment!=null&&employeeDepartment.length()>0)
					criteria.andDepartmentEqualTo(employeeDepartment);
			}
			//获取查询总记录数
			Integer totalCount = employeeMapper.countByExample(employeeExample);
			//如果查到记录了则..
			if (null != totalCount && totalCount > 0) {
				//页面信息反射到查询条件里
				pageBean.setPageParam(employeeExample);
				//根据之前构造的查询条件来查询记录
				employeeList =  employeeMapper.selectByExample(employeeExample);
				//把记录总数和数据存到pagebean中
				pageBean.setTotalCount(totalCount);
				pageBean.setData(employeeList);
				//把pageBean封装到data里面
				resultMap.put("data",pageBean);
			} else {
				//如果查询记录为空，则添加错误代码为没有数据代码
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NO_DATA);
				resultMap.put("errmsg", "查询成功，查询结果为空");
			}
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> addEmployee(WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			int result = 0;
			//如果有id不为空
			if(employee.getEmployeeId()!=null) {
				//根据id去查找员工信息，
				WmsBaseEmployee baseEmployee = employeeMapper.selectByPrimaryKey(employee.getEmployeeId());
				if(baseEmployee!=null) {
					//如果baseEmployee存在，则说明记录以及存在不能再插入
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_EXISTED_DATA);
					resultMap.put("errmsg", "数据已存在，不能新增加数据");
				}else {
					//如果baseEmployee=null则说明记录不存在可以插入
					result = employeeMapper.insert(employee);
				}
			}
			else{
				//如果没有id属性则直接插入
				result = employeeMapper.insert(employee);

			}
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> updateEmployee(WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//如果没有主键信息无法进行更新操作
			if(employee.getEmployeeId()==null) {
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_PRIMARY_KEY);
				resultMap.put("errmsg", "没有主键无法进行更新操作");
			}else {
				int result = employeeMapper.updateByPrimaryKey(employee);
			}
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;

	}

	@Override
	public Map<String, Object> deleteEmployeeById(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//根据id查找，数据是否存在
			WmsBaseEmployee baseEmployee = employeeMapper.selectByPrimaryKey(id);
			if(baseEmployee==null) {
				//如果不存在，则不能删除
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
				resultMap.put("errmsg", "数据不存在不能删除");
			}else {
				//如果存在则进行删除操作
				int result = employeeMapper.deleteByPrimaryKey(id);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;

	}

	@Override
	public Map<String, Object> deleteEmployees(Integer[] ids) {
		Map<String, Object> resultMap = getResultMap();
		try {
			for(int i = 0;i<ids.length;i++) {
				WmsBaseEmployee employee = employeeMapper.selectByPrimaryKey(ids[i]);
				if(employee==null) {
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
					resultMap.put("errmsg", "数据不存在不能删除");
					break;
				}else {
					int result = employeeMapper.deleteByPrimaryKey(ids[i]);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	
	public Map<String,Object> getResultMap(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("errcode", 0);
		map.put("errmsg", "ok");
		map.put("data", "");
		return map;
	}

	
}
