<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/leftPanelMenu.css">
</head>
<body>
<div id="leftSubContainer">
    <div id="admin">
        <h4>Users Administration</h4>
        <li><a href="/displayUsers">Display Users</a></li>
        <li><a href="/createUser">Create User</a></li>
        <li><a href="/deleteUser">Delete User</a></li>
        <li><a href="/editUser">Edit User</a></li>
    </div>
    <div id="bckup">
        <h4>Backup</h4>
        <li><a href="/createBackup">Create Backup</a></li>
        <li><a href="/deleteBackup">Delete Backup</a></li>
        <li><a href="/applyBackup">Apply Backup</a></li>
    </div>
</div>
</body>
</html>
