<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>News</title>
    <link rel="stylesheet" href='<c:url value="/resources/css/main.css" />' type="text/css"/>
    <link rel="stylesheet" href='<c:url value="/resources/css/yandex.css"/>' type="text/css"/>
</head>

<body>
<div class="container">

    <!-- page head -->

    <div class="header">
        <div class="logo">
            <a href="/"><img src="<c:url value="/resources/images/logo.png"/>" alt="logo"></a>
        </div>
        <div class="descr"><h1>Help Desk MAP</h1></div>
        <div class="welcome">
            Welcome, John.
            <a href="/">Logout</a>

        </div>
    </div>


    <%--<!-- container -->--%>
    <div align="center">
        <a href="/">Back to main page</a>
    </div>
    <div>
        <script type="text/javascript" charset="utf-8" async
                src="https://api-maps.yandex.ru/services/constructor/1.0/js/?sid=bnJxrxnDL1SkCnWls6fyDSEgcW_-5PRC&width=100%&height=600&lang=ru_RU&sourceType=constructor&scroll=true"></script>
    </div>
</div>

<!-- page footer -->


<div class="footer">
    Created by Dmitry Savitski
</div>
</div>
</body>
</html>
