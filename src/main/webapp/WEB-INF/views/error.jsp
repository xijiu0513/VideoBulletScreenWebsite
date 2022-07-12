<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>你访问的页面不存在</title>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <style>
        * {
            padding: 0;
            margin: 0;
        }
    </style>
</head>
<body>
<jsp:include page="/head"></jsp:include>
<img height="92%" width="100%" src="static/images/404.jpg">
</body>
</html>
