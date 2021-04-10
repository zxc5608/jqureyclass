package kr.or.ddit.member.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.ImemberService;
import kr.or.ddit.member.service.MemberServiceImpl;


@WebServlet("/IdCheck")
public class IdCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public IdCheck() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0. 클라이언트 전송시 데이터 받기 -입력한 id
		String inputId= request.getParameter("id");
		//1. 서비스 객체 얻기
		ImemberService service= MemberServiceImpl.getService();
		
		//2. 서비스 메서드 호출- 결과값 얻다
		String resId = service.selectById(inputId);
		
		//3. 결과값 request에 저장
		request.setAttribute("resId", resId);
		
		//4. jsp로 forward한다. 
		request.getRequestDispatcher("member/idCheck.jsp").forward(request, response);
		
	}

}
