<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	
	MemberDAO dao = new MemberDAO();
	MemberDTO dto = dao.select();
	
	if(id.equals(dto.getId())){
		out.write("중복 아이디입니다.");
	}else{
		out.write("아이디 사용 가능");
	}
%>
