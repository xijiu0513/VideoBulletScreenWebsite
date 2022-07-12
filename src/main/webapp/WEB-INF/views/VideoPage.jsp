<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>VideoPageTest-${video.videoName}</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <script src="static/js/jquery-3.4.1.min.js"></script>
    <script src="static/layui/layui.js"></script>
    <script src="static/js/Danmaku.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/Video.css"/>
    <link rel="stylesheet" type="text/css" href="static/css/report.css"/>
    <script src="static/js/danmaku_core/lib/jquery-1.11.1.min.js"></script>
    <link rel="stylesheet" href="static/css/danmuplayer.css">
    <script src="static/js/danmaku_core/danmuplayer.js"></script>

</head>
<body>
<body>
<jsp:include page="/head"></jsp:include>
<div class="v-wrap" style="width: 1111px; padding: 0px;">
    <div class="l-con" style="width: 761px;">
        <div class="video-info report-wrap-module report-scroll-module">
            <h1 title="${video.videoName}" class="video-title">
                <input type="hidden" id="videoId" value="${video.videoId}">
                <span class="tit tr-fix">${video.videoName}</span>
            </h1>
            <div class="video-data">
						<span class="a-crumbs">
							<a target="_blank" href="">${video.videotypepojo.videotypeName}</a>
							<i class="van-icon-general_enter_s"></i>
							<a target="_blank" href=""></a>
						</span>
                <span><fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${video.videoTime}"/></span>
            </div>
        </div>
        <div class="player-wrap" style="height: auto;">
            <div style="width: 761px; height: 562px; position: static;">
                <div class="player" style="width:100%;height:100%;">
                    <div class="bilibili-player relative __pakku_injected bilibili-player-no-cursor">
                        <div class="bilibili-player-area video-state-blackside video-state-pause progress-shadow-show">
                            <div id="danmakuPlayer"></div>
                            <div class="bilibili-player-video-bottom-area">
                                <div class="bilibili-player-video-sendbar">
                                    <div class="bilibili-player-video-danmaku-root">
                                        <span class="shezhi layui-btn layui-btn-radius layui-btn-primary layui-btn-sm"
                                              id="danmu_send_opt">弹幕设置</span>
                                    </div>
                                    <div class="bilibili-player-video-inputbar focus">
                                        <div class="bilibili-player-video-inputbar-wrap">
                                            <div class="bilibili-player-video-btn bilibili-player-video-btn-danmaku relative"
                                                 style="display: block;">
														<span class="bilibili-player-iconfont bilibili-player-iconfont-danmakutype">
															<span class="bp-svgicon">
																<i class="layui-icon layui-icon-fonts-u "
                                                                   style="color: #757575;"></i>
															</span>
														</span>
                                            </div>
                                            <input class="bilibili-player-video-danmaku-input" placeholder="发个友善的弹幕见证当下"
                                                   style="" id="danmu_text">
                                        </div>
                                        <div class="bilibili-player-video-btn-send bui bui-button bui-button-blue"
                                             <c:if test="${empty LoginUser}">onclick="send_danmu()" </c:if>
                                             <c:if test="${not empty LoginUser}">onclick="send_danmu()" </c:if> >发送
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
    <div class="r-con">
        <div class="up-info report-wrap-module report-scroll-module">
            <div class="u-face">
                <a href="" target="_blank" report-id="head" class="fa">
                    <img src="static/headResouces/${video.user.userProfilepic}" width="48" height="48" class="up-face">
                </a>
            </div>
            <div class="u-info">
                <div class="name" style="line-height:20px;height:20px;">
                    <a href="" target="_blank" report-id="name" class="username is-vip">${video.user.userNickname}</a>
                </div>
                <div title="${video.user.userAboutself}" class="desc">
                    ${video.user.userAboutself}
                </div>
            </div>
            <div class="btn-panel">
            </div>
        </div>
        <div class="danmaku-box" style="height: auto;">
            <div class="danmaku-wrap">
                <div class="player-auxiliary">
                    <div class="player-auxiliary-area relative">
                        <div class="player-auxiliary-collapse bui bui-collapse">
                            <div class="bui-collapse-wrap">
                                <div class="bui-collapse-header">
                                    <div class="bui-collapse-arrow">
                                        <span class="bui-collapse-arrow-text">收起</span>
                                    </div>
                                    <div class="player-auxiliary-filter">
                                        <span class="player-auxiliary-filter-title">弹幕列表</span>
                                        <i class="layui-icon layui-icon-more-vertical"></i>
                                    </div>
                                </div>
                                <div class="bui-collapse-body">
                                    <div class="player-auxiliary-wraplist">
                                        <div class="player-auxiliary-filter-wrap player-auxiliary-danmaku">
                                            <div class="player-auxiliary-danmaku-function" style="">
                                                <div class="player-auxiliary-danmaku-btn-time" orderby="stime">时间</div>
                                                <div class="player-auxiliary-danmaku-btn-danmaku" orderby="text"
                                                     title="当前弹幕：4415 普通弹幕上限：8000">弹幕内容 ( <span
                                                        class="player-auxiliary-danmaku-number-span">==</span> )
                                                </div>
                                                <div class="player-auxiliary-danmaku-btn-date" orderby="date">发送时间</div>
                                            </div>
                                            <div class="player-auxiliary-danmaku-wrap" style="height: 445px;">
                                                <div class="player-auxiliary-danmaku-contaner player-auxiliary-bscrollbar"
                                                     style="overflow-y: auto;touch-action: pan-x; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);">
                                                    <input type="hidden" id="LoginStatus"
                                                           value="<c:if test="${empty LoginUser}">notLogin</c:if><c:if test="${not empty LoginUser}">Login</c:if>">
                                                    <ul class="player-auxiliary-danmaku-list bpui-component bpui-undefined bpui-selectable"
                                                        id="DanmakuList"
                                                        style="height: auto; transition-timing-function: cubic-bezier(0.23, 1, 0.32, 1); transition-duration: 0ms; transform: translate(0px, 0px) scale(1) translateZ(0px);">
                                                    </ul>
                                                    <div class="bscroll-vertical-scrollbar">
                                                        <div class="bscroll-indicator">

                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>


<script>
    layui.use(['colorpicker', 'table', 'form', 'layer'], function () {
        var colorpicker = layui.colorpicker;
        var form = layui.form;
        var layer = layui.layer;
        //表单赋值
        colorpicker.render({
            elem: '#colorpicker'
            , color: '#000000'
            , predefine: true
            , done: function (color) {
                $('#DanmakuColor').val(color);
            }
        });
    });

    var DanmakuData = getDanmakuData(${video.videoId});

    $("#danmakuPlayer").danmuplayer({
        src: "static/videoResouces/${video.videoUrl}",       //视频源
        width: 761,            //视频宽度
        height: 516,            //视频高度/sendDanmakuByUrl/{videoId}
        url_to_get_danmu: "/getDanmakuDataByUrl/${video.videoId}", //用来接收弹幕信息的url
        url_to_post_danmu: "/sendDanmakuByUrl/${video.videoId}", //用来存储弹幕信息的url
    });


</script>

</body>
</body>
</html>
