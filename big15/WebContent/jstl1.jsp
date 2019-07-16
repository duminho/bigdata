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
	<%
		pageContext.setAttribute("name", "park");
	%>
	<c:set var="age" value="100" scope="session"></c:set>
	<c:set var="count" value="200" scope="application"></c:set>
	<h1>${name}환영합니다</h1>
	
	<a href="jstl2.jsp">다음페이지</a>
</body>
</html>