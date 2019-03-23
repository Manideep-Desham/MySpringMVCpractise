<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src = "js/jQueryFile.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$('#bttHello').click(function(){
			var fullname = $('#fullname').val();
			$.ajax({
				type:'POST',
				data: {fullname:fullname},
				url:'AjaxController',
				success : function(result){
					$('#result1').html(result);
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
Name <input type ="text" id = "fullname">
<input type = "button" value = "Hello" id = "bttHello">
<br>
<span id= "result1"></span>

</form>

</body>
</html>