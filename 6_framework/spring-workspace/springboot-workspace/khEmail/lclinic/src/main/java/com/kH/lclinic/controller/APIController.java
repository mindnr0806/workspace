package com.kH.lclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kH.lclinic.model.vo.User;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class APIController {
					
	@RequestMapping("/login/oauth/google")
	public String googleLoginCallback(@RequestParam(value="error", defaultValue="") String error,
									   @RequestParam(value="code", defaultValue="") String code,
									   @RequestParam(value="scope", defaultValue="") String scope,
									   HttpSession session) {  // HttpSession 추가
		log.info("error : {}", error);
		log.info("code : {}", code);
		log.info("scope : {}", scope);
		
		if(code != null && !code.isEmpty()) {
			User user = new User();
			user.setId("구글 로그인 계정");
			
			session.setAttribute("user", user);  // 세션에 사용자 정보 저장
		}
		
		return "redirect:/";
	}
}
