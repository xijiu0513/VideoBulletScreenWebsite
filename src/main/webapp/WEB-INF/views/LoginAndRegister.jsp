<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录注册页面</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>

    <link rel="stylesheet" href="static/layui/css/layui.css">
    <link rel="stylesheet" href="static/css/Login.css">
    <script src="static/layui/layui.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript" src="static/js/jquery-1.11.1.min.js"></script>
    <link href="static/css/Loginstyle.css" rel="stylesheet" type="text/css" media="all"/>
    <style>
        .form-module input[type="submit"] {
            background-color: #00a1d6;
        }

        .form-module input[type="submit"]:hover {
            background-color: #00b5e5;
        }
    </style>
</head>
<body>
<c:if test="${empty status}">
    <jsp:include page="/head"></jsp:include>
</c:if>

<div class="main">
    <div class="w3_login">
        <div class="w3_login_module">
            <div class="module form-module">
                <div class="toggle" style="color: black; font-size: 14px;">
                </div>
                <div class="form"
                     <c:if test="${not empty t}">style="display: none"</c:if> >
                    <h2>登录账号</h2>
                    <c:if test="${not empty ErrorLogin}"><h2 style="color: red">${ErrorLogin}</h2></c:if>
                    <form action="do/Login" method="post">
                        <input type="text" name="userAccount" placeholder="用户名" required=" "/>
                        <input type="password" name="password" placeholder="密码" required=" "/>
                        <input type="submit" value="登录"/>
                    </form>
                </div>
                <div class="form" <c:if test="${not empty t}">style="display:block;"</c:if>>
                    <h2>创建一个账号</h2>
                    <c:if test="${not empty Error}"><h2 style="color: red">${Error}</h2></c:if>
                    <form action="do/Register" method="post">
                        <input type="text" name="userAccount" placeholder="用户名" required=" "/>
                        <input type="password" name="userPassword" placeholder="密码" required=" "/>
                        <input type="email" name="Email" placeholder="Email" required=" "/>
                        <input type="text" name="userNickname" placeholder="昵称" required=" "/>
                        <input type="submit" value="注册"/>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    $('.toggle').click(function () {
        $(this).children('i').toggleClass('fa-pencil');
        $('.form').animate({
            height: "toggle",
            'padding-top': 'toggle',
            'padding-bottom': 'toggle',
            opacity: "toggle"
        }, "slow");
    });
</script>
</html>
