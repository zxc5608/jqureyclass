package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.prod.vo.ProdVo;

public interface IprodDao {

	// prod 가져오기
	public List<ProdVo> getName(String nm) throws SQLException;
	
	// prod 디테일 가져오기
	public ProdVo getDetail(String name) throws SQLException;
}
