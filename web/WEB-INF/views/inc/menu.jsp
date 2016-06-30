<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="${contextPath}/"><spring:message code="menu.title"/></a>
        </div>
        <ul class="nav navbar-nav">
            <li>
                <a href="${contextPath}/"><spring:message code="menu.pages.index"/></a>
            </li>
            <li>
                <a href="<c:url value="/news"/>"><spring:message code="menu.pages.news"/></a>
            </li>
            <li>
                <a href="<c:url value="/maps"/>"><spring:message code="menu.pages.maps"/></a>
            </li>
        </ul>
    </div>
</nav>

<jsp:include page="admin_menu.jsp"/>