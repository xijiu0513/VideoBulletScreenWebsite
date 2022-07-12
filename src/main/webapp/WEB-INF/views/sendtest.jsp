<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <script src="static/js/jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <script src="static/layui/layui.js"></script>

</head>
<script type="text/javascript">
    $(function () {
        $("#send").click(function () {
            var danmaku = $("#danmaku").val();
            var colorSelect = $("#colorSelect").val();
            $.ajax({
                url: "/SendTest",
                cache: false,
                data: {Danmaku: danmaku, DanmakuColor: DanmakuColor},
                type: "post",
                success: function (JsonDanmaku) {
                    var DanmakuObj = JSON.parse(JsonDanmaku);
                    var NewDanmaku = "<div style='text-shadow: -1px 0 white, 0 1px white, 1px 0 white, 0 -1px white;font-size: 40px;color:" + DanmakuObj.danmakuColor + "'>" + DanmakuObj.danmakuContent + "</div>";
                    $("#danmakuList").append(NewDanmaku);
                }
            })
        });
    });
</script>
<body>

<input type="text" name="danmaku" id="danmaku">
<div class="layui-form-item">
    <div class="layui-input-inline" style="width: 120px;">
        <input type="text" value="#000000" readonly="readonly" placeholder="请选择颜色" class="layui-input"
               id="DanmakuColor">
    </div>
    <div class="layui-inline" style="left: -11px;">
        <div id="test-form"></div>
    </div>
</div>
<input type="button" id="send" value="发送">
<div id="danmakuList">

</div>
<script>
    layui.use('colorpicker', function () {
        var colorpicker = layui.colorpicker;
        //表单赋值
        colorpicker.render({
            elem: '#test-form'
            , color: '#000000'
            , predefine: true
            , done: function (color) {
                $('#DanmakuColor').val(color);
            }
        });
    });
</script>
</body>
</html>
