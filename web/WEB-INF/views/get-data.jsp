<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="500" height="100" class="tg">
    <th>id</th>
    <th>user_id</th>
    <th>description</th>
    <th>comment</th>
    <th>date_created</th>
    <th>last_change</th>
    <th>close_date</th>
    <th>rates_id</th>
    <th>state</th>
    <c:forEach items="${items}" var="tasks">
    <tr>
        <td><c:out value="${tasks.id}"/></td>
        <td><c:out value="${tasks.user_id}"/></td>
        <td><c:out value="${tasks.description}"/></td>
        <td><c:out value="${tasks.comment}"/></td>
        <td><c:out value="${tasks.date_created}"/></td>
        <td><c:out value="${tasks.last_change}"/></td>
        <td><c:out value="${tasks.close_date}"/></td>
        <td><c:out value="${tasks.rates_id}"/></td>
        <td><c:out value="${tasks.state}"/></td>
    </tr>
    </c:forEach>
    <form>
        <p style="text-align: center">
            <button onclick="window.location.reload();">
        <p>Menu</p>
    </form>
</body>
</html>
