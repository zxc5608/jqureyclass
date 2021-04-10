package kr.or.ddit.buyer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.buyer.service.BuyerServiceImpl;
import kr.or.ddit.buyer.service.IbuyerService;
import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.member.service.ImemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class BuyerController
 */
@WebServlet("/Buyer.do")
public class BuyerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		//0.클라이언트 요청(전송)시 전송되는 데이터를 받는다. 
		
		//1.service객체 얻어오기
		IbuyerService service = BuyerServiceImpl.getService(); 
		
		//2.service 메소드 호출-결과를 받는다.
		
		List<BuyerVO> list =service.getBuyerNames(); 
		//3.request객체에 결과를 저장한다. 
		request.setAttribute("listvalue", list);
		//4.결과로 출력하거나 json데이터생성- JSP 응답페이지
		//jsp페이지로forword시킨다
		RequestDispatcher disp =request.getRequestDispatcher("1127/buyerNames.jsp");
		disp.forward(request, response);
		
		
									
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//id를 조건으로해서 조회하기 
				//0.클라이언트 요청(전송)시 전송되는 데이터를 받는다. -id를 가져오기
					String buyerId= request.getParameter("id"); 
				//1.service객체 얻어오기
				IbuyerService service = BuyerServiceImpl.getService(); 
				
				//2.service 메소드 호출-결과를 받는다.
				BuyerVO vo= service.getDetail(buyerId);
				
				//3.request객체에 결과를 저장한다.
				
				request.setAttribute("vo",vo);
				//4.결과로 출력하거나 json데이터생성- JSP 응답페이지
				//jsp페이지로forword시킨다
				request.getRequestDispatcher("1127/buyerDetail.jsp").forward(request, response);
				
	}

}
