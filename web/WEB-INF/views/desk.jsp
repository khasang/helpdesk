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
        <input type="submit" id="Button1" name="" value="Home page">
    </form>
    <form action="/desk/task">
        <input type="submit" id="Button2" name="" value="Go to Task">
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
    <form action="#">
        <input type="submit" id="Button4" name="" value="Create a task">
    </form>
    <form>
        <b>Search: </b><input type="text" value=""/><br/>
        <input type="submit" value="Edit">
    </form>
</div>

<div class="right_menu">
    <form action="#">
        <input type="submit" id="Button3" name="" value="Logout">
    </form>
</div>
</body>
</html>
