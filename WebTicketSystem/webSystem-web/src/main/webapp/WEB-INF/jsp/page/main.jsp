<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>首页</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="//at.alicdn.com/t/font_tnyc012u2rlwstt9.css" media="all" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" media="all" />
</head>
<body class="childrenBody">

	<div class="panel_box row" >
		<div class="panel col">
			<a href="javascript:;" data-url="page/order/order">
				<div class="panel_icon" style="background-color:#5FB878;">
					<i class="layui-icon" data-icon="&#xe622;">&#xe622;</i>
				</div>
				<div class="panel_word orderTic">
					<span>购票</span>
					<cite></cite>
				</div>
			</a>
		</div>

		<div class="panel col">
			<a href="javascript:;" data-url="page/user/userInfo">
				<div class="panel_icon" style="background-color:#F7B824;">
					<i class="layui-icon" data-icon="&#xe612;">&#xe612;</i>
				</div>
				<div class="panel_word userInfo">
					<span>用户信息</span>
					<cite></cite>
				</div>
			</a>
		</div>
		<div class="panel col">
			<a href="javascript:;" data-url="page/order/orderList">
				<div class="panel_icon" style="background-color:#5FB878;">
					<i class="iconfont icon-wenben" data-icon="icon-wenben"></i>
				</div>
				<div class="panel_word historyOrders">
					<span></span>
					<cite>历史订单</cite>
				</div>
			</a>
		</div>
        <div class="panel col">
            <a href="javascript:;" data-url="page/user/recharge">
                <div class="panel_icon" style="background-color:#F7B824;">
                    <i class="layui-icon" data-icon="&#xe62e;">&#xe62e;</i>
                </div>
                <div class="panel_word Restmoney">
                    <span></span>
                    <cite>充值</cite>
                </div>
            </a>
        </div>
</div>

	<script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
</body>
</html>