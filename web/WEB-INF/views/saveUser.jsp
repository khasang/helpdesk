<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
    <jsp:include page="tags/headerPage.jsp"/>
</head>
<body>
<div class="container">
    <h1>Save User</h1>
    <form:form method="post" action="/admin/allUsers/save/user" commandName="user">
        <input class="form-control" path="id" value="${user.id}" type="hidden">

        <div class="form-group">
            <label>First Name</label>
            <input class="form-control" name="firstName" path="firstName" placeholder="User First Name"
                   value="${user.firstName}">
            <form:errors path="firstName" cssStyle="color: #0002ff;"/>
        </div>
        <div class="form-group">
            <label>Second Name</label>
            <input class="form-control" name="secondName" path="secondName" placeholder="User Second Name"
                   value="${user.secondName}">
            <form:errors path="secondName" cssStyle="color: #0002ff;"/>
        </div>
        <div class="form-group">
            <label>Role</label>
            <input class="form-control" name="role" path="role" placeholder="User's role"
                   value="${user.role}">
            <form:errors path="role" cssStyle="color: #0002ff;"/>
        </div>
        <div class="form-group">
            <label>Role_id</label>
            <input class="form-control" name="role_id" path="role_id" placeholder="User's role id"
                   value="${user.role_id}">
            <form:errors path="role_id" cssStyle="color: #0002ff;"/>
        </div>
        <div class="form-group">
            <label>Login</label>
            <input class="form-control" name="Login" path="Login" placeholder="Login"
                   value="${user.login}">
            <form:errors path="login" cssStyle="color: #0002ff;"/>
        </div>
        <div class="form-group">
            <label>Password</label>
            <input class="form-control" name="Password" path="Password" placeholder="Password"
                   value="${user.password}">
            <form:errors path="login" cssStyle="color: #0002ff;"/>
        </div>
        <input class="btn btn-default btn-xs" type="submit" value="save">
        <a class="btn btn-default btn-xs" href="/" role="button">cancel</a>
    </form:form>
</div>
</body>
<jsp:include page="tags/footerPage.jsp"></jsp:include>
</html>