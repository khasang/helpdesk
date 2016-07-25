<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="inc/header.jsp"/>

<script type="text/javascript">
    var service = '/api/user';

    var RestGet = function (id) {
        $.ajax({
            type: 'GET',
            url: service + "/" + id,
            dataType: 'json',
            async: false,
            success: function (result) {
                $('#response').html(JSON.stringify(result));
            },
            error: function (jqXHR, textStatus, errorThrown) {
                $('#response').html(JSON.stringify(jqXHR));
            }
        });
    };

    var RestPost = function () {
        var JSONObject = {
            'login': $('#postLogin').val(),
            'password': $('#postPassword').val(),
            'role': $('#postRole').val()
        };
        $.ajax({
            type: 'POST',
            url: service,
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(JSONObject),
            dataType: 'json',
            async: false,
            success: function (result) {
                $('#response').html(JSON.stringify(result));
            },
            error: function (jqXHR, textStatus, errorThrown) {
                $('#response').html(JSON.stringify(jqXHR));
            }
        });
    };

    var RestPut = function () {
        var JSONObject = {
            'id': $('#putId').val(),
            'login': $('#putLogin').val(),
            'password': $('#putPassword').val(),
            'role': $('#putRole').val()
        };
        $.ajax({
            type: 'PUT',
            url: service,
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(JSONObject),
            dataType: 'json',
            async: false,
            success: function (result) {
                $('#response').html(JSON.stringify(result));
            },
            error: function (jqXHR, textStatus, errorThrown) {
                $('#response').html(JSON.stringify(jqXHR));
            }
        });
    };

    var RestDelete = function () {
        $.ajax({
            type: 'DELETE',
            url: service + "/" + $('#deleteId').val(),
            dataType: 'json',
            async: false,
            success: function (result) {
                $('#response').html(JSON.stringify(result));
            },
            error: function (jqXHR, textStatus, errorThrown) {
                $('#response').html(JSON.stringify(jqXHR));
            }
        });
    };
</script>
<div class="panel panel-default">
    <div class="panel-heading">
        REST API
    </div>
    <div class="panel-body">

        <table class="table">
            <thead>
            <tr>
                <th>Desctiption</th>
                <th>Method</th>
                <th>Try</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Get all users</td>
                <td><code><strong>GET</strong> /api/user/all</code></td>
                <td>
                    <button type="button" onclick="RestGet('all')">Try</button>
                </td>
            </tr>
            <tr>
                <td>Get user by id</td>
                <td><code><strong>GET</strong> /api/user/{id}</code></td>
                <td>
                    Id: <input id="userId" value="3">
                    <button type="button" onclick="RestGet($('#userId').val())">Try</button>
                </td>
            </tr>
            <tr>
                <td>Add user</td>
                <td><code><strong>POST</strong> /api/user</code></td>
                <td>
                    <form class="form-inline">
                        Login: <input type="text" value="login" id="postLogin">
                        Password: <input type="password" id="postPassword" value="pass">
                        Role:
                        <select id="postRole" class="form-control">
                            <option value="ROLE_ADMIN">admin</option>
                            <option value="ROLE_USER">user</option>
                        </select>
                        <button type="button" onclick="RestPost()">Try</button>
                    </form>
                </td>
            </tr>
            <tr>
                <td>Update user</td>
                <td><code><strong>PUT</strong> /api/user</code></td>
                <td>
                    <form class="form-inline">
                        Id: <input type="text" value="3" id="putId">
                        Login: <input type="text" value="login" id="putLogin">
                        Password: <input type="password" id="putPassword" value="pass">
                        Role:
                        <select id="putRole" class="form-control">
                            <option value="ROLE_ADMIN">admin</option>
                            <option value="ROLE_USER">user</option>
                        </select>
                        <button type="button" onclick="RestPut()">Try</button>
                    </form>
                </td>
            </tr>
            <tr>
                <td>Delete user by id</td>
                <td><code><strong>DELETE</strong> /api/user/{id}</code></td>
                <td>
                    Id: <input id="deleteId" value="4">
                    <button type="button" onclick="RestDelete()">Try</button>
                </td>
            </tr>
            </tbody>
        </table>

    </div>
</div>
<div class="panel panel-default">
    <div class="panel-heading">
        <strong>RESPONSE</strong>
    </div>
    <div class="panel-body" id="response">
    </div>
</div>
<jsp:include page="inc/footer.jsp"/>
