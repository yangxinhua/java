<%--
  Created by IntelliJ IDEA.
  User: jacky
  Date: 2016/3/10
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String id=request.getParameter("id");%>
<html>
<head>
    <title>welcome</title>
</head>
<body>
<p>welcome!</p>
<%out.print(id);%>
</body>
</html>
