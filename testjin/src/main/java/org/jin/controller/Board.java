package org.jin.controller;

import java.util.List;

import javax.inject.Inject;

import org.jin.dto.BoardDTO;
import org.jin.ser.MemberSer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * 게시물 클래스 입니다
 * @author user
 *
 */

@Controller
public class Board {
	
	@Inject
	private MemberSer ser;
	
	
	
	/**
	 * 게시물 클라이언트가 등록한 값을 서버에서 처리하는 메소드 입니다
	 *@param dto
	 *@param rttr
	 * @return String 뷰페이지 보여주는 
	 */
	
	@RequestMapping(value = "/boardinser" , method = RequestMethod.POST)
	public String boardinsert(BoardDTO dto,RedirectAttributes rttr) {

		
		
		
		try {
			ser.boardinser(dto);
			rttr.addFlashAttribute("msg" , "sc");
		} catch (Exception e) {
			rttr.addFlashAttribute("error", "에러다");
			e.printStackTrace();
		}
		
		
		
		return  "redirect:/boardlist"; 
		
	
	}
	
	
	/**
	 * 게시물 insert  view 를 보여주는 메소드 입니다
	 * @return String 뷰페이지 보여주는 
	 */
	@RequestMapping(value = "/boardinser" , method = RequestMethod.GET)
	public String boardview() {

		
		
	
		
		
		
		return  "/boardinsert"; 
		
	
	}
	
	
	/**
	 * 게시물 리스트를 보여주는 메소드
	 * @param model
	 * @return String 뷰페이지 보여주는 
	 */
	@RequestMapping(value = "/boardlist")
	public String boardlist(Model model) {
		
		List<BoardDTO> list = ser.boardlist();
		
		model.addAttribute("list" , list);
		
		
		
		return "/boardlist";
	}
	
	
	
}
