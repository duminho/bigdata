<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#form").submit(function() {
			var d = $(this).serialize();
			$.ajax({
				url:"member2.jsp",
				data: d,
				success: function(result) {
					alert("ajax 성공!!");
					$("#result").text(result);
				}
			});
			return false;
		});
	});

</script>
</head>
<body>
	<div id="result"></div>
	<form action="" id="form" style="height: ">
		이름:<input type="text" value="minho" name="name">
		<button type="submit" id="button">눌러용</button>
	</form>
</body>
</html>