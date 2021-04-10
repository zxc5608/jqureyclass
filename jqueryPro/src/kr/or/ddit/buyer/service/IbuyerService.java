package kr.or.ddit.buyer.service;

import java.util.List;

import kr.or.ddit.buyer.vo.BuyerVO;

public interface IbuyerService {
	
	//전체 이름과 id를 가져오기 (리스트
	public List<BuyerVO> getBuyerNames();
	
	//id를 조건으로 조회하기 (오브젝트
	public BuyerVO getDetail(String id);
	
	
	
}
