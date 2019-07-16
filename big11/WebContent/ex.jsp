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
		$("#b3").click(function() {
			$("h1").slideToggle();
		});
	});
</script>
</head>
<body>
	<input type="checkbox" value="신라면" >신라면<br>
	<input type="checkbox" value="농심라면" >농심라면<br>
	<input type="checkbox" value="삼양라면" >삼양라면<br>
	<input type="checkbox" value="좀더 잘했더라면" >좀더 잘했더라면<br>
	<button type="button" id="b1">전체 선택</button>
</body>
</html>