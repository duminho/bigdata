<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품 상세조회입니다.</h1><br>
	<table border="2">
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>가격</td>
			<td>마일리지</td>
		</tr>
		<tr>
			<td>${productDTO.id}</td>
			<td>${productDTO.name}</td>
			<td>${productDTO.price}</td>
			<td>${productDTO.mileage}</td>
		</tr>
	</table>
</body>
</html>