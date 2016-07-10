<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/signup/registration" method="post" commandName="signUp">
    <label for="login">Login:</label>
    <input type="text" hint="login" description="login" id="login" class="form-control">
    <label for="password">Password:</label>
    <input type="text" hint="password" description="password" id="password" class="form-control">
    <label for="email">E-mail:</label>
    <input type="text" hint="email" description="email" id="email" class="form-control">
        <select description="role" id="role" class="form-control">
            <option value="ROLE_ADMIN">admin</option>
            <option value="ROLE_USER">user</option>
        </select>
    <input type="submit" value="Sign Up">
</form:form>
</body>
</html>
