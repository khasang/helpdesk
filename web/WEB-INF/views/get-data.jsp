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
        <td><c:out value="${Tasks.id}"/></td>
        <td><input type="text" description = "user_id"><c:out value="${Tasks.user_id}"/></td>
        <td><c:out value="${Tasks.description}"/></td>
        <td><input type="text" description = "comment"><c:out value="${Tasks.comment}"/></td>
        <td><input type="text" description = "data_created"><c:out value="${Tasks.date_created}"/></td>
        <td><input type="text" description = "last_change"><c:out value="${Tasks.last_change}"/></td>
        <td><input type="text" description = "close_date"><c:out value="${Tasks.close_date}"/></td>
        <td><input type="text" description = "rates_id"><c:out value="${Tasks.rates_id}"/></td>
        <td><input type="text" description = "state"><c:out value="${Tasks.state}"/></td>
    </tr>
    </c:forEach>
</body>
</html>
