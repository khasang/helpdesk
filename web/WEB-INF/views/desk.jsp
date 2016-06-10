<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main desk</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/main.css" />" type="text/css">
</head>
<body>
<div class="container">

    <!-- page head -->

    <div class="header">
        <div class="logo">
            <a href="/"><img src="<c:url value="/resources/images/logo.png"/>" alt="logo"></a>
        </div>
        <div class="descr"><h1>Help desk</h1></div>
        <div class="welcome">
            Welcome, John.
            <a href="/">Logout</a>

        </div>
    </div>

    <!-- container -->
    <div class="left_menu">
        <a href="/">Main</a><br/>
        <a href="/admin">Admin panel</a><br/>
        <a href="/desk">Desk</a><br/>
        <a href="/news">News</a><br/>
        <a href="/maps">Maps</a><br/>
        <hr/>
        Moderator menu:<br/>
        <a href="#">Active questions</a><br/>
        <a href="#">Solved</a><br/>
        <a href="#">Users</a><br/>
        <a href="#">Search</a><br/>
    </div>
    <div class="content">
        <div style="display: block">
            <h3>Question id#58123</h3>
            <h5>How can I contact your company?</h5>
            User: Sandro<br/>
            Date: 25.11.2015 9:56 <br/>
            IP: 144.23.123.37
            <form>
                <h4>Reply:</h4>
                To: <input type="text" value="sandro@gmail.com"/><br/>
                <textarea cols="70" rows="10"></textarea>
                <input type="submit" value="Reply">
            </form>
        </div>
    </div>

    <!-- page footer -->

    <div class="footer">
        Created by Dmitry Savitski
    </div>
</div>
</body>
</html>
