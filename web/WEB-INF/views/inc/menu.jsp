<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="<c:url value="/"/>">
                <spring:message code="menu.pages.index"/>
            </a>
        </div>
        <c:if test="${pageContext.request.isUserInRole('ADMIN')}">
            <div class="navbar-header">
                <a class="navbar-brand" href="<c:url value="/admin"/>">
                    <spring:message code="menu.pages.admin.index"/>
                </a>
            </div>
        </c:if>
        <c:if test="${pageContext.request.isUserInRole('USER')}">
            <div class="navbar-header">
                <a class="navbar-brand" href="<c:url value="/desk"/>">
                    <spring:message code="menu.pages.user.desk"/>
                </a>
            </div>
        </c:if>
        <ul class="nav navbar-nav">
            <li>
                <a href="<c:url value="/news"/>">
                    <spring:message code="menu.pages.news"/>
                </a>
            </li>
            <li>
                <a href="<c:url value="/maps"/>">
                    <spring:message code="menu.pages.maps"/>
                </a>
            </li>
        </ul>
    </div>
</nav>
