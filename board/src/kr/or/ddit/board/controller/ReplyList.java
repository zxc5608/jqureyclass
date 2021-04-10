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


@WebServlet("/ReplyList.do")
public class ReplyList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ReplyList() {
        super();
        // TODO Auto-generated constructor stub
    }

	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//0.bonum가져오기
		int bonum =Integer.parseInt(request.getParameter("bonum"));
		//1.service가져오기
		IboardService service= boardServiceImpl.getService();
		//2. service메서드 호출- 결과값얻기
		List<ReplyVO> list = service.listReply(bonum);
		//3. 결과값을 request에 저장하기 
		request.setAttribute("list", list);
		//4. jsp로 forword
		request.getRequestDispatcher("board/replyList.jsp").forward(request, response);
	}

}
