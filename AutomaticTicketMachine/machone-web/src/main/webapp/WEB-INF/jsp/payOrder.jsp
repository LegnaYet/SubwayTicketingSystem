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
        <form class="layui-form" action="${pageContext.request.contextPath}/toPay" method="post">
            <table border="5px dash black" cellpadding="10px" cellspacing="10px">
                <tr>
                    <td align="center" colspan="2"><h2>订单信息确认表</h2></td>
                </tr>
                <tr>
                    <td align="center">路程</td>
                    <td align="center" width="500px">${order.beginname}-----${order.endname}</td>
                </tr>
                <tr>
                    <td align="center">票数</td>
                    <td align="center"> ${order.ticnum}张</td>
                </tr>
                <tr>
                    <td align="center">价格</td>
                    <td align="center">￥${order.price}</td>
                </tr>
                <tr>
                    <td align="center">请选择支付方式</td>
                    <td align="center">
                        <input type="hidden" name="price" value="${order.price}">
                        <input type="radio" checked="checked" name="payWay" value="wechat" title="微信支付">
                        <input type="radio" name="payWay" value="aliPay" title="支付宝支付">
                        <input type="radio" name="payWay" value="cash" title="现金支付">
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <button type="submit" class="layui-btn">支付</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <button type="button" onclick="toHome()" class="layui-btn layui-btn-danger">取消订单</button>
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
