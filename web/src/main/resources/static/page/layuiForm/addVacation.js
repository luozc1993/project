layui.config({
	base : "../js/modules/"
}).extend({
	dynaactionform : "dynaactionform"
})
layui.use(['dynaactionform','form','layer','jquery'],function(){
	var form = layui.form;
		$ = layui.$;
		var tab = layui.dynaactionform;
		$.ajax({
			url:"../json/formData.json",
			type:"get",
			success:function(res){
				tab.form({
					id:"#form",
					title:"请假申请",
					yesBtnName:"提交",
					data:res.data,
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