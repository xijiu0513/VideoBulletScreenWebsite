<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <link rel="stylesheet" type="text/css" href="static/css/personal.css" />
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <script src="static/layui/layui.js"></script>
    <script src="static/js/jquery-3.4.1.min.js"></script>
    <script src="static/js/Danmaku.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/MyVideo.css" />
    <link rel="stylesheet" type="text/css" href="static/css/DanmakuManager.css" />
</head>
<body>
<div class="security-right">
    <div class="security-right-title">
        <span class="security-right-title-icon"></span>
        <span class="security-right-title-text">我的视频</span>
        <span class="security-right-title-icon" style="margin-left: 10px;"></span>
        <span class="security-right-title-text">${video.videoName}</span>
    </div>
    <a href="/personal/video" style="float: left">
    <button type="button" class="layui-btn  layui-btn-sm" style="margin-left: 10px;margin-top: 5px">
        <i class="layui-icon ">&#xe65a;</i> 返回视频列表
    </button>

    </a>
    <div id="pageL"   style="margin-left: 130px;margin-top: -5px;"></div>
    <ul class="danmakuList layui-elip">
        <li><span class="danmakuId">弹幕Id</span>
            <span class="danmakutime">时间</span>
            <span class="danmakucontent">内容</span>
            <span class="danmakutype">类型</span>
            <span class="danmakuuserid">用户Id</span>
            <span class="danmakusendtime">发送日期</span>
            <span class="danmakustatus">状态</span>
            <span class="danmakumanager">操作</span>
        </li>
        <hr>
        <ul id="biuuu_city_list"></ul>
    </ul>
</div>
<script>
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage
            ,layer = layui.layer;

        //测试数据
        var DanmakuManagerData = getDanmakuManagerData(${video.videoId});

        //调用分页
        laypage.render({
            elem: 'pageL'
            ,limit: 18
            ,count: DanmakuManagerData.length
            ,jump: function(obj){
                //模拟渲染
                document.getElementById('biuuu_city_list').innerHTML = function(){
                    var arr = []
                        ,thisData = DanmakuManagerData.concat().splice(obj.curr*obj.limit - obj.limit, obj.limit);
                    layui.each(thisData, function(index, item){
                        var StringButtom;
                        if(item.danmakuStatus==0)
                        {
                            StringButtom = "<button id=\"btn"+item.danmakuId+"\" onclick=\"hiddenDanmaku("+item.danmakuId+")\" type=\"button\" class=\"layui-btn layui-btn-sm layui-btn-danger\">隐藏</button>";
                        }else if(item.danmakuStatus==1)
                        {
                            StringButtom = "<button id=\"btn"+item.danmakuId+"\" onclick=\"recoverDanmaku("+item.danmakuId+")\" type=\"button\" class=\"layui-btn layui-btn-sm layui-btn-normal\">恢复</button>";
                        }else
                        {
                            StringButtom = "'<button  type=\"button\" class=\"layui-btn layui-btn-sm layui-btn-disabled\">违规</button>";
                        }

                        arr.push('<li id=Danmaku'+item.danmakuId+'> ' +
                            '<span class=danmakuId>'+item.danmakuId+'</span>' +
                            '<span class=danmakutime>'+item.danmakuStringTime+'</span>' +
                            "<span class=\"danmakucontent layui-elip\" title=\""+item.danmakuContent+"\">"+item.danmakuContent+'</span>' +
                            '<span class=danmakutype>'+item.stringtype+'</span>' +
                            '<span class=danmakuuserid>'+item.danmakuSenderid+'</span>' +
                            '<span class=danmakusendtime layui-elip" title='+item.stringSendtime+'>'+item.stringSendtime+'</span>' +
                            '<span class=danmakustatus id=danmakustatus'+item.danmakuId+ '>'+item.stringstatus+'</span>' +
                            '<span class=danmakumanager>' +
                            '<div class=layui-btn-group>' +
                            StringButtom +
                            '</div>' +
                            '</span>' +
                            '</li><hr>'
                        );
                    });
                    return arr.join('');
                }();
            }
        });

    });
</script>
</body>
</html>
