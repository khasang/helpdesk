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
    <p><h1>Table assignments</h1></p>
    <table border="1" width="500" height="300">
        <tr height="25%">
            <td width="15%">artist name</td>
            <td width="15%">project name</td>
            <td width="15%">Adopted development</td>
            <td width="15%">project finish</td>
        </tr>
        <tr height="25%">
            <td>Borisov</td>
            <td>Create a new technology</td>
            <td>01.01.2016</td>
            <td>01.03.2016</td>
        </tr>
        <tr height="25%">
            <td>Ivanov</td>
            <td>Create a new database</td>
            <td>01.01.2016</td>
            <td>01.02.2016</td>
        </tr>
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
