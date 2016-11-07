<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<p>
<div class="block">
    <h1>You in task page</h1>
</div>

<%--<h1>Task number is ${description.id}</h1>--%>
<h1>
    <c:forEach items="${description}" var="description">
        <c:out value="${description.id}"/>
    </c:forEach>
</h1>
<table border="1" width="500">
    <th>Description</th>
    <c:forEach items="${description}" var="description">
        <tr>
            <td><c:out value="${description.description}"/></td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="submit" value="confirm task">
<input type="submit" value="close task">
<input type="submit" value="redirect task">
<br>
<textarea cols="70" rows="10"></textarea>
<br>
<input type="submit" value="leave comment">
<p>status</p>
<form>
    <select>
        <option value="new">new</option>
        <option value="in work">in work</option>
        <option value="closed">closed</option>
    </select>
</form>
</body>
<footer>
    <div class="links">
        <a href="/desk">back to Main page</a>
    </div>
</footer>
</html>
