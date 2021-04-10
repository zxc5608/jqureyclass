package kr.or.ddit.board.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.board.service.IboardService;
import kr.or.ddit.board.service.boardServiceImpl;
import kr.or.ddit.board.vo.BoardVO;

/**
 * Servlet implementation class boardList
 */
@WebServlet("/List.do")
public class boardList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public boardList() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//전체리스트 가져오기 
		
		//1.서비스객체 
		IboardService service= boardServiceImpl.getService();
		//2메서드호출
		List<BoardVO>list= service.listAll();
		//3.결과값 저장 
		request.setAttribute("list", list);
		//4.
		request.getRequestDispatcher("board/listAll.jsp").forward(request, response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//페이지별 리스트 가져오기 
		
		//0.page번호 가져오기 
		int cpage=Integer.parseInt(request.getParameter("page"));
		//1.서비스객체 
		IboardService service= boardServiceImpl.getService();
		
		//전체 글 개수 가져오기 
		int totalCount=service.getTotalCount();
		
		//한페이지 당 출력할 글 갯수
		int perList=5;
		
		int start=(cpage-1)*perList+1;
		//cpage=1  1
		//cpage=2 ->4
		//cpage=3 ->7
		int end= start+perList-1;
		//start 17~19 start = 20
		if(end>totalCount) end= totalCount;
		
		//한 화면에 출력될 페이지 개수 
		int perPage=3;
		int totalPage= (int)(Math.ceil(totalCount / (double)perList));
		
		int startPage = ((cpage-1)/perPage*perPage)+1;
		//cpage=1 -> 1 cpage= 2 -> 1 cpage=3->3 cpage4 -> 3
		
		
		int endPage= startPage+perPage -1;
		if(endPage>totalPage)endPage=totalPage;     //endpage가 totalpage보다 크면안된다. 
			
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("start",start);
		map.put("end",end);
		
		//2메서드호출
		List<BoardVO>list= service.listPage(map);
		//3.결과값 저장 
		request.setAttribute("list", list);
		request.setAttribute("sp",startPage);
		request.setAttribute("ep",endPage);
		request.setAttribute("tp",totalPage);
		//4.
		request.getRequestDispatcher("board/listPage.jsp").forward(request, response);
		
		
		
		
		
	}

}
