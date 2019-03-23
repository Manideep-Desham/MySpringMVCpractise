<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src = "js/jQueryFile.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#clickCounter').click(function(){
				
			var span_Text = document.getElementById("count").innerText;
			if(span_Text == ""){
				var number = 0 ;
			}
			else{
				var number = span_Text;
			}
			$.ajax({
				type:'POST',
				data: {number:number},
				url:'AjaxController',
				success : function(result){
					$('#count').html(result);

				}
			});
		});
		
	});
	


</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax tutorial</title>
</head>
<body>

<form>
<input type = "button" value = "click" id = "clickCounter" >
<br>
</form>
<span id= "count"></span>

</body>
</html>