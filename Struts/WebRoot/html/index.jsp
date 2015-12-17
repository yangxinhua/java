<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String context = request.getContextPath();
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
<body>
<a href="<%=context %>/Student_add">添加学生</a>
<a href="<%=context %>/Student_del">删除学生</a>
<a href="<%=context %>/Teacher_add">添加老师</a>
<a href="<%=context %>/Teacher_del">删除老师</a>
<br>
<a href="<%=context %>/userVaild!add?name=a">校验失败</a>
<a href="<%=context %>/userVaild!add?name=admin">校验成功</a>
<br>
<a href="useraction?type=1">全局result成功</a>
<a href="useraction?type=2">全局result失败</a>
<a href="useraction?type=3">默认mainpage</a>
<a href="useradminaction">包继承</a>
<br>
<a href="dynamicactionresult?type=1">动态结果成功</a>
<a href="dynamicactionresult?type=2">动态结果失败</a>
<s:debug></s:debug>
</body>
</html>
