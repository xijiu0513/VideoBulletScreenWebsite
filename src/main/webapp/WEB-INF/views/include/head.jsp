<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <script src="static/layui/layui.js"></script>
</head>
<body>
<inc>
    <ul class="layui-nav">
        <li class="layui-nav-item">
            <a href="">主界面</a>
        </li>
        <c:if test="${empty LoginUser}">
            <li class="layui-nav-item" style="float: right">
                <a href="/Login">登录</a>
            </li>
            <li class="layui-nav-item" style="float: right">
                <a href="/Register">注册</a>
            </li>
        </c:if>
        <c:if test="${not empty LoginUser}">
            <li class="layui-nav-item" style="float: right">
                <a><img src="static/headResouces/${LoginUser.userProfilepic}" class="layui-nav-img">&nbsp;</a>
                <dl class="layui-nav-child">
                    <dd><a href="personal/edit">我  的</a></dd>
                    <dd><a href="/Logout">下  线</a></dd>
                </dl>
            </li>
        </c:if>
    </ul>
</inc>
<script>
    layui.use(['element', function () {
        var element = layui.element;
    }])
</script>

</body>
</html>
