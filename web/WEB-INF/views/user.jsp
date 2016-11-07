<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Angular User page</title>
    <%--<spring:url value="//angular.min.js" var="angularjs">--%>
    <script src="js/angular.min.js"></script>
    <%--<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.9/angular.min.js>"></script>--%>
    <%--<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.9/angular-route.min.js>"></script>--%>
</head>
<body>
<h1>Users</h1>
<div ng-app="mainApp"></div>
    <a href="#addUser.htm">Add User</a>
    <div ng-view></div>
    <script type="text/ng-template" id="addUser.htm">
        <h2>Add User</h2>
        Login: <input type="text" ng-model="users.login" required><br/><br/>
        Password: <input type="text" ng-model="users.password" required><br/><br/>
        E-mail: <input type="text" ng-model="users.email" required><br/><br/>
        <select name="role"  ng-model="users.role">
            <option value="ROLE_ADMIN">admin</option>
            <option value="ROLE_USER">users</option>
        </select>
        <input type="button" ng-click="createUser()" value="Save"><br/><br/>
    </script>
    <script type="text/ng-template" id="editUser.htm">
        <h2>Edit User</h2>
        Login: <input type="text" ng-model="users.login" required><br/><br/>
        Password: <input type="text" ng-model="users.password" required><br/><br/>
        E-mail: <input type="text" ng-model="users.email" required><br/><br/>
        <select name="role" ng-model="users.role">
            <option value="ROLE_ADMIN">admin</option>
            <option value="ROLE_USER">users</option>
        </select>
        <input type="button" ng-click="saveUser()" value="Save"><br/><br/>
    </script>
    <script type="text/ng-template" id="viewUser.htm">
        <h2>List User</h2>
        Search: <input type="text" ng-model="search"><br/><br/>
        <table border="0">
            <tr ng-repeate="users in users | filter : search">
                <td>{{ng-model="users.login"}}</td>
                <td>{{ng-model="users.password"}}</td>
                <td>{{ng-model="users.email"}}</td>
                <td><a href="" ng-click="editUser(users)">edit</a></td>
                <td><a href="" ng-click="deleteUser(users)">edit</a></td>
            </tr>
        </table>

    </script>
<%--</spring:url>--%>
<script>
    var mainApp = angular.module("mainApp", ['ngRoute']);

    mainApp.service('UserService',
        function(){
            var saveData={}
            function set(data) {
                saveData = data;
            }
            function get() {
                return saveData;
            }

            return{
                set: set,
                get: get
            }
        });

    mainApp.config(['$routeProvider',
        function ($routeProvider) {
            $routeProvider.when('/addUser',{
                templateUrl: 'addUser.htm',
                controller: 'AddUserController'
            }).when('/editUser',{
                templateUrl: 'editUser.htm',
                controller: 'EditUserController'
            }).when('/viewUser',{
                templateUrl: 'viewUser.htm',
                controller: 'ListUserController'
            }).otherwise({
                redirectTo: '/viewUser'
            });

        }]);

    mainApp.controller('AddUserController', function ($scope, $http, $location) {
        $scope.createUser = function(){
            $http.post("/user", $scope.user).success(
                function (response) {
                    $location.path("/viewUser");
                });
        }
    });

    mainApp.controller('EditUserController', function ($scope, $http, $location, UserService) {
       $scope.user = UserService.get();
        $scope.saveUser = function(user){
            $http.put("/user").success(function (response) {
                $location.path("/viewUser");
            });
        }
    });

    mainApp.controller('ListUserController', function ($scope, $http, $location, UserService) {
        $http.get("/user").success(function (response) {
            $scope.user = response;
        });

        $scope.editUser = function(user){
            UserService.set(user);
                $location.path("/editUser");
        };

        $scope.deleteUser = function(user){
           $http.delete("/user", user).success(function (response) {
               $location.path("/viewUser");
           });
        }
    });
</script>

</body>
</html>
