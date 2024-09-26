package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	public static Object mai;

	public static Object main;

	private Scanner sc = new Scanner(System.in);
	
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		System.out.println("1. 지정 문자열 ");
		System.out.println("2. 입력 문자열");
		System.out.println("3. 프로그램 끝내기");
		System.out.print("메뉴 번호 : ");
		
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			tokenMenu();
			break;
		case 2:
			inputMenu();
			break;
		case 3:
			System.out.println("프로그램 종료합니다.");
			break;
			default:
			System.out.println("잘못 입력하셨습니다");
			}
	}

	public void tokenMenu() {
	
		String str = " J a v a P r o g r a m " ;
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 후 개수 : " + str.length());
		String after = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + after);
		System.out.println("토큰 처리 후 개수 : " + after.length());
		System.out.println("모든 대문자로 변환 : " + after.toUpperCase());
	}
	
	public void inputMenu() {
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.next();
		String result = tc.firstCap(str);
		System.out.println("첫 글자 대문자 : " + result);
		
		System.out.println("찾을 문자를 하나 입력하세요 : ");
		char findCh = sc.next().charAt(0);
		int count = tc.findChar(result, findCh);
		
		System.out.println(findCh + "문자가들어간 개수 : " + count);
	}
	
			

}
