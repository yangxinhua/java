<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String context = request.getContextPath();
%>

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
<a href="<%=context %>/Student_add">����ѧ��</a>
<a href="<%=context %>/Student_del">ɾ��ѧ��</a>
<a href="<%=context %>/Teacher_add">������ʦ</a>
<a href="<%=context %>/Teacher_del">ɾ����ʦ</a>
<br>
<a href="<%=context %>/userVaild!add?name=a">У��ɹ�</a>
<a href="<%=context %>/userVaild!add?name=admin">У��ʧ��</a>
</body>
</html>