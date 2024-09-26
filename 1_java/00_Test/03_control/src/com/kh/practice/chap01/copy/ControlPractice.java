package com.kh.practice.chap01.copy;

import java.util.Scanner;

public class ControlPractice {
	
	public void practcel() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종류");
					
		System.out.print("메뉴 번호를 입력하세요 :");
		int menu = sc.nextInt();
		
		//메뉴 1을 선택했을 때, => menu	변수의 값이 1과 같다면
		if (menu == 1) {
			System.out.printIn("입력 메뉴입니다.");
		}
		
		
	}
}




