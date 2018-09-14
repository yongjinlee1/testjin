package org.jin.dao;

import java.util.List;

import org.jin.dto.BoardDTO;
import org.jin.dto.MemberDTO;

public interface MemberDAO {

	public void inser(MemberDTO dto);
	
	public List<MemberDTO> list();
	
	public void boardinser(BoardDTO dto);
	
	public List<BoardDTO> boardlist();
}
