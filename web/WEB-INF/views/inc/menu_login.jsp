<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

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
        <li> <%--logged user--%>
            <a>
                <span class="glyphicon glyphicon-user"></span>
                <strong><c:out value="${pageContext.request.remoteUser}"/></strong>
            </a>
        </li>
        <li> <%--logout--%>
            <form action="/logout" method="post" class="form-inline" role="form">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <button type="submit" class="btn btn-link button-logout">
                    <span class="glyphicon glyphicon-log-out"></span> <spring:message
                        code="menu.user.logout"/>
                </button>
            </form>
        </li>
    </ul>
</c:if>