package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.IboardService;
import kr.or.ddit.board.service.boardServiceImpl;
import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.board.vo.ReplyVO;

@WebServlet("/ReplySave.do")
public class ReplySave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		//0.ajax요청시 데이터 가져오기 -reply
		int bonum=Integer.parseInt(request.getParameter("bonum"));
		String name=request.getParameter("name");
		String cont=request.getParameter("cont");
		
		ReplyVO vo= new ReplyVO();
		vo.setBonum(bonum);
		vo.setName(name);
		vo.setCont(cont);
		
		//1.service객체얻기
		IboardService service= boardServiceImpl.getService();
		
		//2.service메소드 호출- 결과값 받기
		int rnum = service.insertReply(vo);
		
		//3.결과값을 request에 저장 
		request.setAttribute("rnum", rnum);
		//4.jsp로 forward
		request.getRequestDispatcher("board/replySave.jsp").forward(request, response);
	}

}
