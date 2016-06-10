<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>${title}</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/main.css" />" type="text/css">
</head>
<body>
<div class="container">

    <!-- page head -->

    <div class="header">
        <div class="logo">
            <a href="/"><img src="<c:url value="/resources/images/logo.png"/>" alt="logo"></a>
        </div>
        <div class="descr"><h1>Help Desk</h1></div>
        <div class="welcome">
            <form action="/admin" method="post">
                Login: <input type="text"/><br/>
                Password: <input type="password"><br/>
                <input type="submit" value="login">
            </form>

        </div>
    </div>


    <!-- container -->
    <div class="left_menu">
        <a href="/">Main</a><br/>
        <a href="/admin">Admin panel</a><br/>
        <a href="/desk">Desk</a><br/>
        <a href="/news">News</a><br/>
        <a href="/maps">Maps</a><br/>
    </div>
    <div class="content">
        Lorem Ipsum is simply dummy text of the printing and typesetting industry.
        Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a
        galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,
        but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the
        1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop
        publishing software like Aldus PageMaker including versions of Lorem Ipsum.
    </div>

    <!-- page footer -->

    <div class="footer">
        Created by Dmitry Savitski
    </div>
</div>
</body>
</html>
