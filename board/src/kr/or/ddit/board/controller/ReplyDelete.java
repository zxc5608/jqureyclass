package kr.or.ddit.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.IboardService;
import kr.or.ddit.board.service.boardServiceImpl;


@WebServlet("/ReplyDelete.do")
public class ReplyDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0. 
		int renum= Integer.parseInt(request.getParameter("renum"));
		
		//1. 서비스객체얻기 
		IboardService service= boardServiceImpl.getService();
		
		//2.service메서드 호출- 결과값 받기
		int res= service.deleteReply(renum);
		
		//결과를 reque에 저장
		request.setAttribute("res",res);
		
		request.getRequestDispatcher("board/replyDelete.jsp").forward(request, response);
		
	}

	


}
