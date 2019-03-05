layui.use(['form','layer','jquery','table'],function(){
	var form = layui.form;
	var table = layui.table;
		$ = layui.$;
		$.ajax({
			url:"/json/vacation.json",
			type:"get",
			success:function(res){
				if(res.status){
					var datas = res.data;
					var cols = [];
					for (var i = 0; i < datas.length; i++) {
						var data = datas[i];
						cols.push({'field':data['key'],'title':data.label,'minWidth':120})
					}
					//执行渲染
					table.render({
					  elem: '#demo' //指定原始表格元素选择器（推荐id选择器）
					  ,toolbar: '#toolbar' 
					  ,cols: [cols] //设置表头
					  ,url:"/json/formData.json"
					});
					
					//头工具栏事件
					  table.on('toolbar(test)', function(obj){
						switch(obj.event){
						  case 'add':
							console.log(obj)
						  break;
						};
					  });
				}
				
			}
		})
		
})