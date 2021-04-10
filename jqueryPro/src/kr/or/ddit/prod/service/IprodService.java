package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.prod.vo.ProdVo;

public interface IprodService {
		// prod 가져오기
		public List<ProdVo> getName(String nm);
		
		// prod 디테일 가져오기
		public ProdVo getDetail(String name);
}
