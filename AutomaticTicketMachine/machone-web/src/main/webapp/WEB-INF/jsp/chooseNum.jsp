<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>选择城市</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
</head>
<form class="layui-form" action="">
    <div style="margin: 50px auto; width:580px;">
        <fieldset class="layui-elem-field">
            <legend>选择数量</legend>
            <div class="layui-field-box">
                <div class="layui-input-inline">
                    <button type="button" onclick="decrease()" class="layui-btn layui-btn-sm">
                        <i class="layui-icon">&#xe603;</i>
                    </button>
                </div>
                <div class="layui-input-inline">
                    <input id="ticNum" class="layui-input" type="text" size="10" value="1">
                </div>
                <div class="layui-input-inline">
                    <button type="button" onclick="increase()" class="layui-btn layui-btn-sm">
                        <i class="layui-icon">&#xe602;</i>
                    </button>
                </div>
                <button onclick="confirmNum()" type="button" class="layui-btn layui-btn-lg layui-btn-radius layui-btn-normal">确定</button>
            </div>
        </fieldset>
    </div>
</form>

</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/layui/layui.all.js"></script>
<script>
    function confirmNum() {
        layui.use(['form', 'jquery', 'layer'], function () {
            var form = layui.form,
                layer = layui.layer;
            $("#ticketNum",window.parent.document).val($("#ticNum").val());
            var index = parent.layer.getFrameIndex(window.name);
            parent.layer.close(index);
        });
    }

    function increase() {
        layui.use(['jquery', 'layer'], function () {
            var $ = layui.jquery,
                layer = layui.layer;
            var num = Number($("#ticNum").val());
            $("#ticNum").val(num + 1);
            if ($("#ticNum").val() > 5) {
                layer.msg("不可一次性购买超过5张！")
                $("#ticNum").val(5);
            }
        });

    }

    function decrease() {
        layui.use(['jquery', 'layer'], function () {
            var $ = layui.jquery,
                layer = layui.layer;
            var num = Number($("#ticNum").val());
            $("#ticNum").val(num - 1);
            if ($("#ticNum").val() < 1) {
                layer.msg("不可少于1张！")
                $("#ticNum").val(1);
            }
        });
    }

</script>
</html>
