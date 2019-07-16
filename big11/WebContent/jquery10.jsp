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
		/* $("li").css("background","lime");
		$("li").empty(); //자식을 del
		$("li").remove(); //자신을 del */
		$("#b1").click(function() {
			$("li").removeClass("lime");
			$("li").addClass("aqua");		
		});
		$("#b2").click(function() {
			$("li").removeClass("aqua");	
			$("li").addClass("lime");		
		});
	});
</script>
<style type="text/css">
.aqua{
	background: aqua;
}
.lime{
	background: lime;
}
</style>
</head>
<body>
	<button type="button" id="b1">들어감</button>
	<button type="button" id="b2">나감</button>
	<ul>
		<li>감자</li>
		<li>고구마</li>
		<li>변종</li>
	</ul>
</body>
</html>