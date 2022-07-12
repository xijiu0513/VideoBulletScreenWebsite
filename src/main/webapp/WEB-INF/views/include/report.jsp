<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <script src="static/js/jquery-3.4.1.min.js"></script>
    <script src="static/layui/layui.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/report.css"/>
    <script src="static/js/Danmaku.js"></script>
</head>
<body>
<div class="player-auxiliary-danmaku-report-box">
    <div class="player-auxiliary-danmaku-report-panel">
        <div class="player-auxiliary-report-panel-title">
            举报弹幕
            <i class="player-auxiliary-iconfont player-auxiliary-panel-close icon-close"></i>
        </div>
        <hr>
        <div class="player-auxiliary-report-content" title="${danmaku.danmakuContent}">${danmaku.danmakuContent}</div>
        <div class="player-auxiliary-report-select-list-wrap">
            <div class="player-auxiliary-panel-setting">
                <div class="player-auxiliary-setting-btn-wrap">
                    <div class="layui-form">
                        <div class="player-auxiliary-radios bui bui-radio">
                            <select id="complaintType" name="complaint" lay-verify="">
                                <option value="12">请选择一个举报类型</option>
                                <c:forEach items="${complainttypes}" var="complainttype" varStatus="status">
                                    <option value="${complainttype.complainttypeId}">${complainttype.complainttypeName}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <br/>
                        <input type="text" name="title" id="complaintContext" required lay-verify="required"
                               placeholder="输入举报理由" autocomplete="off" class="layui-input">
                    </div>
                </div>
            </div>
        </div>
        <div class="player-auxiliary-danmaku-report-bottom">
            <div class="player-auxiliary-danmaku-report-submit bui bui-button bui-button-blue"
                 onclick="postComplaint(${danmaku.danmakuId})">确定
            </div>
        </div>
    </div>
</div>

<script>
    layui.use('form', function () {
        var form = layui.form;

    });
</script>
</body>
</html>
