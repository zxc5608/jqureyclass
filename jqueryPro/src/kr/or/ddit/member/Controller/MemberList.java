package kr.or.ddit.member.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.ImemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class MemberList
 */
@WebServlet("/List.do") //이  이름으로 호출 
public class MemberList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		//0.클라이언트 요청(전송)시 전송되는 데이터를 받는다.
		
		//1.service객체 얻어오기
		ImemberService service = MemberServiceImpl.getService();
		
		//2.service 메소드 호출-결과를 받는다.
		List<MemberVO> list = service.getAllMember();
		
		//3.request객체에 결과를 저장한다. 
		request.setAttribute("listvalue", list);
		//4.결과로 출력하거나 json데이터생성- JSP 응답페이지
		//jsp페이지로forword시킨다
		request.getRequestDispatcher("1127/memberList.jsp").forward(request, response);
								//jsp이름
	}

}
