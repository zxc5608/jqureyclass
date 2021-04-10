package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.dao.ImemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

/*
 * daoImpl객체 얻어오기
 * 자신의 serviceImpl객체 생성하고 리턴하기 Controller에서 사용하기 위함 
 * 
 */
public class MemberServiceImpl implements ImemberService {
	
	private ImemberDao dao;
	private static ImemberService service;
	
	private MemberServiceImpl() {
		dao = MemberDaoImpl.getDao(); 
	}
	public static ImemberService getService() {
		if(service==null)service = new MemberServiceImpl();
		
		return service;
	}
@Override
	public List<MemberVO> getAllMember() {

		List<MemberVO> list = null;
		try {
			list = dao.getAllMember();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public String selectById(String id) {
		String resId = null;

		try {
			resId = dao.selectById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resId;
	}
	@Override
	
	public List<ZipVO> selectByDong(String dong) {
		 List<ZipVO>list= null;
		 
		 try {
			list= (List<ZipVO>) dao.selectByDong(dong);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return list;
	}
	@Override
	public String insertMember(MemberVO vo) {
		String id= null;
		try {
			id= dao.insertMember(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return id;
	}
}
