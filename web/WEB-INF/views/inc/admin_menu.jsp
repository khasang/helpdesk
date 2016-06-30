<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:if test="${pageContext.request.isUserInRole('ADMIN')}">
    <%--admin menu--%>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="<c:url value="/admin"/>">
                    <spring:message code="menu.pages.admin.index"/>
                </a>
            </div>
            <ul class="nav navbar-nav">
                <li>
                    <a href="<c:url value="/admin/users"/>">
                        <spring:message code="menu.pages.admin.users"/>
                    </a>
                </li>
                <li>
                    <a href="<c:url value="/admin/backup"/>">
                        <spring:message code="menu.pages.admin.backup"/>
                    </a>
                </li>
            </ul>
        </div>
    </nav>
</c:if>