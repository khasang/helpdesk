<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<c:if test="${pageContext.request.isUserInRole('ADMIN')}">
    <ul class="nav navbar-nav navbar-right">
        <li>
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <span class="glyphicon glyphicon-cog"></span>
                <spring:message code="menu.pages.admin.index"/>
                <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
                <li><a href="<c:url value="/admin"/>"><spring:message code="menu.admin.dashboard"/></a></li>
                <li><a href="<c:url value="/admin/users"/>"><spring:message code="menu.admin.users"/></a></li>
            </ul>
        </li>
    </ul>
</c:if>