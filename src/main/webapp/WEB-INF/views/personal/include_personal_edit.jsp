<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改资料</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <link rel="stylesheet" href="static/layui/css/layui.css">
    <script src="static/layui/layui.js"></script>
    <link rel="stylesheet" type="text/css" href="static/css/personal.css"/>
</head>
<body>
<div class="security-right">
    <div class="security-right-title">
        <span class="security-right-title-icon"></span>
        <span class="security-right-title-text">修改资料</span>
    </div>
    <div class="secuity-right-home">
        <div class="index-info">
            <div class="home-head">
                <img src="static/headResouces/${LoginUser.userProfilepic}"/>
            </div>
            <div class="home-right">
                <div class="home-top-msg">
                    <span class="home-top-msg-name home-top-msg-name-color">${LoginUser.userNickname}</span>
                    <span class="home-userstatus">${LoginUser.userTypeName}</span>
                </div>
            </div>
        </div>
    </div>
    <div class="user-setting-warp">
        <div>
            <form action="/do/personal_edit" method="post">
                <c:if test="${not empty InfoMsg}"><h1
                        style="margin-left: 50px;margin-bottom: 20px;color: #00B5E5;">${InfoMsg}</h1></c:if>
                <div class="el-form-item user-my-sign">
                    <label class="el-form-item__label">昵称</label>
                    <div class="el-input"><input autocomplete="off" placeholder="昵称" type="text" name="userNickName"
                                                 maxlength="16" validateevent="true" class="el-input__inner"
                                                 value="${LoginUser.userNickname}"></div>
                </div>

                <div class="el-form-item user-my-sign">
                    <label class="el-form-item__label">邮箱</label>
                    <div class="el-form-item__content">
                        <div>
                            <div class="el-input"><input autocomplete="off" placeholder="邮箱" type="text" name="userEmail"
                                                         maxlength="16" validateevent="true" class="el-input__inner"
                                                         value="${LoginUser.userEmail}"></div>
                        </div>
                    </div>
                </div>
                <div class="el-form-item user-my-sign">
                    <label class="el-form-item__label">密码</label>
                    <div class="el-input"><input autocomplete="off" placeholder="密码" name="userPassword" type="password"
                                                 maxlength="16" validateevent="true" class="el-input__inner"
                                                 value="${LoginUser.userPassword}"></div>
                </div>
                <button type="submit" class="layui-btn layui-btn-radius layui-btn-normal" style="margin-left: 100px;">
                    提交修改
                </button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
