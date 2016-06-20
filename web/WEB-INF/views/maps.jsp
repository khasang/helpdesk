<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="include/header.jsp"/>

<jsp:include page="include/menu.jsp"/>

<script src="https://api-maps.yandex.ru/2.1/?lang=ru_RU" type="text/javascript"></script>

<script src="<c:url value="/resources/js/map.js"/>" type="text/javascript"></script>

<div id="map" class="map"></div>
</div>

<jsp:include page="include/footer.jsp"/>
