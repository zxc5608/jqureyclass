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


@WebServlet("/BoardUpdate.do")
public class BoardUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//0 write , subject ,mail , password, contetn seq
		String write= request.getParameter("writer");
		String subject= request.getParameter("subject");
		String mail= request.getParameter("mail");
		String password= request.getParameter("password");
		String content= request.getParameter("content");
		int seq= Integer.parseInt(request.getParameter("seq"));
		
		//가져와서 boardvo에 저장
		
		BoardVO vo= new BoardVO();
		vo.setWriter("writer");
		vo.setSubject("subject");
		vo.setMail("mail");
		vo.setPassword("password");
		vo.setContent("content");
		vo.setSeq("seq");
		
		
		IboardService service= boardServiceImpl.getService();
		
		int cnt= service.updateBoard(vo);
		
		request.setAttribute("result",cnt);
		
		request.getRequestDispatcher("board/result.jsp").forward(request, response);
		
	}

}
