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
			$("div").before($("input").val() + "<br>");
		});
	});
</script>
</head>
<body>
	<p>댓글입력</p>
	<hr>
	<div></div>
	입력:<input type="text" id="t1">
	<button>입력</button>
	
	
	
</body>
</html>