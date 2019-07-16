<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 선언문: 전역변수 사용, 메소드 정의 -->
<%!
	//(<%! )전역변수 선언하는 곳
%>

<!-- 스크립트릿(작은 프로그램): 자바 코드가 들어가는 부분.(service()) -> 지역변수! -->
<!-- 메소드 정의 할 수 없음. 전역변수 사용 불가! -->
	<%//main 같은 곳이라생각됌
		//HttpServletRequest request = new HttpServletRequest(); 리퀘스트는 내장객체로 이미 생성되있다
	
		String id = request.getParameter("id");//지역변수라고 생각하면됌
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String[] hobby = request.getParameterValues("hobby");
		String result = "";
		for(int i=0; i<hobby.length ; i++){
			result += hobby[i]+" "; 
		}
	%>
	<h1>당신이 입력한 정보는 아래와 같습니다.</h1>
	<hr color="blue">
	HOBBY<%= result %><br><!-- 표현식(Expression):변수값 출력, 연산결과, 메소드호출 반환값 -->
	표현식 연산결과 출력:<%= 100+200 %><br>
	ID:<%= id %> <br>
	PW:<%= pw %> <br>
	NAME:<%= name %> <br>
	TEL:<%= tel %> <br>




</body>
</html>