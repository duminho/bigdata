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
		$("#b1").click(function() {
			$("#result").text("");
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=wyo0gah1qapv0uujcluibp7ohi1hgjmhpyrn1kab",
				dataType : "json",
				data:{
					url:"http://www.chosun.com/site/data/rss/rss.xml",
					api_key:"wyo0gah1qapv0uujcluibp7ohi1hgjmhpyrn1kab",
					count: 20
				},
				success: function(result){
					for(var index =0 ; index < 20 ;index++){
						var title = result.items[index].title;
						var link = result.items[index].link;
						var img = result.items[index].thumbnail;
						$("#result").append("-<a href="+link+">"+title+"<br>");
						$("#result").append("- <img src="+img+" width=100 height=100><br>");
					}
				}
			});
		});
		$("#b2").click(function() {
			$("#result").text("");
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Fculture.xml&api_key=wyo0gah1qapv0uujcluibp7ohi1hgjmhpyrn1kab",
				dataType : "json",
				data:{
					url:"http://www.chosun.com/site/data/rss/culture.xml",
					api_key:"wyo0gah1qapv0uujcluibp7ohi1hgjmhpyrn1kab",
					count: 20
				},
				success: function(result){
					for(var index =0 ; index < 20 ;index++){
						var title = result.items[index].title;
						var link = result.items[index].link;
						var img = result.items[index].thumbnail;
						$("#result").append("-<a href="+link+">"+title+"<br>");
						$("#result").append("- <img src="+img+" width=100 height=100><br>");
					}
				}
			});
		});
		$("#b3").click(function() {
			$("#result").text("");
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fphoto.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=wyo0gah1qapv0uujcluibp7ohi1hgjmhpyrn1kab",
				dataType : "json",
				data:{
					url:"http://photo.chosun.com/site/data/rss/rss.xml",
					api_key:"wyo0gah1qapv0uujcluibp7ohi1hgjmhpyrn1kab",
					count: 20
				},
				success: function(result){
					for(var index =0 ; index < 20 ;index++){
						var title = result.items[index].title;
						var link = result.items[index].link;
						var img = result.items[index].thumbnail;
						$("#result").append("-<a href="+link+">"+title+"<br>");
						$("#result").append("- <img src="+img+" width=100 height=100><br>");
					}
				}
			});
		});
	});
	

</script>
</head>
<body>
	<button type="button" id="b1">속보</button>
	<button type="button" id="b2">문화</button>
	<button type="button" id="b3">포토</button>
	<div id="result"></div>
</body>
</html>