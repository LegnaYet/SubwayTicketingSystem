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
    <title>取票</title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all" />
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<body style="background-color: RGB(200,232,240);">
<div class="layui-container" >
    <div class="layui-row" style="margin-top: 200px" align="center">
        <form class="layui-form" action="${pageContext.request.contextPath}/toGetTic" method="post">
            <div class="layui-form-item">
                <label class="layui-form-label">手机号</label>
                <div class="layui-input-block">
                    <input type="text" name="telephone" id="telephone" lay-verify="required|phone" class="layui-input"
                           placeholder="请输入手机号" autocomplete="off">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">验证码</label>
                <div class="layui-input-block">
                    <input type="text" name="verificationcode" id="verificationcode" lay-verify="required" class="layui-input"
                           placeholder="请输入验证码" autocomplete="off">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit="">立即提交</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
        </form>
    </div>
    <div class="layui-btn-container" style="margin-top: 100px" align="center">
        <button id="btn1" class="layui-btn">1</button>
        <button id="btn2" class="layui-btn">2</button>
        <button id="btn3" class="layui-btn">3</button><br/>
        <button id="btn4" class="layui-btn">4</button>
        <button id="btn5" class="layui-btn">5</button>
        <button id="btn6" class="layui-btn">6</button><br/>
        <button id="btn7" class="layui-btn">7</button>
        <button id="btn8" class="layui-btn">8</button>
        <button id="btn9" class="layui-btn">9</button><br/>
        <button id="btn0" class="layui-btn">0</button>
        <button id="btnback" class="layui-btn">
            <i class="layui-icon">&#xe65c;</i>
        </button>
    </div>
</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>

<script>
    $("#btn1").on("click",function () {
        var tel = $("#telephone").val();
        var code = $("#verificationcode").val();
        if (tel.length<11){
            $("#telephone").val(tel+"1")
        }
        else if (code.length<6){
            $("#verificationcode").val(code+"1")
        }
    });
    $("#btn2").on("click",function () {
        var tel = $("#telephone").val();
        var code = $("#verificationcode").val();
        if (tel.length<11){
            $("#telephone").val(tel+"2")
        }
        else if (code.length<6){
            $("#verificationcode").val(code+"2")
        }
    });
    $("#btn3").on("click",function () {
        var tel = $("#telephone").val();
        var code = $("#verificationcode").val();
        if (tel.length<11){
            $("#telephone").val(tel+"3")
        }
        else if (code.length<6){
            $("#verificationcode").val(code+"3")
        }
    });
    $("#btn4").on("click",function () {
        var tel = $("#telephone").val();
        var code = $("#verificationcode").val();
        if (tel.length<11){
            $("#telephone").val(tel+"4")
        }
        else if (code.length<6){
            $("#verificationcode").val(code+"4")
        }
    });
    $("#btn5").on("click",function () {
        var tel = $("#telephone").val();
        var code = $("#verificationcode").val();
        if (tel.length<11){
            $("#telephone").val(tel+"5")
        }
        else if (code.length<6){
            $("#verificationcode").val(code+"5")
        }
    });
    $("#btn6").on("click",function () {
        var tel = $("#telephone").val();
        var code = $("#verificationcode").val();
        if (tel.length<11){
            $("#telephone").val(tel+"6")
        }
        else if (code.length<6){
            $("#verificationcode").val(code+"6")
        }
    });
    $("#btn7").on("click",function () {
        var tel = $("#telephone").val();
        var code = $("#verificationcode").val();
        if (tel.length<11){
            $("#telephone").val(tel+"7")
        }
        else if (code.length<6){
            $("#verificationcode").val(code+"7")
        }
    });
    $("#btn8").on("click",function () {
        var tel = $("#telephone").val();
        var code = $("#verificationcode").val();
        if (tel.length<11){
            $("#telephone").val(tel+"8")
        }
        else if (code.length<6){
            $("#verificationcode").val(code+"8")
        }
    });
    $("#btn9").on("click",function () {
        var tel = $("#telephone").val();
        var code = $("#verificationcode").val();
        if (tel.length<11){
            $("#telephone").val(tel+"9")
        }
        else if (code.length<6){
            $("#verificationcode").val(code+"9")
        }
    });$("#btn0").on("click",function () {
        var tel = $("#telephone").val();
        var code = $("#verificationcode").val();
        if (tel.length<11){
            $("#telephone").val(tel+"0")
        }
        else if (code.length<6){
            $("#verificationcode").val(code+"0")
        }
    });$("#btnback").on("click",function () {
        var tel = $("#telephone").val();
        var code = $("#verificationcode").val();
        if (tel.length!=11 && code.length==0){
            var newTel = tel.toString().substr(0,tel.length-1)
            $("#telephone").val(newTel)
        }
        if (tel.length==11 && code.length==0){
            var newTel = tel.toString().substr(0,tel.length-1)
            $("#telephone").val(newTel)
        }
        if (tel.length==11 && code.length!=0){
            var newCode = code.toString().substr(0,code.length-1)
            $("#verificationcode").val(newCode)
        }
    });
</script>

</html>
