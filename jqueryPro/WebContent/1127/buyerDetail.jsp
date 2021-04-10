<%@page import="kr.or.ddit.buyer.vo.BuyerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	BuyerVO vo =(BuyerVO)request.getAttribute("vo");
%>
{
	"id":"<%= vo.getBuyer_id() %>",
	"name":"<%= vo.getBuyer_name() %>",
	"bank":"<%= vo.getBuyer_bank() %>",
	"bankno":"<%= vo.getBuyer_bankno() %>"
}