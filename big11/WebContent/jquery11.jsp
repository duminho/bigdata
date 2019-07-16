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
		$("#btn").click(function() {
			console.log("나를 눌렀겠다!");
			return false;
		});
	});
</script>
</head>
<body>
	<a href="https://www.naver.com/" id="btn">나를 눌러요</a>
</body>
</html>