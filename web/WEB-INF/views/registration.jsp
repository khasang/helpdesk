<jsp:include page="tags/topPage.jsp"/>
<html>
<head>
    <title></title>
    <jsp:include page="css/background.jsp"/>
</head>
<body>
<div class="page-header">
    <img src="images/helpDesk.png" class="center-pill">
</div>
<form class="form-horizontal" role="form">

    <div class="form-group">
        <label for="firstname" class="col-sm-2 control-label">First Name</label>

        <div class="col-sm-5">
            <input type="text" class="form-control" id="firstname" placeholder="Enter First Name">
        </div>
    </div>

    <div class="form-group">
        <label for="lastname" class="col-sm-2 control-label">Last Name</label>

        <div class="col-sm-5">
            <input type="text" class="form-control" id="lastname" placeholder="Enter Last Name">
        </div>
    </div>

    <div class="form-group">
        <label for="email" class="col-sm-2 control-label">Email Address</label>

        <div class="col-sm-5">
            <input type="text" class="form-control" id="email" placeholder="Enter Your Email Address">
        </div>
    </div>

    <div class="form-group">
        <label for="password" class="col-sm-2 control-label">Password</label>

        <div class="col-sm-5">
            <input type="text" class="form-control" id="password" placeholder="Enter Password">
        </div>
    </div>

    <div class="form-group">
        <label for="confirmPassword" class="col-sm-2 control-label">Password Confirmation</label>

        <div class="col-sm-5">
            <input type="text" class="form-control" id="confirmPassword" placeholder="Confirm Your Password">
        </div>
    </div>


    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Registration</button>
            <a class="btn btn-default" href="/" role="button">cancel</a>
        </div>
    </div>

</form>
</body>
</html>
