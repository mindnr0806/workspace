package com.kh.practice.map.view;

import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	public void  mainMenu() {
		System.out.println("========== KH 사이트 ==========");
		while(true) {
		System.out.println("=====******* 메인 메뉴 ******* =====");
		System.out.println("1. 회원가입 ");
		System.out.println("2. 로그인 ");
		System.out.println("3. 같은 이름 회원 찾기 ");
		System.out.println("9. 종료 ");
		System.out.println("메뉴 번호 선택 : ");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1:
			joinMembership();
			break;
		case 2:
			 logIn(); memberMenu();
			 break;
		case 3:
			sameName();
			break;
		case 9:
			System.out.println("프로그램 종료");
			return;
			default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			break;
		}
		
		}
	}
	
	public void  memberMenu() {
		while(true) {
		System.out.println("=====*******화원 메뉴******* =====");
		System.out.println("1. 비밀번호 바꾸기");
		System.out.println("2. 이름 바꾸기");
		System.out.println("3. 로그아웃");
		System.out.println("메뉴 번호 선택 : ");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1:
			changePassword();
			break;
		case 2:
			changeName();
			break;
		case 3:
			System.out.println("로그아웃 되었습니다");
			return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
					
		}
		}
	}
	
	public void  joinMembership() {
		while(true){
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			
			System.out.println("비밀번호 : ");
			String pwd = sc.nextLine();
			
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			Member member = new Member(pwd, name);
			
			boolean result = mc.joinMembership(id, member);
			if(result) {
				System.out.println("성공적으로 회원가입 완료되었습니다.");
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void  logIn() {
		
		
	}
	
	public void changePassword() {}
	
	public void changeName() {}
	
	public void sameName() {}
}
