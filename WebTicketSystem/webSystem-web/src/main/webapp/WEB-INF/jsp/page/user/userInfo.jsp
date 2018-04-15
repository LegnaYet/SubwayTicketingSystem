<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>个人资料--layui后台管理模板</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/user.css" media="all" />
</head>
<body class="childrenBody">
	<form class="layui-form"  action="${pageContext.request.contextPath}/page/user/editUser">
		<div class="user_left">
			<div class="layui-form-item">
			    <label class="layui-form-label">用户名</label>
			    <div class="layui-input-block">
			    	<input type="text" value="${user.username}" readonly="readonly" class="layui-input layui-disabled">
			    </div>
			</div>
			<div class="layui-form-item">
			    <label class="layui-form-label">真实姓名</label>
			    <div class="layui-input-block">
			    	<input type="text" value="${user.realname}"  readonly="readonly" class="layui-input realName">
			    </div>
			</div>
			<div class="layui-form-item">
			    <label class="layui-form-label">手机号码</label>
			    <div class="layui-input-block">
			    	<input type="tel" value="${user.telephone}" readonly="readonly" class="layui-input userPhone">
			    </div>
			</div>
		</div>
		<div class="layui-form-item" style="margin-left: 5%;">
		    <div class="layui-input-block">
		    	<button class="layui-btn" type="submit" >修改信息</button>
		    </div>
		</div>
	</form>
	<script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/user.js"></script>
</body>
</html>