<jsp:include page="tags/topPage.jsp"/>
<html>
<head>
    <title>Sign In</title>
    <jsp:include page="tags/background.jsp"/>
</head>
<body>
<div class="page-header">
    <img src="/resources/images/helpDesk.png" class="center-pill">
</div>
<form class="form-horizontal" role="form">

    <div class="form-group">
        <label for="login" class="col-sm-2 control-label">Login</label>

        <div class="col-sm-5">
            <input type="text" class="form-control" id="login" placeholder="Enter Login">
        </div>
    </div>

    <div class="form-group">
        <label for="password" class="col-sm-2 control-label">Password</label>

        <div class="col-sm-5">
            <input type="text" class="form-control" id="password" placeholder="Enter Password">
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
                <label><input type="checkbox"> Remember me</label>
            </div>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Sign in</button>
            <a class="btn btn-default" href="/" role="button">cancel</a>
        </div>
    </div>

</form>
</body>
</html>
