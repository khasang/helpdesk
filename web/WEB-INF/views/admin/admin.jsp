<%--
  Created by IntelliJ IDEA.
  User: Alexander-PC
  Date: 12.06.2016
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin</title>
    <meta charset=’UTF-8’>
    <link rel="stylesheet" type="text/css" href="../css/style.css"/>
</head>
<body>
<div class="left_menu">
    <left>
        <form action="/">
            <input type="submit" id="Button1" description="" value="Go to Index">
        </form>
        <form action="#">
            <input type="submit" id="Button8" description="" value="Logout">
        </form>
    </left>

    <br/>
    <br/>
    <br/>
    <h1><b>Admin menu:</b></h1>
    <form action="#">
        <input type="submit" id="Button2" description="" value="Users"><br/>
        <input type="submit" id="Button3" description="" value="Moderators"><br/>
        <input type="submit" id="Button4" description="" value="Activity"><br/>
        <input type="submit" id="Button5" description="" value="Questions"><br/>
        <input type="submit" id="Button6" description="" value="Settings"><br/>
        <input type="submit" id="Button7" description="" value="Buckup"><br/>
    </form>

    <h1><b>User edit</b></h1>
    <form>
        <b>Login: </b><input type="text" value=""/><br/>
        <b>Password: </b><input type="text" value=""><br/>
        <b>Email: </b><input type="text" value=""><br/>
        <input type="submit" value="Edit">
    </form>
</div>
</body>
</html>
