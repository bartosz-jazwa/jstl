<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: jazwa
  Date: 2019-03-17
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>String</title>


</head>
<body>
<%--<c:set var="len" value="${fn:length(list)}">--%>
<c:forEach var="liczba" items="${list}">
    <c:if test="${fn:length(liczba)>4}">
        ${liczba}
    </c:if>
</c:forEach>
<br>
<c:set var="now" value="<%=new java.util.Date()%>"/>
<fmt:formatDate value="${now}" pattern="dd.MM.yyyy" type="DATE"/><br>
<fmt:formatDate value="${now}" type="TIME"/><br>
<fmt:formatDate value="${now}" type="BOTH"/><br>

</body>
</html>
