<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人中心</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <script src="static/layui/layui.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/personal.css"/>
</head>
<body>
<jsp:include page="/head"></jsp:include>
<div class="security_content">
    <div class="security-left">
        <span class="security-title">个人中心</span>
        <ul class="security-ul">
            <li class="security-list <c:if test="${type == 'edit'}">router-link-exact-active on</c:if>"><a
                    href="/personal/edit"><i class="layui-icon layui-icon-username"></i><span class="security-nav-name">修 改 资 料</span></a>
            </li>
            <li class="security-list <c:if test="${type == 'upload'}">router-link-exact-active on</c:if>"><a
                    href="/personal/upload"><i class="layui-icon layui-icon-export"></i><span class="security-nav-name">上 传 视 频</span></a>
            </li>
            <li class="security-list <c:if test="${type == 'video' or type == 'danmakumanager'}">router-link-exact-active on</c:if>">
                <a href="/personal/video"><i class="layui-icon layui-icon-video"></i><span class="security-nav-name">我 的 视 频</span></a>
            </li>
        </ul>
    </div>

    <%-- 主体内容 --%>
    <c:if test="${type == 'personal_self'}">
        <jsp:include page="/include/personal_self"></jsp:include>
    </c:if>

    <c:if test="${type == 'edit'}">
        <jsp:include page="/include/personal_edit"></jsp:include>
    </c:if>

    <c:if test="${type == 'upload'}">
        <jsp:include page="/include/personal_upload"></jsp:include>
    </c:if>

    <c:if test="${type == 'video'}">
        <jsp:include page="/include/personal_myvideo"></jsp:include>
    </c:if>

    <c:if test="${type == 'danmakumanager'}">
        <jsp:include page="/include/personal_DanmakuManager/${Id}"></jsp:include>
    </c:if>

    <c:if test="${type == 'complaintmanager'}">
        <jsp:include page="/include/personal_ComplaintManager"></jsp:include>
    </c:if>

    <c:if test="${type == 'bankeyword'}">
        <jsp:include page="/include/personal_bankeyword"></jsp:include>
    </c:if>


</div>
</body>
</html>
