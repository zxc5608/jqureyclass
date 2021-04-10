package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.prod.vo.ProdVo;

public class ProdDaoImpl implements IprodDao {
	
	private SqlMapClient smc;
	private static IprodDao dao;
	
	private ProdDaoImpl() {
		smc= SqlMapClientFactory.getSqlMapClient();
		
	}
	public static IprodDao getdao() {
		
		if(dao== null)dao= new ProdDaoImpl();
		return dao;
		
	}

	@Override
	public List<ProdVo> getName(String nm) throws SQLException {
		// TODO Auto-generated method stub
		return smc.queryForList("lprod.getName");
	}

	@Override
	public ProdVo getDetail(String name) throws SQLException {
		// TODO Auto-generated method stub
		return (ProdVo) smc.queryForObject("lprod.getDetail");
	}

}
