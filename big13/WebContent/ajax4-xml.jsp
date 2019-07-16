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
		$.ajax({
			url: "json/rank.json",
			dataType:"json",
			success: function(result) {
				alert("json문서 연결 성공");
				var list = result.rank;
				if(list.length > 0){
					$("#rank").html("랭크가 존재 확인" + "<br>");
					$(list).each(function(index, member) {
						var name = member.name;
						var tel = member.tel;
						$.ajax({
							url:"jsondb.jsp",
							data:{
								"name" : name,
								"tel" : tel
							},
							success: function() {
								console.log("ok");
							}
						});	
						//$("#rank").append(index + "-이름 " + name + "<br>");
					});
				}
				
			}
		});
	});

</script>
</head>
<body>
	<p>인기 검색어 순위</p>
	<hr color="red">
	<div id="rank">
		<ol>
			
		</ol>
</body>
</html>