<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>会员编辑--layui后台管理模板</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all"/>
    <style type="text/css">
        .layui-form-item .layui-inline {
            width: 33.333%;
            float: left;
            margin-right: 0;
        }

        @media (max-width: 1240px) {
            .layui-form-item .layui-inline {
                width: 100%;
                float: none;
            }
        }
    </style>
</head>
<body class="childrenBody">
<form class="layui-form" style="width:80%;" id="userInfo" action="${pageContext.request.contextPath}/user"
      method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-block">
            <!-- RESTFul风格 -->
            <input type="hidden" name="_method" value="PUT"/>
            <input type="hidden" name="uid" value="${user.uid}"/>
            <input type="text" name="username" id="username" value="${user.username}" readonly="readonly" class="layui-input userName" autocomplete="off">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">真实姓名</label>
            <div class="layui-input-inline">
                <input type="text" name="realname" value="${user.realname}" lay-verify="required"
                       placeholder="请输入手机号" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">手机号</label>
            <div class="layui-input-inline">
                <input type="tel" name="telephone" value="${user.telephone}" lay-verify="required|phone"
                       placeholder="请输入手机号" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="">确认</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>


<script type="text/javascript">
    window.onload = function () {


        layui.use('form', function () {
            var form = layui.form();

            form.verify({
               pass: function (value, item) {
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


</script>
</body>
</html>