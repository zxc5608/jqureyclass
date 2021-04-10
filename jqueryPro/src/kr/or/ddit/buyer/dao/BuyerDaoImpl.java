package kr.or.ddit.buyer.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.ibatis.config.SqlMapClientFactory;
/*
 	sqlmapClient객체 얻어오기 -mapper를 수행하기 위함 
 	자신의 객체 생성하고 리턴하기 - service를  위해 
 	
 */
public class BuyerDaoImpl implements IbuyerDao{
	private SqlMapClient smc;
	private static IbuyerDao dao;
	
	private BuyerDaoImpl() {
		smc= SqlMapClientFactory.getSqlMapClient();
		
	}
	public static IbuyerDao getdao() { //서비스가 사용할것
		if(dao==null)dao = new BuyerDaoImpl();
		return dao;
	}
	@Override
	public List<BuyerVO> getBuyerNames() throws SQLException {
		// TODO Auto-generated method stub
		return smc.queryForList("buyer.getBuyerNames");
	}

	@Override
	public BuyerVO getDetail(String id) throws SQLException {
		// TODO Auto-generated method stub
		return (BuyerVO) smc.queryForObject("buyer.getDetail",id);
	}

}
