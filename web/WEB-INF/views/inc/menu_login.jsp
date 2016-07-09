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

<%--<c:if test="${pageContext.request.remoteUser == null}">--%>
    <%--&lt;%&ndash;login&ndash;%&gt;--%>
    <%--<form action="/" method="post" class="form-horizontal" role="form">--%>
        <%--<div class="form-group">--%>
            <%--<label class="control-label col-sm-4" for="login">--%>
                <%--<spring:message code="header.login_form.login.label"/>--%>
            <%--</label>--%>
            <%--<div class="col-sm-8">--%>
                <%--<input type="text"--%>
                       <%--class="form-control input-sm"--%>
                       <%--id="login"--%>
                       <%--name="login"--%>
                       <%--placeholder="${header.login_form.login.place_holder}">--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<label class="control-label col-sm-4" for="password">--%>
                <%--<spring:message code="header.login_form.password.label"/>--%>
            <%--</label>--%>
            <%--<div class="col-sm-8">--%>
                <%--<input type="password"--%>
                       <%--class="form-control input-sm"--%>
                       <%--id="password"--%>
                       <%--name="password"--%>
                       <%--placeholder="${header.login_form.password.place_holder}">--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<div class="col-sm-offset-8 col-sm-4">--%>
                <%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
                <%--<button type="submit" class="btn btn-default btn-sm login-button">--%>
                    <%--<spring:message code="header.login_form.login.button"/>--%>
                <%--</button>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</form>--%>
<%--</c:if>--%>

<%--<c:if test="${pageContext.request.remoteUser != null}">--%>
    <%--&lt;%&ndash;logout&ndash;%&gt;--%>
    <%--<form action="/?logout" method="post" class="form-horizontal" role="form">--%>
        <%--<div class="col-sm-12">--%>
            <%--<h4 class="user-welcome">--%>
                <%--<spring:message code="header.login_form.welcome"/>--%>
                <%--<strong><c:out value="${pageContext.request.remoteUser}"/></strong>--%>
            <%--</h4>--%>
        <%--</div>--%>
        <%--<div class="col-sm-offset-8 col-sm-4">--%>
            <%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
            <%--<button type="submit" class="btn btn-default btn-sm login-button">--%>
                <%--<spring:message code="header.login_form.logout.button"/>--%>
            <%--</button>--%>
        <%--</div>--%>

    <%--</form>--%>
<%--</c:if>--%>