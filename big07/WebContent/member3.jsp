<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean><!-- 액션 태그이다 -->
<jsp:setProperty property="*" name="dto"/><!-- 파라메터 받아주는넘 -->

DTO에 들어간 값 출력
<hr color="green">
id: <%= dto.getId() %><br>
pw: <%= dto.getPw() %><br>
name: <%= dto.getName() %><br>
tel: <%= dto.getTel() %><br>




</body>
</html>