<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <div class="descr"><h1>${title}</h1></div>
        <div class="welcome">
            Welcome, John.
            <a href="/">Logout</a>

        </div>
    </div>