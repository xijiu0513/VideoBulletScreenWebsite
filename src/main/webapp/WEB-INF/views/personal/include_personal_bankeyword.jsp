<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="static/layui/css/layui.css">
    <script src="static/layui/layui.js"></script>
    <script src="static/js/jquery-3.4.1.min.js"></script>
    <script src="static/js/Danmaku.js"></script>

    <link rel="stylesheet" type="text/css" href="static/css/personal.css"/>
    <link rel="stylesheet" type="text/css" href="static/css/BanKeyword.css"/>
</head>
<body>
<div class="security-right">
    <div class="security-right-title">
        <span class="security-right-title-icon"></span>
        <!-- <span class="security-right-title-text">屏蔽词管理</span> -->
    </div>
    <form class="layui-form" action="">
        <div class="KeywordInput">
            <input type="text" id="bankeywordtext" name="title" required lay-verify="required" placeholder="请输入需要屏蔽的关键词"
                   autocomplete="off" class="layui-input">
            <a id="addBanKeyword" class="layui-btn layui-btn-normal">添加</a>
        </div>
    </form>
    <div class="KeywordList" id="KeywordList">
        <c:forEach items="${banKeywords}" var="bankeyword" varStatus="status">
            <div class="Keyword" id="bankeyword${bankeyword.banKeywordId}">
                <div class="Keywordtext layui-elip"
                     title="${bankeyword.banKeywordString}">${bankeyword.banKeywordString}</div>
                <i class="layui-icon" onclick="removebankeyword(${bankeyword.banKeywordId})">&#x1006;</i>
            </div>
        </c:forEach>
    </div>
</div>
<script>
    layui.use('layer', function () {
        var layer = layui.layer;

    });
</script>
</body>
</html>
