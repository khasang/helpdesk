<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Admin page</title>
    <link rel="stylesheet" href="<c:url value="/WEB-INF/views/css/main.css" />" type="text/css">
</head>
<body>
<div class="container">

    <!-- page head -->

    <div class="header">
        <div class="logo">
            <a href="/"><img src="<c:url value="/WEB-INF/views/images/logo.png"/>" alt="logo"></a>
        </div>
        <div class="descr"><h1>Admin panel</h1></div>
        <div class="welcome">
            Welcome, admin.
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
        Admin menu:<br/>
        <a href="#">Users</a><br/>
        <a href="#">Moderators</a><br/>
        <a href="#">Activity</a><br/>
        <a href="#">Questions</a><br/>
        <a href="#">Settings</a><br/>
        <a href="#">Buckup</a><br/>
    </div>
    <div class="content">
        <h3>User edit</h3>
        <form>
            Login: <input type="text" value="John Doe"/><br/>
            Password: <input type="text" value="HC^TE^&DGjs"><br/>
            Email: <input type="text" value="john.d@gmail.com"><br/>
            <input type="submit" value="Edit">
        </form>
    </div>

    <!-- page footer -->

    <div class="footer">
        Created by Dmitry Savitski
    </div>
</div>
</body>
</html>
