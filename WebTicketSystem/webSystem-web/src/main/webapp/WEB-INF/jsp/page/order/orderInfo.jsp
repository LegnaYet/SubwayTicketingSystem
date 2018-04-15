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
    <title>支付</title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all" />
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<body style="background-color: RGB(200,232,240);">
<div class="layui-container" >
    <div class="layui-row" style="margin-top: 200px" align="center">
        <form class="layui-form" action="${pageContext.request.contextPath}/page/main">
            <table border="5px dash black" cellpadding="10px" cellspacing="10px">
                <tr>
                    <td align="center" colspan="2"><h2>订单信息表</h2></td>
                </tr>
                <tr>
                    <td align="center">路程</td>
                    <td align="center" width="500px">${internetOrder.beginname}-----${internetOrder.endname}</td>
                </tr>
                <tr>
                    <td align="center">票数</td>
                    <td align="center"> ${internetOrder.ticnum}张</td>
                </tr>
                <tr>
                    <td align="center">价格</td>
                    <td align="center">￥${internetOrder.price}</td>
                </tr>
                <tr>
                    <td align="center">验证手机号</td>
                    <td align="center">${internetOrder.telephone}</td>
                </tr>
                <tr>
                    <td align="center">验证码</td>
                    <td align="center">${internetOrder.verificationcode}</td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <button type="submit" class="layui-btn">返回首页</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
<script>
    function toHome() {
        location.href='${pageContext.request.contextPath}/'
    }
    layui.use('form', function () {
        var form = layui.form;
        form.render();
    });
</script>
</html>
