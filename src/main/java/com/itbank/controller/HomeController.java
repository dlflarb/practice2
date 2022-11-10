package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;
import com.itbank.service.CoronaApiService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private BoardService bs;
	private CoronaApiService cs;
	
	@PostMapping("/")	
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("/home");
		mav.addObject("list", bs.getBoardMain());
		return mav;		
	}
	
	@GetMapping("/")
	public ModelAndView CoronaInfo() throws Exception {
		ModelAndView mav = new ModelAndView("/home");
		mav.addObject("map", cs.CoronaService());
		return mav;
	}
	
//	@PostMapping("/")	
//	public ModelAndView home() throws Exception {
//		ModelAndView mav = new ModelAndView("/home");
//		mav.addObject("list", bs.getBoardMain());
//		
//		return mav;		
//	}	
//	
	
}
