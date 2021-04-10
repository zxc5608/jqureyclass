package kr.or.ddit.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.IboardService;
import kr.or.ddit.board.service.boardServiceImpl;
import kr.or.ddit.board.vo.BoardVO;


@WebServlet("/BoardSave.do")
public class BoardSave extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//0. 클라이언트데이터 가져오기
		String writer=request.getParameter("writer");
		String subject= request.getParameter("subject");
		String password=request.getParameter("password");
		String mail=request.getParameter("mail");
		String content=request.getParameter("content");

		BoardVO vo= new BoardVO();
		vo.setWriter(writer);
		vo.setSubject(subject);
		vo.setPassword(password);
		vo.setMail(mail);
		vo.setContent(content);
		
		vo.setWip(request.getRemoteAddr());
		
		
		//1. 서비스
		IboardService service= boardServiceImpl.getService();
		
		//2. 서비스 메소드
		int seq= service.insertBoard(vo);
		
		request.setAttribute("result", seq);
		
		request.getRequestDispatcher("board/result.jsp").forward(request, response);
		
		
	}

}
