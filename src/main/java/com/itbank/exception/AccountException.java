package com.itbank.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice("com.itbank.controller")
public class AccountException {
	
	@ExceptionHandler(FailException.class)
	public ModelAndView fail(FailException e) {
		ModelAndView mav = new ModelAndView("backPage");		
		
		
		mav.addObject("msg", e.getMessage());
		
		return mav;
	}
}
