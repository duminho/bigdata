<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function name() {
		var check = false;
		$("#food").change(function() {
			if(check == true){
				$("#list input").attr("checked",false);
				check = false;
			}else{
				$("#list input").attr("checked",true);
				check = true;
			}
			
		});
	});
</script>
</head>
<body>
	<input type="checkbox" id="food">음식
	<ul id="list">
		<li><input type="checkbox">햄버거</li>
		<li><input type="checkbox">탄산음료</li>
		<li><input type="checkbox">감자튀김</li>
	</ul>
</body>
</html>