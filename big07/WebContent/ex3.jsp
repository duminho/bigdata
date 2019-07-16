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
	String travel = request.getParameter("travel");
	String cnt = request.getParameter("cnt");
	String total="";
	int c = Integer.parseInt(cnt);
	if(c<3){
		total=travel+"을 더 갈수 있겠군요";
	}else{
		total=travel+"을 그만 가셔야겠군요";
	}
%>
<%= total %>

</body>
</html>