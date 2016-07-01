<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="../inc/header.jsp"/>

<jsp:include page="../inc/admin_menu.jsp"/>
<div class="row">
    <div class="col-md-4">
        <div class="panel panel-default" style="min-height: 200px;">
            <div class="panel-heading">Create backup</div>
            <div class="panel-body">
                <form role="form" method="GET" action="<c:url value="/admin/backup/create"/>">
                    <button type="submit" class="btn btn-primary">Download backup</button>
                </form>
            </div>
        </div>
    </div>

    <div class="col-md-8">
        <div class="panel panel-default" style="min-height: 200px;">
            <div class="panel-heading">Restore from backup</div>
            <div class="panel-body">
                <form role="form" method="POST" enctype="multipart/form-data"
                      action="/admin/backup/restore?${_csrf.parameterName}=${_csrf.token}">
                    <label class="btn btn-default btn-file">
                        Choose file <input type="file" name="file" style="display: none;">
                    </label>
                    <button type="submit" class="btn btn-danger">Restore</button>
                    <div style="display: inline-block; float: right; color: red;">
                        <c:out value="${message}"/>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../inc/footer.jsp"/>