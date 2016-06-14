<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="topTags.jsp"/>
<html>
<head>
    <title>Delete User</title>
    <link rel="stylesheet" href="css/deleteUser.css">
</head>
<body>
<div class="container">
    <div id="leftSubContainer">
        <div id="admin">
            <h4>Users Administration</h4>
            <li><a href="/createUser">Create User</a></li>
            <li><a href="/deleteUser">Delete User</a></li>
            <li><a href="#">Edit User</a></li>
        </div>
        <div id="bckup">
            <h4>Backup</h4>
            <li><a href="#">Create Backup</a></li>
            <li><a href="#">Delete Backup</a></li>
            <li><a href="#">Apply Backup</a></li>
        </div>
    </div>
    <div id="delete">
        <h4>Delete User</h4>
    </div>
</div>

</body>
</html>
