<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Help Desk</title>
</head>
<body>
<h1>This is Main Page</h1>
<ol>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
</ol>
<p><a href="${link}">Show task</a></p>
<br>
<p><a href="${add}">Add task</a></p>

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
    <c:forEach items="${items}" var="productorder">
    <tr>
        <td><input type="text" description = "id"><c:out value="${Tasks.id}"/></td>
        <td><input type="text" description = "user_id">${Tasks.user_id}</td>
        <td><input type="text" description = "description"><c:out value="${Tasks.description}"/></td>
        <td><input type="text" description = "comment">${Tasks.comment}</td>
        <td><input type="text" description = "data_created">${Tasks.date_created}</td>
        <td><input type="text" description = "last_change">${Tasks.last_change}</td>
        <td><input type="text" description = "close_date">${Tasks.close_date}</td>
        <td><input type="text" description = "rates_id">${Tasks.rates_id}</td>
        <td><input type="text" description = "state">${Tasks.state}</td>
    </tr>
    </c:forEach>
</table>
</body>
<footer>
    <div class="links">
        <a href="/">Go to Index</a>
        <a href="/admin">Admin page</a>
        <a href="/desk">Main page</a>
        <a href="/map">Map</a>
    </div>
</footer>
</html>
