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
    <input type="text" hint="login" name="login" id="login" class="form-control">
    <input type="text" hint="password" name="password" id="password" class="form-control">
    <input type="text" hint="email" name="email" id="email" class="form-control">
        <select name="role" id="role" class="form-control">
            <option value="ROLE_ADMIN">admin</option>
            <option value="ROLE_USER">user</option>
        </select>
    <input type="submit" value="Sign Up">
</form:form>
</body>
</html>
