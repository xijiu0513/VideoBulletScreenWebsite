
$(function () {
    $("#notLogin").click(function () {
        layer.msg('请先登录!')
    });


    $("#SendDanmaku").click(function () {
        var DanmakuVideoid = $("#videoId").val();
        var DanmakuVideotime = 1;
        var DanmakuContent = $("#DanmakuContent").val();
        var DanmakuColor = $("#DanmakuColor").val();
        var DanmakuType = 0;
        if ($("#DanmakuContent").val()=="")
        {
            layer.msg('请输入文字');
            return;
        }
        $.ajax({
            url:"/SendDanmaku",
            cache:false,
            data:{DanmakuVideoid:DanmakuVideoid,DanmakuVideotime:DanmakuVideotime,DanmakuContent:DanmakuContent,DanmakuColor:DanmakuColor,DanmakuType:DanmakuType},
            type:"post",
            success:function (JsonDanmaku) {
                if (JsonDanmaku!=null)
                {
                    var a = $("#DanmakuContent").val("");
                    var DanmakuObj = JSON.parse(JsonDanmaku);
                    var StringDanmaku =
                        "<li class='danmaku-info-row bpui-selected' style='padding-top: 0px;'>" +
                        "<span class='danmaku-info-time'>"+ DanmakuObj.danmakuStringTime
                        +"</span>" +
                        "<span class='danmaku-info-danmaku' title='"+ DanmakuObj.danmakuContent+"'>"+ DanmakuObj.danmakuContent+"</span>" +
                        "<span class='danmaku-info-date' title='"+DanmakuObj.stringLongSendtime+"'>"+DanmakuObj.stringSendtime+"</span>" +
                        "</li>\n"
                    $("#DanmakuList").append(StringDanmaku);
                }
            }
        })

    });


});


function getDanmakuManagerData(videoId) {
    var DanmakuManagerData;
    $.ajax({
        url:"/getDanmakuManagerData/"+videoId,
        cache:false,
        type:"post",
        async: false,
        success:function (JsonDanmakuManagerData) {
            DanmakuManagerData = JSON.parse(JsonDanmakuManagerData);
        }
    });

    return DanmakuManagerData;
}

function  getAdminDanmakuManagerData(videoId) {
    var DanmakuManagerData;
    $.ajax({
        url:"/getDanmakuManagerData/"+videoId,
        cache:false,
        type:"post",
        async: false,
        success:function (JsonDanmakuManagerData) {
            DanmakuManagerData = JSON.parse(JsonDanmakuManagerData);
        }
    });

    return DanmakuManagerData;
}

function getDanmakuData(VideoId) {
    var LoginStatus = $("#LoginStatus").val();
    var DanmakuPool;
    $.ajax({
        url:"/getDanmakuData/"+VideoId+".json",
        cache:false,
        type:"post",
        success:function (JsonDanmakuData) {
            var DanmakuData = JSON.parse(JsonDanmakuData);
            var ScreemDanmaku;//要显示在视频上的弹幕
            var Danmaku = DanmakuData[0];//总弹幕池
            var Shield = DanmakuData[1];//用户屏蔽弹幕
            var banKeyword = DanmakuData[2];//用户屏蔽关键词
            for(i = 0;i<Danmaku.length;i++)
            {
                var StringClick;//点击事件
                if (LoginStatus == "notLogin")
                    StringClick = "NotLogin()";
                else
                    StringClick= "ManagerDanmaku("+Danmaku[i].danmakuId+")";
                var danmakuContent;//弹幕内容
                var style;//弹幕侧栏样式
                var b = 1;//弹幕状态


                //筛选弹幕
                if(Shield!=undefined){
                    for (x=0;x<Shield.length;x++)
                    {
                        if (Danmaku[i].danmakuId==Shield[x].shieldBanid)
                            b = 2;
                    }
                }
                if (banKeyword!=undefined){
                    for (x=0;x<banKeyword.length;x++)
                    {
                        if (Danmaku[i].danmakuContent.indexOf(banKeyword[x].banKeywordString)!=-1)
                            b = 3;
                    }
                }


                if (b==1)
                {
                    danmakuContent = Danmaku[i].danmakuContent;
                    style = "background-color: #ffffff;";
                    //ScreemDanmaku.push(Danmaku[i]);
                }else if (b==2){
                    //danmakuContent = "单条弹幕屏蔽";
                    danmakuContent = Danmaku[i].danmakuContent;
                    style = "background-color: #e2e2e2;";
                    StringClick = "removeShieldDanmaku("+Danmaku[i].danmakuId+")";
                }else {
                    danmakuContent = "关键词屏蔽";
                    style = "background-color: #e2e2e2;";
                    StringClick = " ";
                }


                var StringDanmaku = "    <li  onclick=\""+StringClick+"\" id=\"Danmaku"+Danmaku[i].danmakuId+"\"  class=\"danmaku-info-row bpui-selected\" style=\"padding-top: 0px;"+style+"\">\n" +
                    "        <span class=\"danmaku-info-time\">"+Danmaku[i].danmakuStringTime+"</span>\n" +
                    "        <span class=\"danmaku-info-danmaku\" id=\"DanmakuText\" title=\""+Danmaku[i].danmakuContent+"\">"+danmakuContent+"</span>\n" +
                    "        <span class=\"danmaku-info-date\" title=\""+Danmaku[i].stringLongSendtime+"\" type=\"both\" >"+Danmaku[i].stringSendtime+"</span>\n" +
                    "    </li>"

                $("#DanmakuList").append(StringDanmaku);
            }



        }
    });
    return DanmakuPool;
}


function notLogin() {
    layer.msg('请先登录!');
}




