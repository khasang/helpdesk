<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>${title}</title>
    <link rel="stylesheet" href="/css/main.css" type="text/css">
</head>
<body>
<div class="container">

    <!-- page head -->

    <div class="header">
        <div class="logo">
            <a href="/"><img src="<c:url value="/images/logo.png"/>" alt="logo"></a>
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