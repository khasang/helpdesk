<%--
  Created by IntelliJ IDEA.
  User: Alexander-PC
  Date: 12.06.2016
  Time: 18:09
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
            background: url("https://i.vimeocdn.com/video/518346687.jpg?mw=1920&mh=1080&q=70");
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

<div id="wb_Text2" style="position:absolute;left:850px;top:400px;width:500px;height:30px;z-index:3;text-align:left;">

    <span><h2>Welcome to our site! Helpdesk</h2></span>

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
    <form action="/JIRAmovie">
        <input type="submit" id="Button7" name="" value="Intro to JIRA portfolio">
    </form>
</div>

</body>
</html>
