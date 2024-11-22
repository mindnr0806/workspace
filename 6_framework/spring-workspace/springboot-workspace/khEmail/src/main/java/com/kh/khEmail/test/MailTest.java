package com.kh.khEmail.test;

import java.io.File;
import java.util.Properties;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

public class MailTest {
	
	/*
	 * 이메일 관련 프로토콜
	 * 
	 * * SMTP (Simple Mail Transfer Protocol)
	 * 	: 이메일 전송 시 사용되는 프로토콜
	 * 
	 * * POP (Post Office Protocol)
	 * 	: 이메일 서버에 도착한 메일을 클라이언트로 가지고 올 때 사용되는 프로토콜
	 * 
	 * * IMAP(Internet Message Access Protocol)
	 * : 이메일 서버에 직접 접속하여 메일을 확인할 때 사용되는 프로토콜
	 * => Gmail서버(smtp) 사용 시 활성화 필요!
	 */

	public static void main(String[] args) throws Exception {
		
		// JavaMailSenderImpl 객체 사용 => org.springframework.mail(boot start mail 의존성 추가)
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		
	
		//메일 서버 관련 설정
		sender.setHost("smtp.gmail.com");// - SMTP 서버 주소
		sender.setPort(587);// - 포트
		sender.setUsername("a01046452207@gmail.com");// - 인증받는 사용자 이메일
		sender.setPassword("oqpu qrlt wkby xfmf");// - 앱 비밀번호
		
		Properties prop = new Properties();
		prop.put("mail.smtp.auth",true);//SMTP 서버 연결시 사용자 인증 설정
		prop.put("mail.smtp.starttls.enable",true);//SMTP 연결시 TLS 
		sender.setJavaMailProperties(prop);
		//-------------
		
		//메일 전송 준비
		MimeMessage mm = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mm, true, "UTF-8");
		
		helper.setSubject("[KH] 메일 테스트"); //메일 제목				
		helper.setText("메일이 전송될까요?안될까요?"); //메일 내용
		helper.setFrom("a01046452207@gmail.com", "[KH] 메일 전송"); //메일 제목
		helper.setTo("alsdnr6672@naver.com"); //수신자
		
		//파일 첨부(첨부파일)
		File f = new File(MailTest.class.getResource("/static/img/test.jpg").getPath());
		helper.addAttachment("test.jpg", f);
		//-----------------
		
		//메일 전송
		sender.send(mm);
		
		System.out.println("---------------Mail Test END----------------------");
	
	}

}
