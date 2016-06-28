<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="topTags.jsp"/>
<html>
<head>
    <title>Create User</title>
    <link rel="stylesheet" href="css/createUser.css">
</head>
<body>
<div class="container">
    <jsp:include page="leftPanelMenu.jsp"/>
    <div id="centralWindow">
        <h4>Create User</h4>
        <form class="form-horizontal" role="form" action="createUser" method="post" modelAttribute="user">
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">First Name</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="name" placeholder="Enter Name">
                </div>
            </div>
            <div class="form-group">
                <label for="role_id" class="col-sm-2 control-label">Role ID</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="role_id" placeholder="Enter Role_ID">
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-2 control-label">Password</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="password" placeholder="Enter Password">
                </div>
            </div>
            <div class="form-group">
                <label for="login" class="col-sm-2 control-label">Logins</label>

                <div class="col-sm-5">
                    <input type="text" class="form-control" id="login" placeholder="Enter Login">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">Save User</button>
                    <a class="btn btn-default" href="/admin" role="button">cancel</a>
                </div>
            </div>
    </div>




</body>
</html>
