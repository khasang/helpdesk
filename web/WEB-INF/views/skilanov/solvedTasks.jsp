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

            <h3>Can't use your site functions, what's wrong?</h3>

            <h3>User:Mike Smith</h3>

            <h3>Date:11.06.2016</h3>

            <h3>Answer</h3>

            <h3>Dear Mike, sorry our web site works in the test mode, I hope we start work correctly 20.07.2016</h3>
            <td><a class="btn btn-default btn-xs" href="/answerTask" role="button">Edit</a>
                <a class="btn btn-danger btn-xs" href="/solvedTasks" role="button">Delete</a>
                <a class="btn btn-default btn-xs" href="/desk" role="button">Cancel</a>
            </td>
        </div>
    </div>
</div>
<jsp:include page="tags/footerPage.jsp"></jsp:include>
</body>
</html>

