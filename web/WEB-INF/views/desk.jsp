<%--
  Created by IntelliJ IDEA.
  User: Alexander-PC
  Date: 12.06.2016
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset=’UTF-8’>
    <title>desk</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <style>
        body {
            background: url("http://www.beliefnet.com/columnists/everydayspirituality/files/2014/02/orange_sunset_1920x1080.jpg");
        }
    </style>
</head>
<body>
<h2>${index}</h2>
<div class="left_menu_desk">
    <form action="/">
        <input type="submit" id="Button1" description="" value="Home page">
    </form>
    <form action="/desk/task">
        <input type="submit" id="Button2" description="" value="Go to Task">
    </form>
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
        <c:forEach items="${items}" var="productorder">
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
    </table>
    <form action="#">
        <input type="submit" id="Button4" name="Create a task" value="Create a task">
    </form>
    <form>
        <b>Search: </b><input type="text" name="Search"/><br/>
        <input type="submit" value="Edit">
    </form>
</div>

<div class="right_menu">
    <form action="#">
        <input type="submit" id="Button3" name="Logout" value="Logout">
    </form>
</div>
</body>
</html>
