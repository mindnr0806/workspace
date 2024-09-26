package com.kh.spring.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class Loginlnterceptor implements HandlerInterceptor {

	
		
	/*
	 * 	Interceptor
	 * -요청 url에 해당하는 controller가 실현되기 전에 또는 후에 처리할 내용을 작성
	 * -로그인 유/무 판단, 회원의 권한 체크 등 처리
	 * 
	 * *preHandle : DispatcherServlet이 Controller를 호출하기 전 처리하는  영역(전처리)
	 * *postHandle : Controller 처리 후 DispatcherServlet으로 view(화면) 정보를 리턴하는 순간 처리하는 영역(후처리)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/*
		 * *true 리턴 : 기존 방식대로 동작 -> 해당 컨트룰러 호출(실행)
		 * *false 리턴 : 컨트룰러를 실행하지 않음
		 * 
		 */
		
		//로그인 전에 컨트룰러를 실행하지 않음 
		HttpSession session = request.getSession();
		
		if(session.getAttribute("loginUser") !=null){
			return true;		
		}else {
			session.setAttribute("alerMsg", "로그인 후 이용가능합니다.");
			response.sendRedirect(request.getContextPath());
			
			return false;
		}
	}
}
