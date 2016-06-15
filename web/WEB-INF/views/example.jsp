<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Example</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>

<body>

<h1>${tail}</h1>
<br/>
<h2>qweqe</h2>
<h3>qweqe</h3>
<h4>qweqe</h4>
<h5>qweqe</h5>
<h7>qweqe</h7>
<p>Hello wor<sub>qweqeqeqe</sub>ld</p>
<p>Hello world</p>
<p>Hello worl<sup>qqeqe</sup>d</p>

<u><b><p>Hello world</p></b></u>
  <img src="https://im1-tub-ru.yandex.net/i?id=bf79b684f599ae6e84bc9f0a6c4f3ae7&n=33&h=215&w=344"/>


<div class="container">
  <form class="form-signin" action="/news/save">
    <h2 class="form-signin-heading">Add news:</h2>
    <label for="title">Title:</label>
    <input type="text" id="title" value="${item.title}" class="form-control" placeholder="Title" required autofocus>
    <button class="btn btn-md btn-success btn-block" type="submit">Add</button>
  </form>
</div>
<p class="lead">
  <a href="http://yandex.ru" class="btn btn-lg btn-default">Enter</a>
</p>
</body>
</html>