<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	request.setCharacterEncoding("UTF-8");
	
	String userName1= request.getParameter("name");
	String addr1= request.getParameter("addr");
	String email = request.getParameter("email");
	String gender = request.getParameter("gend1");

	
		
%>

 이름: <%= userName1%><br>
 주소: <%= addr1%>
 <br>
내용:<%= email%><br>
성별:<%= gender%>

	

</body>
</html>