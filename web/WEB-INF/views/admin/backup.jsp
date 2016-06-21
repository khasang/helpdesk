<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<jsp:include page="../include/menu.jsp"/>

<div class="content">
    <h3>Backup page</h3>
    <a href="/admin/doBackup">Get backup!</a>
    <hr/>
    <form method="POST" enctype="multipart/form-data" action="/admin/restore?${_csrf.parameterName}=${_csrf.token}">
        <label for="file">Click to choose sql file...</label>
        <input type="file" name="file" id="file" class="inputfile">
        <input type="submit" value="Restore">
    </form>
    <div style="color: red"><c:out value="${message}"/></div>
</div>

<jsp:include page="../include/admin_menu.jsp"/>

<jsp:include page="../include/footer.jsp"/>
