<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="../inc/header.jsp"/>

<jsp:include page="../inc/menu.jsp"/>


<div style="color: red;"><c:out value="${message}"/></div>


<div class="panel panel-default">
    <div class="panel-heading">
        <spring:message code="pages.admin.users.manage"/>
    </div>
    <div class="panel-body">
        <table class="table table-hover">
            <tr class="table-header">
                <td class="col-xs-1">id</td>
                <td class="col-xs-3">login</td>
                <td class="col-xs-3">password</td>
                <td class="col-xs-3">role</td>
                <td class="col-xs-1">UPDATE</td>
                <td class="col-xs-1">DELETE</td>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                        <%--UPDATE USER FORM--%>
                    <form:form action="/admin/users/change" method="post" commandName="changeUser">
                        <td><input type="text" class="form-control" name="id" value="${user.id}" readonly></td>
                        <td><input type="text" class="form-control" name="login" value="${user.login}"></td>
                        <td><input type="text" class="form-control" name="password" value=""></td>
                        <td>
                            <select name="role" class="form-control">
                                <option value="ROLE_ADMIN"
                                        <c:if test="${user.role == 'ROLE_ADMIN'}">selected="selected"</c:if> >admin
                                </option>
                                <option value="ROLE_USER"
                                        <c:if test="${user.role == 'ROLE_USER'}">selected="selected"</c:if> >user
                                </option>
                            </select>
                        </td>
                        <td><input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <input type="submit" class="btn btn-primary" value="Update">
                        </td>
                    </form:form>

                        <%--DELETE USER FORM--%>
                    <form:form action="/admin/users/delete" method="post" commandName="deleteUser">
                        <td>

                            <input type="hidden" name="id" value="${user.id}">
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <input type="submit" class="btn btn-danger" value="Delete">

                        </td>
                    </form:form>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

<div class="panel panel-default">
    <div class="panel-heading">
        <spring:message code="pages.admin.users.create"/>
    </div>
    <div class="panel-body">
        <form:form action="/admin/users/register" method="post" commandName="registerUser" cssClass="form-inline form-group-sm">
            <label for="login">Login:</label><input type="text" id="login" class="form-control" name="login">
            <label for="password">Password:</label><input type="text"  id="password" class="form-control" name="password">
            <label for="role">Role:</label>
            <select name="role" id="role" class="form-control">
                <option value="ROLE_ADMIN">admin</option>
                <option value="ROLE_USER">user</option>
            </select>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input type="submit" class="btn btn-success" value="Add user">
        </form:form>

    </div>
</div>
