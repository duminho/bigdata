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
		$("#p2").prev().css("background","green");
		$("#p2").next().css("background","lime");
		$("#p2").siblings().css("background","yellow");
	});
</script>
</head>
<body>
	<p id="p1">내용 1</p>
	<p id="p2">내용 2</p>
	<p id="p3">내용 3</p>
	<p id="p4">내용 4</p>
	<p id="p5">내용 5</p>
</body>
</html>