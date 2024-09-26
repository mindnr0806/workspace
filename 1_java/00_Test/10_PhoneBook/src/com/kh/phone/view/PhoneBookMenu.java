package com.kh.phone.view;

import java.util.Scanner;

import com.kh.phone.controller.PhoneBookController;
import com.kh.phone.model.vo.PhoneBook;

public class PhoneBookMenu {
	private PhoneBookController pbc = new PhoneBookController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
/*
	====== 전화번호부 ======
	1. 전화번호 추가
	2. 전화번호 조회
	9. 종료
	====================
 */
		while(true) {
			System.out.println("====== 나만의 전화번호부 ======");
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전화번호 조회");
			System.out.println("9. 종료");
			System.out.println("============================");
			
			int menu = sc.nextInt();
			sc.nextLine();		// 버퍼비우기!
			
			switch(menu) {
			case 1:
				addPhone();
				break;
			case 2:
				searchPhone();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void addPhone() {
		System.out.println("----- 연락처 추가 -----");
		
		System.out.print("- 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("- 연락처(-포함) : ");
		String phone = sc.nextLine();
		

		System.out.print("- 소속 : ");
		String group = sc.nextLine();
		
		System.out.print("- 이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("- 기타사항 : ");
		String memo = sc.nextLine();
		
		PhoneBook pb = new PhoneBook(name, phone, group, email, memo);
		pbc.addPhone(pb);

	}
	
	public void searchPhone() {
		PhoneBook[] pList = pbc.searchPhone();
		
		for(PhoneBook phone : pList) {
			if (phone != null)
				System.out.println(phone);
		}
	}
}





