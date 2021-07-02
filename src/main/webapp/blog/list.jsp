<%--
  Created by IntelliJ IDEA.
  User: daonhuanh
  Date: 7/2/21
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${listBlog}" var="blog">
    <a href=""><h2>${blog.title}</h2></a>
    <h3>${blog.content}</h3>
    <hr>
</c:forEach>
</body>
</html>
