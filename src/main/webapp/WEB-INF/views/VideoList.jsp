<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>视频弹幕网站</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <script src="static/layui/layui.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/VideoList.css"/>

</head>

<body style="background-image: linear-gradient(-225deg, #69EACB 0%, #EACCF8 48%, #6654F1 100%);">
<jsp:include page="/head"></jsp:include>
<div class="Listbody">
    <c:forEach items="${videoList}" var="video" varStatus="st">
        <div class="VideoMessage">
            <div class="VideoAuthor">
                <div class="Authorhead">
                    <img src="static/headResouces/${video.user.userProfilepic}"/>
                </div>
                <div class="VideoAnT">
                    <div class="AuthorName">${video.user.userNickname}</div>
                    <div class="VideoTime"><fmt:formatDate type="both" dateStyle="long" timeStyle="long"
                                                           value="${video.videoTime}"/></div>
                </div>
            </div>
            <a href="/Video/${video.videoId}">
                <div class="AboutVideo">
                    <div class="VideoPicture">
                        <img src="static/videoResouces/${video.videoPic}"/>
                    </div>

                    <div class="VideoNnD">
                        <div class="VideoName">${video.videoName}</div>
                        <div class="VideoDetails">${video.videoInfo}</div>
                    </div>
                </div>
            </a>
        </div>
    </c:forEach>
</div>
</body>
</html>


