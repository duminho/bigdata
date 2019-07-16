<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 선언문 -->
<%!
	String name; /* 전역변수는 자동 초기화가 됌 null */
	public String test(){
		return 1000+"원";
	}
%>
<!-- 스크립트릿 (;)꼭써라 -->
<%
	/* PrintWriter out =new PrintWriter(); 내장객체 */
	String test = "";//지역변수라서 자동초기화가 안됌 
	out.print(100+200 + "<br>");
%>	
<!-- 표현식 -->	
<%= 100+200 %><br>
<%= name %>, <%= test %><br>
<%= test() %>
	
	
	
	
	
	
	
</body>
</html>