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

  String userName= request.getParameter("name");
  
  String content= request.getParameter("area");
  //입력시 엔터(\r\n)를 출력을위해서<br>태그로 변환한다.
  
  content= content.replaceAll("\r\n"," <br>");   //내용칸 내의 엔터출력
  //content= content.replaceAll("\r","").replaceAll("\n","<br>"); 두가지방법
  
  String sel[] = request.getParameterValues("fruit");
  
  String res ="";
  for(int i=0;i<sel.length;i++){
	  res+=sel[i] +",";
  }
  int idx = res.lastIndexOf(",");
  res=res.substring(0,idx);
  

%>
 이름: <%= userName %><br>
 내용:<br> 
 <%= content %>
 <br>
 좋아하는 과일: <%= res %>
 
</body>
</html>