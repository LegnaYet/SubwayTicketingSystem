layui.config({
	base : "js/"
}).use(['form','element','layer','jquery'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		element = layui.element(),
		$ = layui.jquery;

	$(".panel a").on("click",function(){
		window.parent.addTab($(this));
	})



    //刷新房间状态
    $.get("../refreshStatus",
		function () {
            $.get("../checkoutNums",
                function(data){
                    $(".checkout span").text(data);
                }
            )
        }
	)

	//空房
	$.get("../emptyRooms",
		function(data){
			$(".eptRooms span").text(data);
		}
	)

	//用户数
	$.get("../userNums",
		function(data){
			$(".userAll span").text(data);
		}
	)

	//预订数
    $.get("#",
        function(data){
    		data = 0;
            $(".netOrder span").text(data);
        }
    )

    //退房


    //待清理
    $.get("../dirtyRooms",
        function(data){
            $(".unclear span").text(data);
        }
    )




	//数字格式化
	$(".panel span").each(function(){
		$(this).html($(this).text()>9999 ? ($(this).text()/10000).toFixed(2) + "<em>万</em>" : $(this).text());	
	})



	//填充数据方法
 	function fillParameter(data){
 		//判断字段数据是否存在
 		function nullData(data){
 			if(data == '' || data == "undefined"){
 				return "未定义";
 			}else{
 				return data;
 			}
 		}
 		$(".version").text(nullData(data.version));      //当前版本
		$(".author").text(nullData(data.author));        //开发作者
		$(".homePage").text(nullData(data.homePage));    //网站首页
		$(".server").text(nullData(data.server));        //服务器环境
		$(".dataBase").text(nullData(data.dataBase));    //数据库版本
		$(".maxUpload").text(nullData(data.maxUpload));    //最大上传限制
		$(".userRights").text(nullData(data.userRights));//当前用户权限
 	}

})
