<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource
	url="jdbc:mysql://localhost:3306/bigdata"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password="1234"
	scope="application"
	var="db"
/>
<sql:query var="list" dataSource="${db}">
	select * from bbs
</sql:query>
<table border="2" style="text-align: center;">
	<tr>
		<td>아이디</td>
		<td>비밀번호</td>
		<td>이름</td>
		<td>전화번호</td>
	</tr>
<c:forEach var="imsi" items="${list.rows}">
	<tr>
		<td>${imsi.id}</td>
		<td>${imsi.pw}</td>
		<td>${imsi.name}</td>
		<td>${imsi.tel}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>