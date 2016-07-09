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




<%--<c:if test="${pageContext.request.isUserInRole('ADMIN')}">--%>
    <%--&lt;%&ndash;admin menu&ndash;%&gt;--%>
    <%--<nav class="navbar navbar-default">--%>
        <%--<div class="container-fluid">--%>
            <%--<div class="navbar-header">--%>
                <%--<a class="navbar-brand" href="<c:url value="/"/>">--%>
                    <%--<spring:message code="menu.pages.index"/>--%>
                <%--</a>--%>
            <%--</div>--%>
            <%--<div class="navbar-header">--%>
                <%--<a class="navbar-brand" href="<c:url value="/admin"/>">--%>
                    <%--<spring:message code="menu.pages.admin.index"/>--%>
                <%--</a>--%>
            <%--</div>--%>
            <%--<ul class="nav navbar-nav">--%>
                <%--<li>--%>
                    <%--<a href="<c:url value="/admin/users"/>">--%>
                        <%--<spring:message code="menu.pages.admin.users"/>--%>
                    <%--</a>--%>
                <%--</li>--%>
                <%--<li>--%>
                    <%--<a href="<c:url value="/admin/backup"/>">--%>
                        <%--<spring:message code="menu.pages.admin.backup"/>--%>
                    <%--</a>--%>
                <%--</li>--%>
            <%--</ul>--%>
        <%--</div>--%>
    <%--</nav>--%>
<%--</c:if>--%>