<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>alipay</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
</head>
<body>
<form class="layui-form" action="${pageContext.request.contextPath}/paid" method="post">
    <div style="margin: 50px auto; width:580px;">
        <fieldset class="layui-elem-field">
            <div class="layui-field-box">
                <div class="layui-input-inline">
                    <input type="hidden" name="oid" value="${oid}">
                    <img width="300px" src="${pageContext.request.contextPath}/images/alipay.jpg">
                </div><br/>
                <div class="layui-input-inline">
                    <button type="submit"  class="layui-btn">付款成功</button>
                </div>
            </div>
        </fieldset>
    </div>
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.all.js"></script>

</html>
