package kr.or.ddit.lprod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.lprod.vo.LprodVo;

public class LprodDaoImpl implements IlprodDao {

	private SqlMapClient smc;
	private static IlprodDao dao;
	
	private LprodDaoImpl() {
		smc= SqlMapClientFactory.getSqlMapClient();
	}
	public static IlprodDao getDao() {
		if(dao==null)dao = new LprodDaoImpl();
		return dao;
	}
	@Override
	public List<LprodVo> getAllLprod() throws SQLException {
		
		return smc.queryForList("lprod.selectLprod");
	}

}
