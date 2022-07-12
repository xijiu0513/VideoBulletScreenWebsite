function getunPassComplaint() {
    var ComplaintManager;
    $.ajax({
        url:"/Admin/ComplaintManager/unpass",
        cache:false,
        async: false,
        type:"post",
        success:function (JsonComplaintManager) {
            //alert(JsonComplaintManager);
            ComplaintManager =  JSON.parse(JsonComplaintManager);
            // alert(DanmakuObj.danmakuContent);
        }
    });
    return ComplaintManager;
}

function getPassComplaint() {
    var ComplaintManager;
    $.ajax({
        url:"/Admin/ComplaintManager/pass",
        cache:false,
        async: false,
        type:"post",
        success:function (JsonComplaintManager) {
            //alert(JsonComplaintManager);
            ComplaintManager =  JSON.parse(JsonComplaintManager);
            // alert(DanmakuObj.danmakuContent);
        }
    });
    return ComplaintManager;
}

function getComplaintJsonData() {
    var ComplaintManager;
    $.ajax({
        url:"/getComplaintManagerData",
        cache:false,
        async: false,
        type:"post",
        success:function (JsonComplaintManager) {
            if (JsonComplaintManager==undefined)
            {
                layer.msg('无数据');
                return;
            }
            //alert(JsonComplaintManager);
            ComplaintManager =  JSON.parse(JsonComplaintManager);
            // alert(DanmakuObj.danmakuContent);
        }
    });
    return ComplaintManager;
}

function checkTheComplaintGroup(danmakuId) {

    layer.open({
        type: 2,
        title: '详情页面',
        shadeClose: true,
        shade: 0.8,
        resize:false,
        area: ['518px', '500px'],
        content: '/Admin/ComplaintListPage/'+danmakuId //iframe的url
    });
}
function checkThePassComplaintGroup(danmakuId) {

    layer.open({
        type: 2,
        title: '详情页面',
        shadeClose: true,
        shade: 0.8,
        resize:false,
        area: ['518px', '500px'],
        content: '/Admin/PassedComplaintListPage/'+danmakuId //iframe的url
    });
}

function switchTheComplaintStaus(danmakuId,status) {
    $.ajax({
        url:"/Admin/PassComplaint/"+danmakuId+"/"+status,
        cache:false,
        async: false,
        type:"post",
        success:function () {
            $("#hidden"+danmakuId).css("visibility","visible");
            return "";
        }
    })

}function getComplaintManagerLayout(item) {
    var Layout = document.createElement('div');
    var Li = document.createElement('li');
    var span = [];
    var aVideo = document.createElement('a');
    var GroupDiv = document.createElement('div');
    var btn = document.createElement('button');
    var hr = document.createElement('hr');
    var Status = item.complaintStatus;
    for (let i=0;i<7;i++)
    {
        span[i] = document.createElement('span');
    }

    // for (let i=0;i<3;i++)
    // {
    //     btn[i] = document.createElement('button');
    // }
    Li.id = "complaint"+item.complaintId;
    span[0].className = "videoTitleName  layui-elip";
    aVideo.href = "/Video/"+item.video.videoId;
    aVideo.textContent = item.video.videoName;
    span[1].className = "danmakutime";
    span[1].textContent = item.danmaku.danmakuStringTime;
    span[2].className = "danmakucontent layui-elip";
    span[2].textContent = item.danmaku.danmakuContent;
    span[2].title = item.danmaku.danmakuContent;
    span[3].className = "complainttype layui-elip";
    span[3].textContent = item.complainttype.complainttypeName;
    span[4].className = "complaint_describe  layui-elip";
    //alert("item.complaintDescribe"+item.complaintDescribe);
    if (item.complaintDescribe!="")
    {
        span[4].textContent = item.complaintDescribe;
        span[4].title = item.complaintDescribe;
    }else
    {
        span[4].textContent = "理由为空";
        span[4].title = "理由为空";
    }
    span[5].className = "danmakustatus";
    span[5].textContent = item.stringStatus;
    span[6].className = "danmakumanager";
    GroupDiv.className = 'layui-btn-group';
    $(btn).attr("onclick","removeComplaint("+item.complaintId+")");
    switch (Status)
    {
        case 0:
            btn.className = 'layui-btn layui-btn-sm layui-btn-danger';
            btn.textContent = '撤销举报';
            break;
        case 1:
            btn.className = 'layui-btn layui-btn-sm layui-btn-warm';
            btn.textContent = '删除记录';
            break;
        default:
            btn.className = 'layui-btn layui-btn-sm layui-btn-disabled';
            btn.textContent = '撤销举报';
    }
    hr.id = "hr"+item.complaintId;
    GroupDiv.appendChild(btn);
    span[6].appendChild(GroupDiv);
    span[0].appendChild(aVideo);
    for (let i=0;i<7;i++)
        Li.appendChild(span[i]);
    Layout.appendChild(Li);
    Layout.appendChild(hr);

    return Layout;
}


