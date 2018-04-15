<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/6
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all" />
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<body style="background-image: url(${pageContext.request.contextPath}/images/bgImg.jpg);background-repeat: round">
<div class="layui-container" >
    <div class="layui-row" align="center" style="margin-top: 150px">
        <h1>杭州市地铁购票系统</h1>
    </div>
    <div class="layui-row" style="margin-top: 200px" align="center">
        <form>
        <button type="button" onclick="buyTic()" class="layui-btn layui-btn-lg layui-btn-radius layui-btn-normal">地铁购票</button>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <button type="button" onclick="getTic()" class="layui-btn layui-btn-lg layui-btn-radius">网络取票</button>
        </form>
    </div>
</div>
</body>
<script>
    function buyTic() {
        location.href="${pageContext.request.contextPath}/toBuy";
    }

    function getTic() {
        location.href="${pageContext.request.contextPath}/toGet";
    }
</script>
</html>
