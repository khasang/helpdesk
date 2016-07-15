<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>
<div class="block">
    <h1>You in task page</h1>
</div>
<h2>${taskId}</h2>
<p>Task description</p>
    <c:forEach items="${task}" var="tasks">
        <textarea cols="70" rows="20"><c:out value="${tasks.description}"/></textarea>
    </c:forEach>
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
