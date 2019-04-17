<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jazwa
  Date: 2019-03-17
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Names</title>
</head>
<body>
<c:forEach var="name" items="${cookies}">
    <p>${name}</p>
</c:forEach>
</body>
</html>
