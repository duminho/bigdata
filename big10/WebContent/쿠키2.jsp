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
		Cookie[] cookies = request.getCookies();
		for(int i=0;i < cookies.length;i++){
			String name = cookies[i].getName();
			if(!name.equals("JSESSIONID")){
				out.write(name+"  "+cookies[i].getValue() + "<hr>");	
			}
		} 
		
	%>
	<% 	
		/* for(Cookie c: cookies){
			String name = c.getName();	
			
			if(name.equals("name") || name.equals("hi") || name.equals("subject")){
				String value = c.getValue();
				out.write(name+" "+value + "<br>");
				out.write("<hr>");
			}
		} */
	%>
</body>
</html>