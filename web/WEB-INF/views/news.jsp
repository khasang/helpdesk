<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="inc/header.jsp"/>

<div class="panel panel-default content">
    <div class="panel-heading">
        <spring:message code="pages.news.title"/>
    </div>
    <div class="panel-body">
        <script src="//news.yandex.ru/common.js"></script>
        <script src="//news.yandex.ru/ru/internet5.utf8.js" charset="utf-8"></script>
        <script src='<c:url value="/resources/js/ya_news.js"/>'></script>
    </div>
</div>

<jsp:include page="inc/footer.jsp"/>
