package org.jin.ser;

import java.util.List;

import javax.inject.Inject;

import org.jin.dao.MemberDAO;
import org.jin.dto.BoardDTO;
import org.jin.dto.MemberDTO;
import org.springframework.stereotype.Service;

@Service
public class MemberSerImp  implements MemberSer{

	@Inject
	private MemberDAO dao;
	
	
	
	@Override
	public void inser(MemberDTO dto) {
		
		dao.inser(dto);
		
	}

	@Override
	public List<MemberDTO> selectlist() {
		
		return dao.list();
	}

	@Override
	public void boardinser(BoardDTO dto) {
		
		dao.boardinser(dto);
		
	}

	@Override
	public List<BoardDTO> boardlist() {
		return dao.boardlist();
	}

}
