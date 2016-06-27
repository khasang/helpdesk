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
        <a href="${pageContext.request.contextPath}/displayUser">Display</a>
    </div>
</div>

</body>
</html>
