<jsp:include page="tags/topPage.jsp"/>
<html>
<head>
    <title>Admin Page</title>
    <jsp:include page="tags/background.jsp"/>
</head>
<div class="page-header">
    <img src="/resources/images/helpDesk.png" class="center-pill">
</div>
<body>
<h1>Admin Page</h1>

<div class="btn-group-vertical">
    <a class="btn btn-primary btn-lg" href="/" role="button">Home Page</a>
    <a class="btn btn-default btn-lg" href="/admin/saveUser" role="button">Add User</a>
    <a class="btn btn-default btn-lg" href="/admin/saveUser" role="button">Edit User</a>
    <a class="btn btn-default btn-lg" href="/admin" role="button">Delete User</a>
    <a class="btn btn-default btn-lg" href="/admin" role="button">Logout</a>
    <a class="btn btn-default btn-lg" href="/admin" role="button">Backup</a>
</div>
</body>
</html>
