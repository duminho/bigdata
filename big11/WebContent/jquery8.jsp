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
		$("button").click(function() {
			$("img").attr("width",100);
			$("img").attr("height",200);
			$("img").css("border","2px dotted red");
			/* $("img").removeAttr("border"); */
		});
	});
</script>
</head>
<body>
	<button type="button">나를 눌러요</button>
	<img src="teo.jpeg">
</body>
</html>