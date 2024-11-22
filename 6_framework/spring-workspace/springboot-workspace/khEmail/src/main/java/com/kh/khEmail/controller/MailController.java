package com.kh.khEmail.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kh.khEmail.service.MailService;

import jakarta.mail.MessagingException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/*
 * @RestController : RESTful 웹 서비스에서 주로 사용
 * 					클래스 내 대부분의 메소드는 뷰(화면)보다는 객체(데이터) 반환하는 용도로 사용
 * 					@Controller + @ResponseBody
 * 
 * - RESR(Representational State Transfer) => 웹 서비스 설계 원칙
 *  	> 클라이언트와 서버 간의 통신을 Stateless하게 유지하고, 서버는 클라이언트의 상태를 저장하지 않음
 *  	> 모든 요청은 독립적으로 처리하고 필요한 데이터를 모두 포함해야 함(인증 정보도 포함)
 *  
 *  	- RESTfUL : REST 원칙을 따라서 어떤 자원에 대해 CRUD연산을 수행하기 위한 방식
 *  	>URI에 자원을 명시하고, 요청방식(Method)으로 연산의 종류를 구분
 *  	ex) 회원 추가 => (POST) /user
 *   		회원 조회 => (GET) /user
 *   		게시글 수정 => (PUT) /board 
 *   		게시글 삭제 => (DELETE) /board
 */
	
@Slf4j
@RestController
//@RequiredArgsConstructor // [1] lombok 사용 시 가능!
@CrossOrigin(origins = "http://localhost:3000")
public class MailController {

	 private final MailService mService;
	 
	 //[2] 생성자를 직접 작성
	 @Autowired
	    public MailController(MailService mService) {
	        this.mService = mService;
	    }
	// 이메일 정보를 전달 받는 메소드 
	// => 중요한 정보의 경우 POST를 자주 사용
	 
	 @PostMapping("mail")
	 public String sendAuth(@RequestBody Map<String, Object> request)throws Exception{
		 
	 String email = (String)request.get("email");

	 if(email == null){
	 throw new Exception("필수 항목이 없습니다. (email))"); 
	 }
    	log.info("* email : {}", email);
    	/*메일전송 테스트
    	String subject = "[KH]테스트 메일";
    	String text = "인증 코드";
    	String[] to = { email };
    	
    	mService.sendMail(subject, text, to);
    	*/
    	try {
    		mService.sendCode(email);	
    	}catch (MessagingException e) {
    		e.printStackTrace();
    	}
    	
    	return "ok";
    }
    
    @PostMapping("/check")
   // public String checkCode(String email, String code) {
    public String checkCode(@RequestBody MailRequest request)throws Exception {
    	String email = request.getEmail();
    	String code = request.getCode();
    	
    	if(email == null || code == null) {
    		throw new Exception("필수 데이터가 전달되지 않았습니다, (email, code)");
    	}
    	
    	log.info("* email:{},code:{}", email,code);
    	
    	boolean result = mService.checkCode(email, code);
    	if(result) {
    		return "success";
    	}else {
    		return "failed";
    	}
    }	
}
@Data
class MailRequest{
private String email;
private String code;

}
