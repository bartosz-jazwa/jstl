<%--
  Created by IntelliJ IDEA.
  User: jazwa
  Date: 2019-03-17
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game</title>
</head>
<body>

<form action="GameServlet" method="post">
    <c:set var="question" value="${question}"/>
    <label for="A">A</label>
    <label for="B">B</label>
    <label for="C">C</label>
    <label for="D">D</label>
    <input type="radio" id="A" name="answer" value="A"> A<br>
    <input type="radio" id="B" name="answer" value="B"> B<br>
    <input type="radio" id="C" name="answer" value="C"> C<br>
    <input type="radio" id="d" name="answer" value="D"> D<br>
    <input type="submit" value="Answer"><br>
</form>
</body>
</html>
