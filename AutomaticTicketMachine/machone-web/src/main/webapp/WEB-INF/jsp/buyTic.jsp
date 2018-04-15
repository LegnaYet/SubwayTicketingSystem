<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<style>
    .layui-form-select dl {
        max-height: 200px;
    }
</style>
<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" media="all"/>
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<body style="background-image: url(${pageContext.request.contextPath}/images/bgImg.jpg);background-repeat: round">
<div class="layui-container">
    <div class="layui-row" style="margin-top: 200px" align="center">
        <div>
            <img width="30px" src="${pageContext.request.contextPath}/images/location.png"><label>当前站：西湖文化广场</label>
        </div>
        <form id="myForm" class="layui-form" action="${pageContext.request.contextPath}/orderTic" method="post">
            <div class="layui-input-inline">
                <input type="hidden" id="ticketNum" name="ticnum" value="0">
                <select id="beginid" name="beginid" readonly="readonly">
                    <option value="13">西湖文化广场</option>
                </select>
            </div>
            -------------
            <div class="layui-input-inline">
                <select id="endid" name="endid" lay-search>
                    <option value="">请选择</option>
                    <optgroup label="B">
                        <option value="2">滨康路</option>
                        <option value="4">滨和路</option>
                    </optgroup>
                    <optgroup label="C">
                        <option value="8">城站</option>
                    </optgroup>
                    <optgroup label="D">
                        <option value="9">定安路</option>
                        <option value="14">打铁关</option>
                    </optgroup>
                    <optgroup label="F">
                        <option value="11">凤起路</option>
                    </optgroup>
                    <optgroup label="H">
                        <option value="16">火车东站</option>
                    </optgroup>
                    <optgroup label="J">
                        <option value="5">江陵路</option>
                        <option value="6">近江</option>
                        <option value="19">九和路</option>
                        <option value="20">九堡</option>
                        <option value="23">金沙湖</option>
                    </optgroup>
                    <optgroup label="K">
                        <option value="21">客运中心</option>
                    </optgroup>
                    <optgroup label="L">
                        <option value="10">龙翔桥</option>
                        <option value="270">临平</option>
                    </optgroup>
                    <optgroup label="N">
                        <option value="260">南苑</option>
                    </optgroup>
                    <optgroup label="P">
                        <option value="17">彭埠</option>
                    </optgroup>
                    <optgroup label="Q">
                        <option value="18">七堡</option>
                        <option value="220">乔司南</option>
                        <option value="230">乔司</option>
                    </optgroup>
                    <optgroup label="W">
                        <option value="7">婺江路</option>
                        <option value="12">武林广场</option>
                        <option value="24">文泽路</option>
                        <option value="25">文海南路</option>
                        <option value="240">翁梅</option>
                    </optgroup>
                    <optgroup label="X">
                        <option value="1">湘湖</option>
                        <option value="3">西兴</option>
                        <option value="13">西湖文化广场</option>
                        <option value="22">下沙西</option>
                        <option value="27">下沙江滨</option>
                    </optgroup>
                    <optgroup label="Y">
                        <option value="26">云水</option>
                        <option value="250">余杭高铁站</option>
                    </optgroup>
                    <optgroup label="Z">
                        <option value="15">闸弄口</option>
                    </optgroup>
                </select>
            </div><br/><br/><br/>
                <div class="layui-input-inline">
                    <button onclick="confirmTic()" type="button" class="layui-btn layui-btn-lg layui-btn-radius layui-btn-normal">确认</button>
                </div>
        </form>
    </div>
</div>
</body>
<script>

    layui.use('form', function () {
        var form = layui.form;


    })
    function confirmTic() {
        layui.use(['form', 'jquery', 'layer'], function () {
            var form = layui.form,
                $ = layui.jquery,
                layer = layui.layer;
        layer.open({
            title: '选择数量'
            ,type:2
            ,area: ['500px', '300px']
            ,content: '${pageContext.request.contextPath}/chooseNum',
            end:function () {
                if ($("#ticketNum").val()!=0){
                    $("#myForm").submit();
                }
            }
        });
        })
    }

</script>
</html>
