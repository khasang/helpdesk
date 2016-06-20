<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="include/header.jsp"/>

<jsp:include page="include/menu.jsp"/>

<div class="content">
    <script src="//news.yandex.ru/common.js"></script>
    <script src="//news.yandex.ru/ru/internet5.utf8.js" charset="utf-8"></script>
    <script src='<c:url value="/resources/js/ya_news.js"/>'></script>
</div>

<jsp:include page="include/footer.jsp"/>
