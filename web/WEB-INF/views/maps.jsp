<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="include/header.jsp"/>


<div align="center">
    <a href="/">Back to main page</a>
</div>
<script src="https://api-maps.yandex.ru/2.1/?lang=ru_RU" type="text/javascript"></script>

<script src="<c:url value="/resources/js/map.js"/>" type="text/javascript"></script>

<div id="map" style="height: 400px"></div>
</div>

<jsp:include page="include/footer.jsp"/>
