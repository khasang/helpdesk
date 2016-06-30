<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><spring:message code="pages.title"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"  type="text/css">
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet"  type="text/css">
</head>
<body>
<%--container start--%>
<div class="container">

    <%--header start--%>
    <div class="row header">
        <div class="col-md-3">
            <%--logo--%>
            <a href="${contextPath}/">
                <img class="img-responsive img-rounded" src="<c:url value="/resources/images/logo.jpg"/>">
            </a>
        </div>
        <div class="col-md-6 sile-description">
            <%--site description--%>
            <h3><spring:message code="header.description.title"/></h3>
            <p><spring:message code="header.description.text"/></p>
        </div>
        <div class="col-md-3 login-form">
            <%--login form--%>
            <jsp:include page="login_form.jsp"/>
        </div>
    </div>
        <%--header end--%>
