package com.kH.lclinic.inertceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@Component
public class UserInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/*
		 * *true 리턴 : 기존 방식대로 동작 -> 해당 컨트룰러 호출(실행)
		 * *false 리턴 : 컨트룰러를 실행하지 않음
		 * 
		 */
		
		//로그인 전에 컨트룰러를 실행하지 않음 
	
		if(request.getAttribute("loginUser") !=null){
			
			return true;		
		}else {
		
			response.sendRedirect(request.getContextPath());
			return false;
		}
	}
		
		
	}
	
	
