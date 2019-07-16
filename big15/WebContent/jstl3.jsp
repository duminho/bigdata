<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%-- <%@page %> 는 지시자 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="jstl4.jsp">
		먹고 싶은 음식은<input type="text" name="like"><br>
		먹기 싫은 음식은<input type="text" name="dislike"><br>
		<button type="submit">서버로 전송</button>
	</form>
</body>
</html>