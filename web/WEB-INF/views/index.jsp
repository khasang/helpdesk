<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>You are welcome</h1>
    <h2>${index}</h2>
    <div class = "conteiner">
        <input type="text" id="login" placeholder="login" class="form-control" required autofocus>
        <br>
        <input type="text" id="password" placeholder="password" class="form-control" required autofocus>
        <br>
        <button class="button">Sing in</button>
    </div>

</body>
    <footer>
        <div class="links">
            <a href="/admin">Admin page</a>
            <a href="/desk">Main page</a>
        </div>
    </footer>
</html>
