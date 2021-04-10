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
import kr.or.ddit.member.vo.ZipVO;

/**
 * Servlet implementation class Memberjoin
 */
@WebServlet("/join.do")
public class Memberjoin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Memberjoin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post전송시 한글 인코딩 
		request.setCharacterEncoding("utf-8");
	    //0. 클라이언트 전송시 데이터 받기 -입력한 id
	   String id=request.getParameter("mem_id");
	   String name = request.getParameter("mem_name");
	   String pass = request.getParameter("mem_pass");
	   String bir = request.getParameter("mem_bir");
	   String zip = request.getParameter("mem_zip");
	   String add1 = request.getParameter("mem_add1");
	   String add2 = request.getParameter("mem_add2");
	   String hp = request.getParameter("mem_hp");
	   String mail = request.getParameter("mem_mail");
	   
	   MemberVO vo = new MemberVO();
	   
	   vo.setMem_id(id);
	   vo.setMem_name(name);
	   vo.setMem_pass(pass);
	   vo.setMem_bir(bir);
	   vo.setMem_zip(zip);
	   vo.setMem_add1(add1);
	   vo.setMem_add2(add2);
	   vo.setMem_hp(hp);
	   vo.setMem_mail(mail);
	    //1. 서비스 객체 얻기
	    ImemberService service= MemberServiceImpl.getService();
	        
	    //2. 서비스 메서드 호출- 결과값 얻다
	    String resId= service.insertMember(vo);
	    
	        
	    //3. 결과값 request에 저장
	    request.setAttribute("resId", resId);
	    	
	        
	    //4. jsp로 forward한다. 
	    request.getRequestDispatcher("1130/joinres.jsp").forward(request, response);
	   
	}

}
