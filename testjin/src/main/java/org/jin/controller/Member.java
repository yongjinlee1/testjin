package org.jin.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;

import javax.inject.Inject;

import org.jin.dto.MemberDTO;
import org.jin.ser.MemberSer;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 회원 클라스입니다
 * @author user
 *
 */

@Controller
public class Member {

	@Inject
	private MemberSer ser;
	
	/**
	 * 회원 등록 메소드입니다
	 *@param dto
	 * @return String 뷰페이지 보여주는 
	 */
	@RequestMapping(value = "/register")
	public String inser(MemberDTO dto) {
		
		
		
		
		return  "/register"; 
	}
	
	/**
	 * 클라이언트가 등록한 회원정보 처리 메소드 입니다
	 * @param dto
	 * @param rttr
	 * @return String 뷰페이지 보여주는 
	 */
	@RequestMapping(value = "/register" , method = RequestMethod.POST)
	public String inserform(MemberDTO dto , RedirectAttributes rttr) {
		
		
		try {
			ser.inser(dto);
			rttr.addFlashAttribute("msg" , "sc");
		} catch (Exception e) {
			rttr.addFlashAttribute("error", "에러다");
			e.printStackTrace();
		}
		
		
		
		return  "redirect:/list"; 
	}
	
	/**
	 * 로그인 화면 보여주는 메소드
	 * @return  String 뷰페이지 보여주는 
	 */
	@RequestMapping(value = "/login")
	public String login() {
		
		return "/login";
	}
	
	
	/**
	 * 회원 정보 리스트를 보여주는 메소드 입니다
	 * @param del
	 * @return  String 뷰페이지 보여주는 
	 */
	@RequestMapping(value = "list")
	public String list(Model del) {
		
		List<MemberDTO> list = ser.selectlist();
		
		del.addAttribute("list", list);
		
		return "/list";
	}
	
	
	
}
