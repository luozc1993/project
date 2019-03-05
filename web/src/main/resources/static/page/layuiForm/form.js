layui.config({
	base : "../../assets/module/dynamicForm/"
}).extend({
	dynamicForm : "dynamicForm"
});
layui.use(['dynamicForm','form','layer','jquery'],function(){
	var form = layui.form;
		$ = layui.$;
		var tab = layui.dynamicForm;
		
		
		$.ajax({
			url:"form.json",
			type:"get",
			success:function(res){
				console.log(res)
				tab.form({
					id:"#form",
					title:"请假申请",
					yesBtnName:"提交",
					data:res,
						success:function(obj){
							console.log(obj)
						},
						yes:function(obj){
							console.log(obj)
						},
						cancel:function(obj){
							console.log(obj)
						}
				});
			}
		})
		
		
		
})