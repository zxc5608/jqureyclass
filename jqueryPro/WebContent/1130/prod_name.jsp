<%@page import="kr.or.ddit.prod.vo.ProdVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    List<ProdVo>list= (List<ProdVo>)request.getAttribute("listvalue");
    %>
    [
    <%
    for(int i=0;i<list.size();i++){
    	ProdVo vo= list.get(i);
    	if(i>0)out.print(",");
    %>
    {
    "nm":"<%=vo.getProd_name() %>"
    }
<%
    }
%>    
    
    ]