package kr.or.ddit.lprod.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.lprod.dao.IlprodDao;
import kr.or.ddit.lprod.dao.LprodDaoImpl;
import kr.or.ddit.lprod.vo.LprodVo;

public class LprodServiceImpl implements IlprodService {
	
	private IlprodDao dao;
	private static IlprodService service;
	
	private LprodServiceImpl() {
		dao= LprodDaoImpl.getDao();
	}
	
	public static IlprodService getService() {
		if(service==null)service= new LprodServiceImpl();
		return service;
	}
	@Override
	public List<LprodVo> getAllLprod() {
		List<LprodVo> list= null;
		try {
			list = dao.getAllLprod();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
