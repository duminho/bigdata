package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@RequestMapping("insert")
	public void login(@RequestParam String id,@RequestParam String pw) {
		
		System.out.println("ID: "+id);
		System.out.println("PW: "+pw);
		System.out.println("접속 성공");
		
	}
	@RequestMapping("insert2")
	public void login2(MemberDTO memberDTO, MemberDAO memberDAO) {
		memberDAO.insert2(memberDTO);
	}
	
//	@RequestMapping("delete")
//	public void delete(MemberDTO memberDTO, MemberDAO memberDAO) {
//		memberDAO.delete(memberDTO);
//	}
}
