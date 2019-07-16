<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("pId");
	String price = request.getParameter("price");
	Cookie cookie = new Cookie(id,price);
	response.addCookie(cookie);
%>
	<a href="쿠키2.jsp">넘어가욧</a>
	<%-- <%
		Cookie cookie = new Cookie("hi" ,"hello..");
		response.addCookie(cookie);
		Cookie cookie2 = new Cookie("name" ,"hong");
		response.addCookie(cookie2);
		Cookie cookie3 = new Cookie("subject" ,"jsp");
		response.addCookie(cookie3);
	%>
	<jsp:forward page="쿠키2.jsp"></jsp:forward> --%>
</body>
</html>