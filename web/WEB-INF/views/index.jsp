<%--
  Created by IntelliJ IDEA.
  User: mrak
  Date: 20.06.2016
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset=’UTF-8’>
    <title>index</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <script type="text/javascript" src="js/welcome.js"></script>
    <style>
        body {
            background: grey;
        }
    </style>
</head>

<body>
<div class="right_menu">
    <form action="#">
        <input type="submit" id="Button1" name="" value="Login">
    </form>
    <form action="#">
        <input type="submit" id="Button2" name="" value="Registration">
    </form>
</div>

<div class="welcome">
    <span><h2>Welcome to Helpdesk</h2></span>
</div>

<div class="left_menu">
    <form action="/admin">
        <input type="submit" id="Button3" name="" value="Admin page">
    </form>
    <form action="/desk">
        <input type="submit" id="Button4" name="" value="Desk page">
    </form>
    <form action="/news">
        <input type="submit" id="Button5" name="" value="News page">
    </form>
    <form action="/maps">
        <input type="submit" id="Button6" name="" value="Maps page">
    </form>
</div>

</body>
</html>
