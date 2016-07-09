<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="inc/header.jsp"/>

<div class="login-div">
    <form role="form" method="post">
        <div class="form-group">
            <label class="control-label col-sm-4" for="login">
                <spring:message code="login.login"/>
            </label>
            <div class="col-sm-8">
                <input type="text"
                       class="form-control input-sm"
                       id="login"
                       name="login"
                       placeholder="${header.login_form.login.place_holder}">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-4" for="password">
                <spring:message code="login.password"/>
            </label>
            <div class="col-sm-8">
                <input type="password"
                       class="form-control input-sm"
                       id="password"
                       name="password"
                       placeholder="${header.login_form.password.place_holder}">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-8 col-sm-4">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <button type="submit" class="btn btn-default">
                    <spring:message code="login.button"/>
                </button>
            </div>
        </div>
    </form>
    <!-- /form -->
    <a href="#" class="forgot-password">
        Forgot the password?
    </a>
</div>

<jsp:include page="inc/footer.jsp"/>


