<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="topTags.jsp"/>
<html>
<head>
    <title>Display User</title>
</head>
<body>
<div class="container">
    <jsp:include page="leftPanelMenu.jsp"/>
    <div id="centralWindow">
        <h4>Display User</h4>
        <table border = 0>
            <th>id</th>
            <th>Name</th>
            <th>role_id</th>
            <th>password</th>
            <th>login</th>

            <c:forEach var="user" items="${users}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${user.name}</td>
                    <td>${user.role_id}</td>
                    <td>${user.password}</td>
                    <td>${user.login}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

</body>
</html>
