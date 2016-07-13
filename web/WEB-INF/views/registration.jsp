<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<div>--%>
    <%--<spring:message code = "pages.admin.users.create"/>--%>
<%--</div>--%>
<form:form  method="post" commandName="user" action="/registration-result">

    <%--<label for="login">Login:</label>--%>
    <%--<input type="text" hint="login" id="login" name="login" class="form-control">--%>

    <form:label path="login">Login:</form:label>
    <form:input path="login"/>

    <%--<label for="password">Password:</label>--%>
    <%--<input type="text" hint="password" id="password" name="password" class="form-control">--%>

    <form:label path="password">password:</form:label>
    <form:input path="password"/>

    <%--<label for="email">E-mail:</label>--%>
    <%--<input type="text" hint="email" id="email" name = "email" class="form-control">--%>

    <form:label path="email">E-mail:</form:label>
    <form:input path="email"/>

        <%--<select name="role" id="role" class="form-control">--%>
            <%--<option value="ROLE_ADMIN">admin</option>--%>
            <%--<option value="ROLE_USER">user</option>--%>
        <%--</select>--%>

    <form:select path="role">
        <form:option value="ROLE_ADMIN"/>
        <form:option value="ROLE_USER"/>
    </form:select>

    <input type="submit" value="Sign Up">
</form:form>
</body>
</html>
