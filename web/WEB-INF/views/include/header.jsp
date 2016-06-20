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

            <c:if test="${pageContext.request.userPrincipal.name == null}">
                <form action="/" method="post">
                    Login: <input type="text" name="login"/><br/>
                    Password: <input type="password" name="password"><br/>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <input type="submit" value="login">
                </form>
            </c:if>


            <c:if test="${pageContext.request.userPrincipal.name != null}">
                <h2>
                    Welcome : ${pageContext.request.userPrincipal.name} | Role:

                    <c:choose>
                        <c:when test="${pageContext.request.isUserInRole('ADMIN')}">
                            ADMIN
                        </c:when>
                        <c:when test="${pageContext.request.isUserInRole('USER')}">
                            USER
                        </c:when>
                    </c:choose>

                    <form action="/?logout" method="post">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        <input type="submit" value="Logout">
                    </form>
                </h2>
            </c:if>

        </div>
    </div>