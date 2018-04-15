<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>修改密码--layui后台管理模板</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all" />
</head>
<body class="childrenBody">
	<form class="layui-form changePwd" action="${pageContext.request.contextPath}/user" method="post">
		<div class="layui-form-item">
		    <label class="layui-form-label">用户名</label>
		    <div class="layui-input-block">
				<input type="hidden" name="_method" value="PUT"/>
				<input type="hidden" name="uid" value="${user.uid}"/>
		    	<input type="text" name="username" value="${user.username}" readonly="readonly" class="layui-input layui-disabled">
		    </div>
		</div>
		<div class="layui-form-item">
		    <label class="layui-form-label">旧密码</label>
		    <div class="layui-input-block">
		    	<input type="password" id="oldPWD" onblur="checkPWD('${user.password}')" value="" placeholder="请输入旧密码" lay-verify="required|oldPWD" class="layui-input pwd">
		    </div>
		</div>
		<div class="layui-form-item">
		    <label class="layui-form-label">新密码</label>
		    <div class="layui-input-block">
		    	<input type="password" name="password" value="" placeholder="请输入新密码" lay-verify="required|pass" id="password" class="layui-input pwd">
		    </div>
		</div>
		<div class="layui-form-item">
		    <label class="layui-form-label">确认密码</label>
		    <div class="layui-input-block">
		    	<input type="password" value="" placeholder="请确认密码" lay-verify="required|rePass" class="layui-input pwd">
		    </div>
		</div>
		<div class="layui-form-item">
		    <div class="layui-input-block">
		    	<button class="layui-btn" lay-submit lay-filter="*">立即修改</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
		    </div>
		</div>
	</form>

	<script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
</body>
<script type="text/javascript">
    window.onload = function () {


        layui.use('form', function () {
            var form = layui.form();
            var password = ${user.password};

            form.verify({
                oldPWD: function (value) {
                    if (password!=value){
                        return '旧密码错误';
                    }
                }
				,pass: function (value, item) {
                    if (!((value!=null ||value!="") && /^[\S]{6,12}$/.test(value))) {
                        return '密码必须6到12位，且不能出现空格';
                    }
                }
                , rePass: function (value) {
                    var pwd = $("#password").val();
                    if (pwd != value) {
                        return '两次密码不相同';
                    }
                }
            });
        });
    }

    function checkPWD(obj) {
        layui.use('layer', function () {
            var layer = layui.layer;
			if ($("#oldPWD").val()!=obj){
			    layer.msg("旧密码错误")
			}
        });
    }

</script>
</html>