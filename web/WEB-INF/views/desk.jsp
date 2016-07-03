<html lang="en">
<jsp:include page="tags/headerPage.jsp"></jsp:include>
<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-2 sidenav">
            <p><a href="/activeTasks" role="button">Active Tasks</a></p>
            <p><a href="/solvedTasks" role="button">Solved Tasks</a></p>
            <p><a href="/" role="button">Logout</a></p>
        </div>
        <div class="col-sm-8 text-left">
            <p class="text-justify">
                Hi!
                This is a desk page. There you can view active an solved tasks. Also you can edit or delete any task.
            </p>
        </div>
    </div>
</div>
<jsp:include page="tags/footerPage.jsp"></jsp:include>
</body>
</html>


