<html lang="en">
<jsp:include page="tags/headerPage.jsp"></jsp:include>
<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-2 sidenav">
            <p><a href="/admin/allUsers" role="button">Users list</a></p>
            <p><a href="/" role="button">Logout</a></p>
            <p><a href="/admin" role="button">Backup</a></p>
        </div>
        <div class="col-sm-8 text-left">
            <p class="text-justify">
                Hi!
                This is an admin page. There you can view all users list, edit or delete any user. Also you can make a backup.
            </p>
        </div>
    </div>
</div>
<jsp:include page="tags/footerPage.jsp"></jsp:include>
</body>
</html>
