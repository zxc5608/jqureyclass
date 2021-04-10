package kr.or.ddit.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.IboardService;
import kr.or.ddit.board.service.boardServiceImpl;


@WebServlet("/BoardDelete.do")
public class BoardDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int seq=Integer.parseInt(request.getParameter("seq"));
		
		IboardService service= boardServiceImpl.getService();
		
		int cnt= service.deleteBoard(seq);
		
		request.setAttribute("result",cnt);
		
		request.getRequestDispatcher("board/result.jsp").forward(request, response);
	}

}
