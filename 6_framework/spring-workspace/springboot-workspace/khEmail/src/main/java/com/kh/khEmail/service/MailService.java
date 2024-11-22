package com.kh.khEmail.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailService {
    // JavaMailSender 주입! => 생성자 주입장식 사용
    private final JavaMailSender sender;

    //{이메일, 코드} --> Map
    private Map<String, String> authInfo = new HashMap<>();
    
    //@Autowired
    public MailService(JavaMailSender sender) {
        this.sender = sender;
    }

    /**
     * 
     * 메일 전송 메소드 
     * @param subject 메일 제목 
     * @param text 메일 내용
     * @param to 수신자
     */
    public void sendMail(String subject, String text, String[] to) {
        // 메일 제목, 메일 내용, 수신자 정보를 SimpleMailMessage 객체에 담기
        SimpleMailMessage message = new SimpleMailMessage();
        
        message.setSubject(subject);
        message.setText(text);
        message.setTo(to);
        
        // JavaMailSender 를 통해 메일 전송
        sender.send(message);
    }
    /**
     * HTML 형식의 메일 전송
     * @param subject 제목
     * @param text	내용
     * @param to	수신자
     */
    public void sendHTMLMail(String subject, String text, String[]to)throws MessagingException {
    	MimeMessage mm = sender.createMimeMessage();
    	MimeMessageHelper helper = new MimeMessageHelper(mm, true);
    	
    	helper.setBcc(subject);
    	helper.setText(text, true);
    	helper.setTo(to);
    	
    	sender.send(mm);
    	
    }

    public void sendCode(String email) throws MessagingException {
        // 랜덤코드 생성 
        String code = makeRandomCode("");
        
        // 코드 전송
        String subject = "[KH] 인증 코드";
        String text = "<p>아래의 인증코드를 입력해주세요.</p> "
        				+ "<h3>" + code + "</h3>"
        				+ "<p>인증 코드는 3분간 유호합니다.<p>";	
        String[] to = { email };
        
        //이메일(email)에 생성된 코드값을 Map에 저장
        authInfo.put(email, code);
        
        //sendMail(subject, text, to);
        sendHTMLMail(subject, text, to);
    }

    private String makeRandomCode(String code) {
        // 랜덤한 값(숫자, 문자)을 6자리 생성

        
            if (code.length()  == 6) {
            	return code; // 코드가 6자리일 때 반환
            } else {
                // 홀수일때 숫자 추가
                int random = (int)(Math.random()*10);// 0부터 9까지
                
                if(random % 2 == 0) {
                	int ran2 = (int)(Math.random()*('z'-'a'+1)+'a');
                	code += (char)ran2;
                }else {
                	 code += random; 	
                }
               return makeRandomCode(code);
            }
        }
    /**
     * 해당 이메일에 발송된 인증코드와 전달받은 인증코드가 같은 값인지 확인
     * @param email
     * @param code
     * @return
     */
    public boolean checkCode(String email, String code) {
    	//Map에서 email에 해당하는 코드를 찾아 -->get(key) : value
    	//전달된 code값과 동일한지 확인하여 결과를 반환
    	
    	String authCode = authInfo.get(email);
    	
    	if(authCode == null) return false;//이메일에 대한 발급코드가 없을 경우 => false
    	
    	boolean result = authCode.equals(code); //같으면 true, 다르면 false
    	if(result) {
    		//인증코드 검증이 성공했을때
    		authInfo.remove(email);
    	}
    	return result;
    	
    }
        
        
    }
