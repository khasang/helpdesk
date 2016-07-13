<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <p><h2>Table assignments</h2></p>
    <table border="1" width="500" height="100" class="tg">
  <%--      <th>id</th>
        <th>user_id</th>
        <th>description</th>
        <th>comment</th>
        <th>date_created</th>
        <th>last_change</th>
        <th>close_date</th>
        <th>rates_id</th>
        <th>state</th>
        <tr>
            <td>${Tasks.id}</td>
            <td>${Tasks.user_id}</td>
            <td>${Tasks.description}</td>
            <td>${Tasks.comment}</td>
            <td>${Tasks.date_created}</td>
            <td>${Tasks.last_change}</td>
            <td>${Tasks.close_date}</td>
            <td>${Tasks.rates_id}</td>
            <td>${Tasks.state}</td>
        </tr>--%>

      <tr>
          <th>id</th>
          <th>user_id</th>
          <th>description</th>
          <th>comment</th>
          <th>date_created</th>
          <th>last_change</th>
          <th>close_date</th>
          <th>rates_id</th>
          <th>state</th>
      </tr>
      <c:forEach items="${items}" var="deskviewer">
          <tr>
              <td><c:out value="${deskviewer.id}"/></td>
              <td><c:out value="${deskviewer.user_id}"/></td>
              <td><c:out value="${deskviewer.description}"/></td>
              <td><c:out value="${deskviewer.comment}"/></td>
              <td><c:out value="${deskviewer.date_created}"/></td>
              <td><c:out value="${deskviewer.last_change}"/></td>
              <td><c:out value="${deskviewer.close_date}"/></td>
              <td><c:out value="${deskviewer.rates_id}"/></td>
              <td><c:out value="${deskviewer.state}"/></td>
          </tr>
      </c:forEach>
    </table>

    <form action="/newtask">
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
