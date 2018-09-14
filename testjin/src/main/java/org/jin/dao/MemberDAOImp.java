package org.jin.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.jin.dto.BoardDTO;
import org.jin.dto.MemberDTO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImp implements MemberDAO {

	@Inject
	private SqlSession session;
	
	private static final String NAME ="org.jin.member.MemberMapper";

	
	@Override
	public void inser(MemberDTO dto) {
		
		session.insert(NAME + ".inser",dto);
		
		
	}

	@Override
	public List<MemberDTO> list() {
		
		
		return session.selectList(NAME + ".list");
	}

	@Override
	public void boardinser(BoardDTO dto) {
		session.insert(NAME +".boardinser",dto);
		
	}

	@Override
	public List<BoardDTO> boardlist() {
		return session.selectList(NAME+".boardlist");
	}

}
