<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset=’UTF-8’>
    <title>foundtask</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css"/>
    <script type="text/javascript" src="../js/welcome.js"></script>
</head>

<body>
<p>Data for your task</p>
<table border="1" width="500" height="100" class="tg">
    <caption><h1>Table assignments</h1></caption>
    <th>description</th>
    <c:forEach items="${found}" var="task">
        <tr>
            <td><c:out value="${task.description}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>