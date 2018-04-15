//表格
layui.use(['table','jquery'],function(){
    var table = layui.table,
        $ = layui.jquery;
    table.render({
        elem:'#orderList',
        url:'../../orderList',
        cellMinWidth: 80,
        page: true,
        limits: [10, 50, 100],
        cols:[[
            {
                type: 'checkbox'
            },{
                field:'oid', title: '订单号', sort: true
            },{
                field:'beginname',title: '起始站'
            },{
                field:'endname',title: '终点站'
            },{
                field:'ticnum',  title: '票数'
            },{
                field:'price', title: '总票价'
            },{
                field:'state', title: '订单状态'
            }
        ]],
        done:function(res,curr,count){
            $("[data-field='state']").children().each(function(){
                if($(this).text()=='1'){
                    $(this).text('待出票');
                }else if ($(this).text()=='2'){
                    $(this).text('已出票');
                }else if ($(this).text()=='3'){
                    $(this).text('已取消');
                }else if ($(this).text()=='0'){
                    $(this).text('未付款');
                }
            });
        }
    });

    var active={
        reload:function(){
            var state =$('#state').val();
            table.reload('orderList',{
                page:{curr:1},
                where:{
                    state:state
                    }
            });

        }
    }

    $('.layui-btn').on('click', function () {
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });


});