<%@page import="kr.or.ddit.board.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	List<BoardVO>list= (List<BoardVO>)request.getAttribute("list");
    %>
    [
    <%
    	for(int i=0; i<list.size();i++){
    		BoardVO vo = list.get(i);
    		if(i>0)out.print(",");
    
    %>
    	{
    		"seq": "<%= vo.getSeq() %>",
    		"name": "<%= vo.getWriter() %>",
    		"title": "<%= vo.getSubject() %>",
    		"hit": "<%= vo.getHit() %>",
    		"mail": "<%= vo.getMail() %>",
    		"cont": "<%= vo.getContent().replaceAll("\r","").replaceAll("\n","<br>") %>",
    		"wdate": "<%= vo.getWdate() %>",
    		"wip": "<%= vo.getWip() %>",
    		"pass": "<%= vo.getPassword() %>"
    	}
    
	<%
	 }
	%>    	
    
    ]