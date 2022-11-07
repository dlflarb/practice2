package com.itbank.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.itbank.model.account.AccountDTO;

// intercepter : 요청을 가로채서 원하는 내용을 처리하는 클래스

// 인터셉터 작동시점
// 1. prehandle			: 요청이 컨트롤러에 도달하기전에 가로채서 처리
// 2. Posthandle		: 컨트롤러가 수행된 후 처리 
// 3. afterCompletion	: 응답이 클라이언트에 도달한 후 처리

// * 인터셉터는 주로 preHandle을 사용한다
// * 사후에 처리하는 post와 after는 주로 로그(log)를 남기기 위해서 사용

public class LoginIntercepter extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession(); 					//요청에서 세션을 받는다.
		AccountDTO user = (AccountDTO) session.getAttribute("user"); 	// 세션에 저장한 계정 객체를 가져온다.
		
		String cpath = request.getContextPath();						//절대경로 세팅
		
		if(user== null) { //로그인이 되지 않았다면
			response.sendRedirect(cpath + "/account/login");
			return false; // false를 반환하면 컨트롤러를 이어서 수행하지 않는다.
		}
		
		
		
		
		
		return true;		// true를 반환하면 인터셉터가 끝난 후 컨트롤러를 이어서 수행된다.
	}
	
	
}
