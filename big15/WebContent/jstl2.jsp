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
페이지 속성:${name}<br>
세션 속성:${age}<br>
어플리케이션 속성:${count}<br>
</body>
</html>