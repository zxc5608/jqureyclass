<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//controller에서 저장된 결과를 가져온다
 List<MemberVO>list= (List<MemberVO>)request.getAttribute("listvalue");

%>
[
<%
	//for(MemberVO vo:list){}

	for(int i=0; i<list.size();i++){
		MemberVO vo= list.get(i);	
		if(i > 0) out.print(",");         //자바
%>
									
		{
			"name" : "<%= vo.getMem_name() %>",
			"id"   : "<%= vo.getMem_id() %>",
			"tel"  : "<%= vo.getMem_hp() %>",
			"mail" : "<%= vo.getMem_mail() %>"
 		}					
		
<%		
	}
														
%>

]
