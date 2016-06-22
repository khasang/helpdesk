<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../include/header.jsp"/>

<jsp:include page="../include/menu.jsp"/>

<div class="content">
    <h3>Users:</h3>
    <table style="font-size: 12px;">
        <tr>
            <td>id</td>
            <td>login</td>
            <td>password</td>
            <td>role</td>
            <td>UPDATE</td>
            <td>DELETE</td>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                    <%--UPDATE USER FORM--%>
                <form:form action="/admin/users/change" method="post" commandName="changeUser">
                    <td><input type="text" name="id" value="${user.id}" readonly></td>
                    <td><input type="text" name="login" value="${user.login}"></td>
                    <td><input type="text" name="password" value=""></td>
                    <td>
                        <select name="role">
                            <option value="ROLE_ADMIN"
                                    <c:if test="${user.role == 'ROLE_ADMIN'}">selected="selected"</c:if> >admin
                            </option>
                            <option value="ROLE_USER"
                                    <c:if test="${user.role == 'ROLE_USER'}">selected="selected"</c:if> >user
                            </option>
                        </select>
                    </td>
                    <td><input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        <input type="submit" value="Update">
                    </td>
                </form:form>

                    <%--DELETE USER FORM--%>
                <td>
                    <form:form action="/admin/users/delete" method="post" commandName="deleteUser">
                        <input type="hidden" name="id" value="${user.id}">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        <input type="submit" value="Delete">
                    </form:form>
                </td>
            </tr>
        </c:forEach>
    </table>
    <hr/>
    <h3>Add user:</h3>
    <%--NEW USER FORM--%>
    <form:form action="/admin/users/register" method="post" commandName="registerUser">
        <label for="login">Login:</label><input type="text" id="login" name="login">
        <label for="password">Password:</label><input type="text" id="password" name="password">
        <label for="role">Role:</label>
        <select name="role" id="role">
            <option value="ROLE_ADMIN">admin</option>
            <option value="ROLE_USER">user</option>
        </select>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Add user">
    </form:form>

    <div class="message"><c:out value="${message}"/></div>
</div>


<jsp:include page="../include/admin_menu.jsp"/>

<jsp:include page="../include/footer.jsp"/>
