<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>News</title>
    <link rel="stylesheet" href='<c:url value="/WEB-INF/views/css/main.css" />' type="text/css"/>
    <link rel="stylesheet" href='<c:url value="/WEB-INF/views/css/yandex.css"/>' type="text/css"/>
</head>
<body>
<div class="container">

    <!-- page head -->

    <div class="header">
        <div class="logo">
            <a href="/"><img src="<c:url value="/WEB-INF/views/images/logo.png"/>" alt="logo"></a>
        </div>
        <div class="descr"><h1>Help Desk NEWS</h1></div>
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
    </div>
    <div class="content">
        <script src="//news.yandex.ru/common.js"></script>
        <script src="//news.yandex.ru/ru/internet5.utf8.js" charset="utf-8"></script>
        <script src="/WEB-INF/views/js/ya_news.js"></script>
    </div>

    <!-- page footer -->

    <div class="footer">
        Created by Dmitry Savitski
    </div>
</div>
</body>
</html>
