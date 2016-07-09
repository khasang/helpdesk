<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="inc/header.jsp"/>

<div class="panel panel-default content">
    <div class="panel-heading">
        <spring:message code="pages.maps.title"/>
    </div>
    <div class="panel-body">
        <script src="https://api-maps.yandex.ru/2.1/?lang=ru_RU" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/map.js"/>" type="text/javascript"></script>
        <div id="map" class="map"></div>
    </div>
</div>

<jsp:include page="inc/footer.jsp"/>
