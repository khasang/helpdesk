<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <strong><c:out value="${pageContext.request.remoteUser}"/></strong>
    <a href="/?logout" >logout</a>
</head>
<body>
<h1>${title}</h1>
    <input type="submit" value="add users">
    <br>
    <input type="submit" value="delete users">
    <br>
    <input type="submit" value="show logs">
    <br>
    <input type="submit" value="back up DataBase">
</body>
<footer>
    <br>
    <a href="/">Go to Index</a>
    <a href="/desk">Main page</a>
    <a href="/map">Map</a>
    <br>
</footer>
</html>
