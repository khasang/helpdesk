<jsp:include page="tags/topPage.jsp"/>
<html>
<head>
    <title>Help Desk</title>

    <p align="right"><a class="btn btn-info btn-xs" href="/signIn" role="button">Sign In</a>
        <a class="btn btn-info btn-xs" href="/registration" role="button">Registration</a></p>

    <jsp:include page="css/background.jsp"/>
</head>
<body>
<div class="page-header">
    <img src="images/helpDesk.png" class="center-pill">
</div>

<h1><p class="text-center"> Welcome to the Help Desk Web Site</p></h1>
<p>${crypt}</p>

<div class="btn-group-vertical">
    <a class="btn btn-primary btn-lg" href="/" role="button">Home Page</a>
    <a class="btn btn-default btn-lg" href="/admin" role="button">Admin Page</a>
    <a class="btn btn-default btn-lg" href="/desk" role="button">Desk Page</a>
    <a class="btn btn-default btn-lg" href="/maps" role="button">Maps Page</a>
    <a class="btn btn-default btn-lg" href="/news" role="button">News Page</a>
</div>

<div class="content">
    A help desk is a resource intended to provide the customer or end user with information and support related to a
    company's or institution's products and services.The purpose of a help desk is usually to troubleshoot problems or
    provide guidance about products such as computers, electronic equipment, food, apparel, or software. Corporations
    usually provide help desk support to their customers through various channels such as toll-free numbers, websites,
    instant messaging, or email. There are also in-house help desks designed to provide assistance to employees.
</div>
</body>
</html>
