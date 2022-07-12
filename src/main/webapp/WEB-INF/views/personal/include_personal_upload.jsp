<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传视频</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <script src="static/layui/layui.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/personal.css"/>
</head>
<body>
<div class="security-right">
    <div class="security-right-title">
        <span class="security-right-title-icon"></span>
        <span class="security-right-title-text">上传视频</span>
    </div>

    <div class="user-setting-warp">
        <form class="layui-form" action="/do/personal_upload" method="post">
            <div class="layui-form-item">
                <label class="layui-form-label">视频标题</label>
                <div class="layui-input-block">
                    <input type="text" name="video_name" required lay-verify="required" placeholder="请输入标题"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
            <%--上传图片--%>
            <div class="layui-form-item">
                <label class="layui-form-label">上传图片</label>
                <button type="button" class="layui-btn" id="pic">
                    <i class="layui-icon">&#xe67c;</i>选择封面
                </button>
                <%-- 隐藏输入框 --%>
                <input id="video_pic" type="text" name="video_pic" hidden>
                <script>
                    layui.use('upload', function () {
                        var upload = layui.upload;
                        //执行实例
                        var uploadInst = upload.render({
                            elem: '#pic',
                            accept: 'images',
                            url: '/upload/pic',
                            done: function (resp) {
                                var video_pic = document.getElementById('video_pic')
                                video_pic.setAttribute("value", resp.data)
                                alert("图片已就绪")
                            },
                            error: function () {
                                console.log("fail")
                            }
                        });
                    });
                </script>
            </div>
            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">视频简介</label>
                <div class="layui-input-block">
                    <textarea name="video_info" placeholder="请输入内容" class="layui-textarea"></textarea>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">视频类型</label>
                <div class="layui-input-block">
                    <select name="video_type" lay-verify="required">
                        <option value=""></option>
                        <option value="1">动画</option>
                        <option value="2">运动</option>
                        <option value="3">历史</option>
                        <option value="4">生活</option>
                        <option value="5">游戏</option>
                    </select>
                </div>
            </div>
            <%--上传视频--%>
            <div class="layui-form-item">
                <label class="layui-form-label">上传视频</label>
                <div>
                    <input id="video_url" type="text" name="video_url" hidden>
                    <button type="button" class="layui-btn" id="video">
                        <i class="layui-icon">&#xe67c;</i>选择视频
                    </button>
                    <span style="color:brown">（仅支持 MP4 格式）</span>
                </div>

                <script>
                    layui.use('upload', function () {
                        var upload = layui.upload;
                        var uploadInst = upload.render({
                            elem: '#video',
                            accept: 'video',
                            url: '/upload/video',
                            done: function (resp) {
                                var video_url = document.getElementById('video_url')
                                video_url.setAttribute("value", resp.data)
                                alert("视频已就绪!")
                            },
                            error: function () {
                            }
                        });
                    });
                </script>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button type="submit" class="layui-btn layui-btn-normal" lay-submit lay-filter="formDemo">发布视频
                    </button>
                </div>
            </div>
        </form>

        <script>
            layui.use('form', function () {
                var form = layui.form;
                //监听提交
                form.on('submit(formDemo)', function (data) {
                    layer.msg("发布成功！");
                    return true;
                });
            });
        </script>
    </div>
</div>
</body>
</html>
