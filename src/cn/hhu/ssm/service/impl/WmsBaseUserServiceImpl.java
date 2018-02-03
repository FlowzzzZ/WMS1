package cn.hhu.ssm.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cn.hhu.ssm.common.Code;
import cn.hhu.ssm.common.PageBean;
import cn.hhu.ssm.mapper.WmsBaseUserLogMapper;
import cn.hhu.ssm.mapper.WmsBaseUserMapper;
import cn.hhu.ssm.po.WmsBaseEmployee;
import cn.hhu.ssm.po.WmsBaseUser;
import cn.hhu.ssm.po.WmsBaseUserExample;
import cn.hhu.ssm.po.WmsBaseUserLog;
import cn.hhu.ssm.service.WmsBaseUserService;
import net.sf.json.JSONObject;

public class WmsBaseUserServiceImpl implements WmsBaseUserService{
	@Autowired
	private WmsBaseUserMapper wmsUserMapper;
	@Autowired
	private WmsBaseUserLogMapper wmsUserLogMapper;
	@Override
	
	//通过id查询用户
	public Map<String, Object> findUserById(Integer id) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//使用wmsUserMapper根据id查找
			WmsBaseUser wmsUser=  wmsUserMapper.selectByPrimaryKey(id);
			resultMap.put("data", wmsUser);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	//批量查询用户
	@Override
	public Map<String, Object> findUserByCriteria(WmsBaseUser user,PageBean pageBean) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
				//通过criteria构建查询条件
		WmsBaseUserExample userExample = new WmsBaseUserExample();
		WmsBaseUserExample.Criteria criteria = userExample.createCriteria();
		//查询的用户 可能为多条
		List<WmsBaseUser> wmsUserList = new ArrayList<WmsBaseUser>();
		//定义用户名称
		String username = null;
		if(user!=null) {
			//用户名称模糊查询条件
			username = user.getFullname();     
			//如果存在这个查询条件，则把查询条件添加到criteria里面
			if(username!=null&&username.length()>0)
				criteria.andFullnameLike("%"+user.getFullname()+"%");
			if(user.getStartTime()!=null&&user.getEndTime()!=null) {
				//将输入日期作为查询条件，从而查询日期在xx-xx之间的
				criteria.andInputdateBetween(user.getStartTime(), user.getEndTime());
			}else if(user.getStartTime()!=null) {
				criteria.andInputdateGreaterThan(user.getStartTime());
			}else if(user.getEndTime()!=null) {
				criteria.andInputdateLessThan(user.getEndTime());
			}
		}
	    //获取查询总记录数
		Integer totalCount = wmsUserMapper.countByExample(userExample);
		//如果查到了记录，则...
		if(null != totalCount && totalCount > 0) {
			//页面信息反射到查询条件里
			pageBean.setPageParam(userExample);
			//根据之前构造的查询条件来查询记录
			wmsUserList = wmsUserMapper.selectByExample(userExample);
			//把记录总数和数据存在pagebean中
			pageBean.setTotalCount(totalCount);
			pageBean.setData(wmsUserList);
			//把pageBean封装到data里面
			resultMap.put("data", pageBean);
		}else {//如果查询记录为空，则添加错误代码为没有数据
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
	
	//添加用户
	@Override
	public Map<String, Object> addUser(WmsBaseUser wmsUser) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			int result = 0;
			//如果id不为空
			if(wmsUser.getUserId()!=null) {		
				//根据id查询用户
				WmsBaseUser user = wmsUserMapper.selectByPrimaryKey(wmsUser.getUserId());	
				if(user!=null) {
					//如果用户存在，则插入失败
				resultMap.put("errcode", "401");
				resultMap.put("errmsg", "数据已存在，插入失败");
			}
			else {
					//如果用户不存在则进行插入操作
				result = wmsUserMapper.insert(wmsUser);
				}

			}else {
				//如果没有id属性，则直接进行插入操作
				result = wmsUserMapper.insert(wmsUser);
			}
		}catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误");
		}
		return resultMap;
	}
	
	//根据id删除用户
	@Override
	@Transactional
	public Map<String, Object> deleteUserById(Integer id,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		//根据id查询用户
		try {
			WmsBaseUser user = wmsUserMapper.selectByPrimaryKey(id);
			//如果数据不存在则不能进行删除操作
			if(user==null) {
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
				resultMap.put("errmsg", "数据不存在，不能进行删除");
			}else {
				//如果数据不存在则进行删除操作
				int result = wmsUserMapper.deleteByPrimaryKey(id);
				addUserLog(user, null, employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误！");
		}
		return resultMap;
	}
	
	//批量删除用户
	@Override
	@Transactional
	public Map<String, Object> deleteAllUser(Integer[] ids,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//循环遍历
			for (int i = 0; i < ids.length; i++) {
				//首先根据id查询用户，判断数据是否存在
				WmsBaseUser user = wmsUserMapper.selectByPrimaryKey(ids[i]);
				//如果用户为空则不能进行删除操作
				if(user==null) {
					resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_EXISTED_DATA);
					resultMap.put("errmsg", "数据不存在，不能进行删除！");
					break;
				}else {
					//如果数据存在则执行删除操作
					int result = wmsUserMapper.deleteByPrimaryKey(ids[i]);
					addUserLog(user, null, employee);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误！");
		}
		return resultMap;
	}
	
	//修改用户
	@Override
	@Transactional
	public Map<String, Object> updateUser(WmsBaseUser wmsUser,WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//判断是否存在主键,如果主键不存在则不能进行修改
			if(wmsUser.getUserId()==null) {
				resultMap.put("errcode", Code.RESPONSE_CODE.COMMON_NON_PRIMARY_KEY);
				resultMap.put("errmsg", "没有主键不能进行修改");
			}else {
				//如果主键存在则执行修改操作
				WmsBaseUser preUser = wmsUserMapper.selectByPrimaryKey(wmsUser.getUserId());
				int result = wmsUserMapper.updateByPrimaryKey(wmsUser);
				addUserLog(preUser, wmsUser, employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误！");
		}
		return resultMap;
	}
	
	//添加用户日志表
	@Override
	public Map<String, Object> addUserLog(WmsBaseUser preUser, WmsBaseUser afterUser, WmsBaseEmployee employee) throws Exception {
		Map<String, Object> resultMap = getResultMap();
		try {
			//log表添加记录
			WmsBaseUserLog wmsUserLog = new WmsBaseUserLog();
			String preStr = null;
			String afterStr = null;
			
			if(preUser!=null||afterUser!=null) {
				if(preUser!=null&&preUser.getUserId()!=null) {
					//设置Userlog的Userid值
					wmsUserLog.setUserId(preUser.getUserId());
					//记录User更新前的状态
					preStr = JSONObject.fromObject(preUser).toString();
				}
				if (afterUser!=null&&afterUser.getUserId()!=null) {
					//设置Userlog的Userid值
					wmsUserLog.setUserId(afterUser.getUserId());
					afterStr = JSONObject.fromObject(afterUser).toString();
				}
				if(wmsUserLog.getUserId()==null||employee==null||employee.getEmployeeId()==null) {
					resultMap.put("errcode", Code.RESPONSE_CODE.LOG_NON_PRIMARY_KEY);
					resultMap.put("errmsg", "log表缺乏主键信息");
				}
			}else {
				resultMap.put("errcode", Code.RESPONSE_CODE.LOG_NON_UPDATE_INFO);
				resultMap.put("errmsg", "log表缺乏主键信息");
			}
			
			//得到修改人的员工id和员工姓名
			Integer employeeId = employee.getEmployeeId();
			String employeeName = employee.getName();
			//获取当前时间
			Date modifieddate = new Date();
			wmsUserLog.setUserPremodifiedstate(preStr);
			wmsUserLog.setUserModifiedstate(afterStr);
			wmsUserLog.setEmployeeId(employeeId);
			
			wmsUserLog.setModifyman(employeeName);
			wmsUserLog.setModifeddate(modifieddate);
			wmsUserLogMapper.insert(wmsUserLog);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errcode", -1);
			resultMap.put("errmsg", "系统错误！");
		}
		
		return resultMap;
	}
	
	public Map<String, Object> getResultMap(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("errcode", -1);
		map.put("errmsg","ok");
		map.put("data", "");
		return map;
	}
}
