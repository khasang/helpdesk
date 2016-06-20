<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.login}</td>
                <td>${user.password}</td>
                <td>${user.role}</td>
            </tr>
        </c:forEach>
    </table>
</div>

<div class="left_menu">
    <hr/>
    <h5>Admin menu</h5>
    <a href="/admin/users">Users</a><br/>
</div>

<jsp:include page="../include/footer.jsp"/>
