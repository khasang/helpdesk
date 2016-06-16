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
        <form class="form-horizontal" role="form">
            <div class="form-group">
                <label for="firstName" class="col-sm-2 control-label">First Name</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="firstName" placeholder="Enter First Name">
                </div>
            </div>
            <div class="form-group">
                <label for="secondName" class="col-sm-2 control-label">Last Name</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="secondName" placeholder="Enter Last Name">
                </div>
            </div>
            <div class="form-group">
                <label for="role" class="col-sm-2 control-label">Role</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="role" placeholder="Enter User Role">
                </div>
            </div>
            <div class="form-group">
                <label for="email" class="col-sm-2 control-label">Email Address</label>

                <div class="col-sm-5">
                    <input type="text" class="form-control" id="email" placeholder="Enter Email Address">
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
