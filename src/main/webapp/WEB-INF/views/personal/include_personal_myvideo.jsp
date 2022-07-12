<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <script src="static/layui/layui.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/personal.css"/>
    <link rel="stylesheet" type="text/css" href="static/css/MyVideo.css"/>
</head>
<body>
<div class="security-right">
    <div class="security-right-title">
        <span class="security-right-title-icon"></span>
        <span class="security-right-title-text">我的视频</span>
    </div>
    <div class="section video">
        <div class="list">
            <div id="submit-video-list" class="content">
                <ul class="list-list">
                    <c:forEach items="${videoList}" var="video" varStatus="status">
                        <li class="list-item clearfix fakeDanmu-item new">
                            <a href="/Video/${video.videoId}" class="cover">
                                <img src="static/videoResouces/${video.videoPic}"/>
                            </a>
                            <div class="c">
                                <div class="title-row">
                                    <a href="/Video/${video.videoId}" title="${video.videoName}"
                                       class="title">
                                            ${video.videoName}
                                    </a>
                                </div>
                                <div title="${video.videoInfo}" class="desc">
                                        ${video.videoInfo}
                                </div>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>
</div>
</body>
</html>
