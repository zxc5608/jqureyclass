<%@page import="kr.or.ddit.board.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	List<BoardVO>list= (List<BoardVO>)request.getAttribute("list");
    	
    	int total= (Integer)request.getAttribute("tp");
    	int startp= (Integer)request.getAttribute("sp");
    	int endp= (Integer)request.getAttribute("ep");   //불러온다
    	
    	
    	//json데이터를 불러온다. 
    %>
    
    { 
    
    "tp"	: "<%=total %>",
    "sp"	: "<%=startp %>",
    "ep"	: "<%=endp %>",
    "datas" :			
    
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
    }