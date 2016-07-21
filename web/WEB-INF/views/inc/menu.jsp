<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mainMenu">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value="/"/>">
                <spring:message code="menu.pages.index"/>
            </a>
        </div>
        <div class="collapse navbar-collapse" id="mainMenu">
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

            <jsp:include page="menu_login.jsp"/>

            <jsp:include page="admin_menu.jsp"/>
        </div>

    </div>
</nav>

<%--<c:if test="${pageContext.request.isUserInRole('ADMIN')}">--%>
<%--<div class="navbar-header">--%>
<%--<a class="navbar-brand" href="<c:url value="/admin"/>">--%>
<%--<spring:message code="menu.pages.admin.index"/>--%>
<%--</a>--%>
<%--</div>--%>
<%--</c:if>--%>
<%--<c:if test="${pageContext.request.isUserInRole('USER')}">--%>
<%--<div class="navbar-header">--%>
<%--<a class="navbar-brand" href="<c:url value="/desk"/>">--%>
<%--<spring:message code="menu.pages.user.desk"/>--%>
<%--</a>--%>
<%--</div>--%>
<%--</c:if>--%>
