<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <script src="static/layui/layui.js"></script>
    <script src="static/js/jquery-3.4.1.min.js"></script>
    <script src="static/js/Danmaku.js"></script>
    <script src="static/js/Complaint.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/personal.css"/>
    <link rel="stylesheet" type="text/css" href="static/css/MyVideo.css"/>
    <link rel="stylesheet" type="text/css" href="static/css/DanmakuManager.css"/>
    <link rel="stylesheet" type="text/css" href="static/css/ComplaintManager.css"/>
</head>
<body>
<div class="security-right">
    <div class="security-right-title">
        <span class="security-right-title-icon"></span>
        <span class="security-right-title-text">弹幕举报状态</span>
    </div>
    <div id="PageList" style="margin-left: 10px"></div>
    <ul class="danmakuList layui-elip">
        <li><span class="videoTitleName">视频标题</span><span class="danmakutime">时间</span><span
                class="danmakucontent">内容</span><span class="complainttype">举报类型</span><span class="complaint_describe">举报理由</span><span
                class="danmakustatus">状态</span><span class="danmakumanager">操作</span></li>
        <hr>
        <ul id="biuuu_city_list"></ul>
    </ul>
</div>
<script>
    layui.use(['laypage', 'layer'], function () {
        var layer = layui.layer;
        var laypage = layui.laypage;
        var data = getComplaintJsonData();
        laypage.render({
            elem: 'PageList'
            , count: data.length
            , jump: function (obj) {
                document.getElementById('biuuu_city_list').innerHTML = function () {
                    var arr = []
                        , thisData = data.concat().splice(obj.curr * obj.limit - obj.limit, obj.limit);
                    layui.each(thisData, function (index, item) {
                        var ComplaintManagerLayout = getComplaintManagerLayout(item);
                        arr.push(ComplaintManagerLayout.innerHTML);
                    });
                    return arr.join('');
                }();
            }
        });

    });


</script>
</body>
</html>
