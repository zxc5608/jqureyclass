<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	request.setCharacterEncoding("UTF-8");
	
	String userName= request.getParameter("name");
	String addr= request.getParameter("addr");
	String content = request.getParameter("area");
	
	content = content.replaceAll("\r\n", "<br>");
	
	String res="";
	
	
%>
 이름: <%= userName %><br>
 주소: <%= addr %>
 <br>
내용:<%= content %>
</body>
</html>