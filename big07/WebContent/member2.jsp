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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pw1 = request.getParameter("pw1");
		String name = request.getParameter("name");
		
		String day = request.getParameter("day");
		String day2 = request.getParameter("day2");
		String day3 = request.getParameter("day3");
		
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");		
	%>
	<h1>회원가입 입력 정보.</h1>
	<hr color="lime">
	아이디:<%= id %> <br>
	비밀번호:<%= pw %> <br>
	비밀번호 확인:<%= pw1 %> <br>
	이름:<%= name %> <br>
	생년월일: <%= day %><%= day2 %><%= day3 %><br>
	성별: <%= gender %><br>
	이메일:<%= email %><br>
	전화번호:<%= tel %> <br>




</body>
</html>