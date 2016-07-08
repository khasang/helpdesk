<html>
<head>
    <title>Answer Task</title>
    <jsp:include page="tags/headerPage.jsp"/>
</head>
<body>
<h3>Reply</h3>

<div class="content">
    <form role="form">
        <div class="form-group">
            <textarea cols="60" rows="3"></textarea>
        </div>
        <button type="submit" class="btn btn-default">Reply</button>
        <a class="btn btn-default" href="/desk" role="button">cancel</a>
    </form>
</div>
<jsp:include page="tags/footerPage.jsp"></jsp:include>
</body>
</html>
