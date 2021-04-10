package kr.or.ddit.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.IboardService;
import kr.or.ddit.board.service.boardServiceImpl;
import kr.or.ddit.board.vo.ReplyVO;

@WebServlet("/ReplyModify.do")
public class ReplyModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		
		//0.데이터가져옥
		int renum = Integer.parseInt(request.getParameter("renum"));
		String cont= request.getParameter("cont");
	
		//2.서비스메소드호출
		ReplyVO vo =new ReplyVO();
		vo.setRenum(renum);
		vo.setCont(cont);
		
		//1. 서비스 객체
		IboardService service= boardServiceImpl.getService();
		
		int res= service.updateReply(vo);
		
		//3
		request.setAttribute("res",res);
	
		
		//4 jsp포워드 
		request.getRequestDispatcher("board/update.jsp").forward(request, response);
		
		
	}

}
