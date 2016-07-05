<%--
  Created by IntelliJ IDEA.
  User: Mike
  Date: 14.06.2016
  Time: 4:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
 <!--   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />-->
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">



    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.0/jquery.min.js"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.9/jquery-ui.min.js"></script>
    <script type="text/javascript" src="js/main.js"></script>

    <title>desk</title>
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
    <div class="row">
        <div class="col-md-2">
            <p class="create-task">Create task</p>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12 tasks">
            <table width="100%">

                <tr bgcolor="#3d8ced">
                    <td class="task-header">
                        priority
                    </td>
                    <td  class="task-header">
                        id
                    </td>
                    <td  class="task-header">
                        date create
                    </td>
                    <td  class="task-header">
                        description
                    </td>
                    <td  class="task-header">
                        creator
                    </td>
                    <td  class="task-header">
                        responsible
                    </td>
                </tr>

                <tr class="task-Line">
                    <td>
                        1
                    </td>
                    <td>
                        2134
                    </td>
                    <td>
                        16.04.2016
                    </td>
                    <td>
                        Проблемы в сегменте
                    </td>
                    <td>
                        Иванов И.И.
                    </td>
                    <td>
                        Степанов И.К.
                    </td>
                </tr>

            </table>
        </div>
    </div>



    <div class="row footer">
        <div class="col-md-12">footer</div>
    </div>


</div>
</body>
</html>
