<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
    <jsp:include page="tags/headerPage.jsp"/>
</head>
<body>
<div class="container">
    <h1>Add User</h1>
    <form:form method="post" action="/admin/allUsers/save/user" commandName="user">
        <input class="form-control" name="id" value="${user.id}" type="hidden">

        <div class="form-group">
            <label for="firstName" class="col-sm-2 control-label">First Name</label>

            <div class="col-sm-5">
                <input type="text" class="form-control" name="firstName" id="firstName" placeholder="Enter First Name"
                       value="${user.firstName}">
            </div>
        </div>

        <div class="form-group">
            <label for="secondName" class="col-sm-2 control-label">Second Name</label>

            <div class="col-sm-5">
                <input type="text" class="form-control" name="secondName" id="secondName"
                       placeholder="Enter Second Name" value="${user.secondName}">
            </div>
        </div>

        <div class="form-group">
            <label for="role_Id" class="col-sm-2 control-label">Role ID</label>

            <div class="col-sm-5">
                <input type="text" class="form-control" name="role_Id" id="role_Id" placeholder="Enter role_Id"
                       value="${user.role_id}">
            </div>
        </div>

        <div class="form-group">
            <label for="roles" class="col-sm-2 control-label">Roles</label>

            <div class="col-sm-5">
                <input type="text" class="form-control" name="roles" id="roles" placeholder="Enter role"
                       value="${user.roles}">
            </div>
        </div>

        <div class="form-group">
            <label for="login" class="col-sm-2 control-label">Login</label>

            <div class="col-sm-5">
                <input type="text" class="form-control" name="login" id="login" placeholder="Enter login"
                       value="${user.login}">
            </div>
        </div>

        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">Password</label>

            <div class="col-sm-5">
                <input type="text" class="form-control" name="password" id="password" placeholder="Enter password"
                       value="${user.password}">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Save User</button>
                <a class="btn btn-default" href="/admin/allUsers" role="button">cancel</a>
            </div>
        </div>
    </form:form>
</div>
</body>
<jsp:include page="tags/footerPage.jsp"></jsp:include>
</html>