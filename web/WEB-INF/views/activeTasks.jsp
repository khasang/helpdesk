<html lang="en">
<jsp:include page="tags/headerPage.jsp"></jsp:include>
<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-2 sidenav">
            <p><a href="/activeTasks" role="button">Active Tasks</a></p>
            <p><a href="/solvedTasks" role="button">Solved Tasks</a></p>
            <p><a href="/desk" role="button">Logout</a></p>
        </div>
        <div class="col-sm-8 text-left">
            <h3>#question 0002</h3>

            <h3>What's wrong with your site, I tried to use your menu, but nothing works correctly!!!</h3>

            <h3>User:Sam Kilanoff</h3>

            <h3>Date:12.06.2016</h3>

            <td><a class="btn btn-default btn-xs" href="/answerTask" role="answer">Answer</a>
                <a class="btn btn-default btn-xs" href="/desk" role="button">Cancel</a>
            </td>
        </div>
    </div>
</div>
<jsp:include page="tags/footerPage.jsp"></jsp:include>
</body>
</html>
