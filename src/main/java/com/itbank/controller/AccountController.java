package com.itbank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.exception.FailException;
import com.itbank.model.account.AccountDTO;
import com.itbank.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService as;
	
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public String login(HttpSession session, AccountDTO dto) throws Exception {
		
		
		AccountDTO user = as.login(dto);
		
		if (user == null) {
			throw new FailException("로그인 실패");
		}
		session.setAttribute("user", user);		
		return "redirect:/";
	}
	
	
	
	
	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		ModelAndView mav = new ModelAndView("msg");
		mav.addObject("msg","로그아웃 되었습니다.");
		//mav.addObject("path","account/login");
		session.removeAttribute("user");
		
		return mav;
	}
	
	@GetMapping("/signup")
	public void signup() {}
	
	@PostMapping("/signup")
	public String signup(AccountDTO dto) throws Exception {
		as.signup(dto);
		
		return "redirect:../";
	}
	
	@GetMapping("/mypage")
	public void mypage() {}
}
