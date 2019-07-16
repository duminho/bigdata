<%@page import="java.util.ArrayList"%>
<%@page import="bean.BascatDTO"%>
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
	ArrayList<BascatDTO> list = (ArrayList<BascatDTO>)session.getAttribute("basket");
%>
장바구니에 들어간 물건의 개수: <%= list.size() %><br>
<%
	for(int i=0; i <= list.size();i++){
		BascatDTO dto = list.get(i);
%>	
제품의 아이디:<%= dto.getpId() %> 갯수:<%= dto.getCount() %> 가격:<%= dto.getPrice() %>
<%
	}
%>
</body>
</html>