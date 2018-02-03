<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String basePath = request.getContextPath();
%>
<link type="text/css" href="<%=basePath %>/css/pintuer.min.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/exorder/editExorder.js"></script>
<link type="text/css" href="<%=basePath %>/css/editExplan.css" rel="stylesheet" />
<script type="text/javascript">
	var basePath = "<%=basePath %>";
</script>
<title>修改/添加出库计划</title>
<script type="text/javascript">
function backExplanList(){
	//跳转到列表页面
	window.location.href=basePath+'/WmsExorder/toExorderListPage.action';
}
</script>
</head>
<body>
<input type="hidden" name="exorderId" id="exorderId" value="${id }">

<div class="contains">
		<div class="contains_head add_user">
			<span class="operation_info">添加信息</span>
		</div>
		<div class="contains_head edit_user" style="display:none;">
			<span class="operation_info">修改信息</span>
		</div>
		<div class="add_edit">
		<table>
			<tr>
				<td>出库单编号</td>
				<td><input class="common_input"  type="text" name="exorderNumber" id="exorderNumber" readonly="readonly"/></td>
				<td>业务类型<span style="color:red;">*</span></td>
				<td><select name="businesstype" id="businesstype" class="common_input" > 
						<option value="0">请选择</option>
						<option value="1">采退</option> 
			    		<option value="2">出库</option> 
			  	  	</select>
			  	</td>
			</tr>
			<tr>
<!--需要改 -->
				<td>货主</td>
				<td><input class="common_input"  type="text" name="shipperId" id="shipperId"/></td>
<!--需要改 -->
				<td>客户名称</td>
				<td><input class="common_input"  type="text" name="customername" id="customername"/></td>
			</tr>
			<tr>
				<td>送货地址</td>
				<td><input class="common_input"  type="text" name="toaddress" id="toaddress"/></td>
				<td>仓库</td>
<!--需要改 -->
				<td><input class="common_input"  type="text" name="storehouseId" id="storehouseId"/></td>
			</tr>
			<tr>
				<td>出库日期</td>
				<td><input class="common_input"  type="text" name="exdate" id="exdate" /></td>
				<td>客户单号</td>
				<td><input class="common_input"  type="text" name="customernumber" id="customernumber"/></td>
			</tr>
			<tr>
				<td>储运要求</td>
				<td><input class="common_input"  type="text" name="storagetransportationrequirement" id="storagetransportationrequirement" /></td>
				<td>是否复核</td>
				<td>
					<input  type="radio" name="ischecked" id="ischecked" value="1"/>是
					<input  type="radio" name="ischecked" id="ischecked" value="0"/>否
				</td>
				</tr>
			<tr>
				<td>客服序号</td>
				<td><input class="common_input"  type="text" name="serviceId" id="serviceId"/></td>
				<td>是否监管</td>
				<td>
					<input  type="radio" name="issupervision" id="issupervision" value="1"  />是
					<input  type="radio" name="issupervision" id="issupervision" value="0" />否
				</td>
			</tr>
			<tr>
				
				<td>联系人</td>
				<td><input class="common_input"  type="text" name="contactman" id="contactman"/></td>
				<td>是否保税</td>
				<td>
					<input  type="radio" name="isbonded" id="isbonded" value="1"/>是
					<input  type="radio" name="isbonded" id="isbonded" value="0"/>否
				</td>
			</tr>
			<tr>
				<td>联系电话</td>
				<td><input class="common_input"  type="text" name="contacttel" id="contacttel"/></td>
				<td>出库条码</td>
				<td><input class="common_input"  type="text" name="exbarcode" id="exbarcode"/></td>
			</tr>
			
			
			<tr>
				<td>摆放区域</td>
				<td><input class="common_input"  type="text" name="placementarea" id="placementarea"/></td>
				<td>拣货人</td>
				<td><input class="common_input"  type="text" name="pickman" id="pickman"/></td>
			</tr>
			
			<tr>
			<td>计划状态</td>
				<td>
					<select name="planstatus" id="planstatus" class="common_input"> 
						<option value="0">请选择</option>
						<option value="1" >准备</option> 
    					<option value="2" >出库</option> 
  	  				</select> 
				</td>
				<td>备注</td>
				<td><input class="common_input"  type="text" name="remark" id="remark"/></td>
				
			</tr>
				<td>制单日期</td>
				<td><input class="common_input"  type="text" name="makeorderdate" id="makeorderdate"/></td>
				<td>制单人</td>
				<td><input class="common_input"  type="text" name="makeorderman" id="makeorderman"/></td>
			
			<tr>
			<tr class="add_user">
				<td colspan="2" style="border:none;background:none;text-align:right;padding-right:30px;">
					<input class="submit_bt" type="button" value="保存" id="editExorderSubmit"/>
				</td>
				<td colspan="2" style="border:none!important;text-align:left;padding-left:30px;">
					<input class="submit_bt" type="button" value="返回" onclick="backExorderList()"/>
				</td>
			</tr>
		</table>
	</div>
</div>


<!-- <div> -->
<!-- <table width="50%" border=0> -->
<!--
<tr>
仓库的接口需要调用
	<td>仓库</td>
	<td>
		<select name="exstorehouseId" id="exstorehouseId"> 
			<option value="0">请选择</option>
				<option value="1" >zxc</option> 
    			<option value="2" >zxc</option> 

  	  	</select> 
  	 </td>
</tr>
-->
<!-- </table> -->
<!-- </div> -->
</body>
</html>