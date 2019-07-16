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
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String me = request.getParameter("me");
	String pw = request.getParameter("pw");
%>
	bbs 파라메터 값
	<hr>
	TITLE:<%=title %><br>
	CONTENT:<%=content %><br>
	ME:<%=me %><br>
	PW:<%=pw %><br>
</body>
</html>