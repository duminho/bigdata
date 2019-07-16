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
	내가 가장 먹고 싶은 음식은?? ${param.like}<br>
	내가 가장 먹기 싫은 음식은?? ${param.dislike}<br>
	
	<c:if test="${param.like == param.dislike}">두 음식은 같다</c:if>
	<c:if test="${param.like != param.dislike}">두 음식은 다르다</c:if>
</body>
</html>