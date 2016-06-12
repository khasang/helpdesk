<jsp:include page="tags/topPage.jsp"/>
<html>
<head>
    <title></title>
    <jsp:include page="tags/background.jsp"/>
</head>
<body>
<div class="container">
    <h1>Add User</h1>

    <form class="form-horizontal" role="form">

        <div class="form-group">
            <label for="firstName" class="col-sm-2 control-label">First Name</label>

            <div class="col-sm-5">
                <input type="text" class="form-control" id="firstName" placeholder="Enter First Name">
            </div>
        </div>

        <div class="form-group">
            <label for="secondName" class="col-sm-2 control-label">Second Name</label>

            <div class="col-sm-5">
                <input type="text" class="form-control" id="secondName" placeholder="Enter Second Name">
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
