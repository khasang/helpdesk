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
            <c:if test="${pageContext.request.remoteUser == null}">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> <spring:message
                            code="header.login.login"/></a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> <spring:message
                            code="header.login.registration"/></a></li>
                </ul>
            </c:if>
            <c:if test="${pageContext.request.remoteUser != null}">
                <ul class="nav navbar-nav navbar-right">
                    <li> <%--welcome messsage--%>
                        <a><spring:message code="menu.user.welcome"/>
                        <strong><c:out value="${pageContext.request.remoteUser}"/></strong></a>
                    </li>
                    <li> <%--logout--%>
                        <form action="/logout" method="post" class="form-inline" role="form">
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <button type="submit" class="btn btn-link button-logout">
                                <span class="glyphicon glyphicon-log-out"></span> <spring:message code="menu.user.logout"/>
                            </button>
                        </form>
                    </li>
                </ul>
            </c:if>
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
