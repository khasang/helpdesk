<jsp:include page="tags/topPage.jsp"/>
<html>
<head>
    <title>Desk Page</title>

    <form role="form">

        <div class="form-group">
            <label>Search</label>
            <input type="text" class="form-control" placeholder="Text input">
        </div>

    </form>
    <jsp:include page="tags/background.jsp"/>
</head>
<body>

<div class="page-header">
    <img src="/resources/images/helpDesk.png" class="center-pill">
</div>
<div class="btn-group-vertical">
    <a class="btn btn-primary btn-lg" href="/" role="button">Home Page</a>
    <a class="btn btn-default btn-lg" href="/desk/activeTasks" role="button">Active Tasks</a>
    <a class="btn btn-default btn-lg" href="/desk/solvedTasks" role="button">Solved Tasks</a>
    <a class="btn btn-default btn-lg" href="/desk" role="button">Logout</a>
</div>
</body>
</html>
