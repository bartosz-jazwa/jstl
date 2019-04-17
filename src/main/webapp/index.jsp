<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<body>
<h2>Hello World!</h2>

<%
    List<Integer> list = new ArrayList<>();
    list.add(1500);
    list.add(3000);
    list.add(10100);
    list.add(50);
    list.add(400);
    request.setAttribute("list",list);
%>



<%--Rozmiar listy: ${fn:length(list)}--%>

<%--<c:forEach var="i" begin="0" end="300" step="2">
    <p>${i}  </p>
</c:forEach>--%>

<%--<c:forEach var="liczba" items="${list}">
    &lt;%&ndash;${liczba}<br>&ndash;%&gt;
    &lt;%&ndash;<c:if test="${liczba>1000}">
        ${liczba}<br>
    </c:if>&ndash;%&gt;

    <c:choose>
        <c:when test="${liczba>100 and liczba<500}"> bardzo malo</c:when>
        <c:when test="${liczba>2000 and liczba<10000}"> srednio</c:when>
        <c:when test="${liczba>10000}"> wow</c:when>
        <c:otherwise>Nieobslugiwany przypadek: ${liczba}</c:otherwise>
    </c:choose>
</c:forEach>

<c:forEach var="i" begin="1" end="10">
    <p>Liczba ${i}</p> <br>
</c:forEach>--%>

<a href="GameServlet">Start game</a>

</body>
</html>
