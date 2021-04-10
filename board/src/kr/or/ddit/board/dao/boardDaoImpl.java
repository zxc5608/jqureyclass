package kr.or.ddit.board.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.board.vo.ReplyVO;
import kr.or.ddit.ibatis.config.SqlMapClientFactory;

public class boardDaoImpl implements IboardDao {
/*
 * sqlMapClient객체 얻어오기
 * 자신의 객체를 생성해서 리턴 
 * 
 */
	private SqlMapClient smc;
	private static IboardDao dao;
	
	private boardDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IboardDao getDao() {
		if(dao==null)dao = new boardDaoImpl();
		return dao;
	}
	
	@Override
	public List<BoardVO> listAll() throws SQLException {
		// TODO Auto-generated method stub
		return smc.queryForList("board.listAll");
	}

	@Override
	public List<BoardVO> listPage(Map<String, Object> map) throws SQLException {
		// TODO Auto-generated method stub
		return smc.queryForList("board.listpage",map);
		
	}

	@Override
	public int getTotalCount() throws SQLException {
		// TODO Auto-generated method stub
		return (Integer)smc.queryForObject("board.getTotalCount");
	}

	@Override
	public int insertReply(ReplyVO vo) throws SQLException {
		// TODO Auto-generated method stub
		return (Integer) smc.insert("reply.insertReply",vo);
		
		
	}

	@Override
	public List<ReplyVO> listReply(int bonum) throws SQLException {
		// TODO Auto-generated method stub
		return smc.queryForList("reply.listReply",bonum);
	}

	@Override
	public int updateReply(ReplyVO vo) throws SQLException {
		// TODO Auto-generated method stub
		return smc.update("reply.updateReply",vo);
	}

	@Override
	public int deleteReply(int renum) throws SQLException {
		// TODO Auto-generated method stub
		return smc.delete("reply.deleteReply",renum);
	}

	@Override
	public int insertBoard(BoardVO vo) throws SQLException {
		// TODO Auto-generated method stub
		return (Integer)smc.insert("board.insertBoard", vo);
	}

	@Override
	public int deleteBoard(int seq) throws SQLException {
		// TODO Auto-generated method stub
		return smc.delete("board.deleteBoard", seq);
	}

	@Override
	public int updateBoard(BoardVO vo) throws SQLException {
		// TODO Auto-generated method stub
		return smc.update("board.updateBoard",vo);
	}

	@Override
	public int hitUpdate(int seq) throws SQLException {
		// TODO Auto-generated method stub
		return smc.update("board.hitUpdate",seq);
	}

}
