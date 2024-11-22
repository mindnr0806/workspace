package com.kH.lclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.kH.lclinic.model.vo.User;
import com.kH.lclinic.service.UserService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	
	private final UserService uService;
	
	@PostMapping("/login")
	public String loginUser(User user, HttpSession session) {
		
		System.out.println(user);
		//DB에서 조회했다고 가정 => session 영역에 로그인 정보 
		//session.setAttribute("user", user);
		User loginUser = uService.loginUser(user);
		
		if(loginUser != null) {
			session.setAttribute("user", loginUser);
		}else {
			
		}
		
		return "redirect:/";
	}

}

