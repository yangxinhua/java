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
<a href="<%=context %>/Student_add">���ѧ��</a>
<a href="<%=context %>/Student_del">ɾ��ѧ��</a>
<a href="<%=context %>/Teacher_add">�����ʦ</a>
<a href="<%=context %>/Teacher_del">ɾ����ʦ</a>
<br>
<a href="<%=context %>/userVaild!add?name=a">У��ʧ��</a>
<a href="<%=context %>/userVaild!add?name=admin">У��ɹ�</a>
<br>
<a href="useraction?type=1">ȫ��result�ɹ�</a>
<a href="useraction?type=2">ȫ��resultʧ��</a>
<a href="useraction?type=3">Ĭ��mainpage</a>
<a href="useradminaction">���̳�</a>
<br>
<a href="dynamicactionresult?type=1">��̬����ɹ�</a>
<a href="dynamicactionresult?type=2">��̬���ʧ��</a>
<s:debug></s:debug>
</body>
</html>
