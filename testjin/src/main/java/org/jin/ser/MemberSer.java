package org.jin.ser;

import java.util.List;

import org.jin.dto.BoardDTO;
import org.jin.dto.MemberDTO;

public interface MemberSer  {
		
	public void inser(MemberDTO dto);
	
	public List<MemberDTO> selectlist();
	
	
	public void boardinser(BoardDTO dto);
	
	
	public List<BoardDTO> boardlist();
	
}
