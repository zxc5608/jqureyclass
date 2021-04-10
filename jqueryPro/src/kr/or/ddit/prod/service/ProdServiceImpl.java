package kr.or.ddit.prod.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.prod.dao.IprodDao;
import kr.or.ddit.prod.dao.ProdDaoImpl;
import kr.or.ddit.prod.vo.ProdVo;

public class ProdServiceImpl implements IprodService {
	private IprodDao dao;
	private static IprodService service;
	
	private ProdServiceImpl() {
		dao=ProdDaoImpl.getdao();
	}
	public static IprodService getService() {
		if(service==null)service= new ProdServiceImpl();
		return service;
	}
	@Override
	public List<ProdVo> getName(String nm) {
		List<ProdVo>list= null;
		try {
			list =dao.getName(nm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ProdVo getDetail(String name) {
		ProdVo vo=null;
		
		try {
			vo=dao.getDetail(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}

}
