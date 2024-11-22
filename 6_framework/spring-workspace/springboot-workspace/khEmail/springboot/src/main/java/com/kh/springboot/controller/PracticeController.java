package com.kh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;


@Controller
public class PracticeController {
	
	
	// / practice
	@GetMapping("/practice")
	public String practicePage(Model m, HttpSession session) {
		
		// request scope에 데이터 저장 => Model
		m.addAttribute("name", "양민욱");
		m.addAttribute("title", "<h3>Hell</h3>");
		
		//session scope에 데이터 자장 => HttpSession
		session.setAttribute("age", 20);
		
		return "practice"; //templates/ practice .html
	}
	
	//요청 주소 : test
	@GetMapping("test")
	public String testPage() {
		return "main";  //templates/main.html
	}

}

