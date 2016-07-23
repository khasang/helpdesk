<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <meta charset=’UTF-8’>
    <title>task</title>
</head>
<body>

<div class="left_menu">
    <form action="/desk">
        <input type="submit" id="Button1" description="" value="Desk page">
    </form>
    <form action="#">
        <input type="submit" id="Button3" description="" value="Logout">
    </form>
</div>
<table border="1" width="500" height="100" class="tg">
    <caption><h1>Table assignments</h1></caption>
    <th>id</th>
    <th>user_id</th>
    <th>description</th>
    <th>comment</th>
    <th>date_created</th>
    <th>last_change</th>
    <th>close_date</th>
    <th>rates_id</th>
    <th>state</th>
    <c:forEach items="${task}" var="task">
        <tr>
            <td><c:out value="${task.id}"/></td>
            <td><c:out value="${task.user_id}"/></td>
            <td><c:out value="${task.description}"/></td>
            <td><c:out value="${task.comment}"/></td>
            <td><c:out value="${task.date_created}"/></td>
            <td><c:out value="${task.last_change}"/></td>
            <td><c:out value="${task.close_date}"/></td>
            <td><c:out value="${task.rates_id}"/></td>
            <td><c:out value="${task.state}"/></td>
        </tr>
    </c:forEach>
</table>



<form>
    <label for="password-field">Found description</label>
    <input type="text" name="password" id="password-field">

    <table border="1" width="500" height="100" class="tg">
        <caption><h1>Table assignments</h1></caption>
        <th>description</th>
        <c:forEach items="${found}" var="task">
            <tr>
                <td><c:out value="${task.description}"/></td>
            </tr>
        </c:forEach>
    </table>
</form>

<form action="/desk/task/foundtask">
    <input type="submit" id="Button2" value="Found">
</form>
</body>
</html>
