package com.itbank.mvc03;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("loginCheck")
	public String login(Model model, MemberDTO memberDTO) {
		System.out.println("로그인 처리");
		ArrayList list = new ArrayList();
		memberDTO.setId("Stprin");
		memberDTO.setPw("Stprin");
		memberDTO.setName("Stprin");
		memberDTO.setTel("Stprin");
		model.addAttribute("result", "내가 넘어왔어요");
		model.addAttribute("memberDTO", memberDTO);
		
		list.add("감자");
		list.add("양파");
		list.add("당근");
		
		model.addAttribute("list", list);
		
		return "loginResult";
	}
}
