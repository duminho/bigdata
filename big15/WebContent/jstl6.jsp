
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%-- <%@page %> 는 지시자 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
숫자:<fmt:formatNumber value="123456789" type="number"></fmt:formatNumber><br>
패턴:<fmt:formatNumber value="1234.56789" pattern="0.000"></fmt:formatNumber><br>
정수:<fmt:parseNumber value="1234.56789" integerOnly="true"></fmt:parseNumber>
<c:set var="date" value="<%=%>"/>
날짜만 길게:<fmt:formatDate value="${date}" type="date" dateStyle="" /><br>
</body>
</html>