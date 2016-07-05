<%--
  Created by IntelliJ IDEA.
  User: Mike
  Date: 14.06.2016
  Time: 4:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />-->
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

   <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.0/jquery.min.js"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.9/jquery-ui.min.js"></script>



    <script type="text/javascript" src="js/main.js"></script>

    <title>HelpDesk</title>
</head>
<body>
<div class="container-fluid wrapper">
    <div class="row">
        <div class="col-md-7">
            <ul class="main-menu">
                <li><a href="#">Dashboard</a></li>
                <li><a href="#">Tasks</a></li>
                <li><a href="#">Reports</a></li>
                <li><a href="#">Configuration</a></li>

            </ul>
        </div>
        <div class="col-md-3">
            <input type="text" name="search" id="main-search-input">
            <img src="image/magnifying_glass.png">
        </div>
        <div class="col-md-2">
            <img src="image/profile.png">
        </div>
    </div>
    <hr>
    <div class="modul" >
        <div class="header-module">Critical task</div>
        <div class="module-description">
            <table>
                <tr>
                    <td width="20px" height="40px">1</td>
                    <td>Не отвечает узел 192.168.2.1</td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>Не отвечает узел 192.168.2.1</td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>Не отвечает узел 192.168.2.1</td>
                </tr>

            </table>
        </div>
    </div>

    <div class="module-news">
        <div class="header-module-news">News platform</div>
        <div class="description-news">
            <p>New interface</p>
            <p>Add a new function</p>
            <p>Add configuration module</p>
        </div>
    </div>



    <div class="row footer">
        <div class="col-md-12">footer</div>
    </div>
</div>

</body>
</html>
