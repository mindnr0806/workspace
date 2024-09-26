package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	//필드부
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new  SnackController();
	
	//생성자부 : 생략
	
	//메소드부
	public void menu() {
		System.out.println("스낵류를 입력하세요");
		
		System.out.print("종류 : ");
		String kide = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		//snackcontroller를 사용하여 데이터 저장 후 출력(saveDate() : String)
		String result = scr.saveDate(kide, name, flavor,numOf, price);
		System.out.println(result);
		
		System.out.print("저장한 정보를 확인하시겠습니가?(y/n) : ");
		char yn = sc.next().charAt(0);
		
		//입력된 값이 y인 겨우 저장된 정보를 출력
		if (yn == 'y' || yn == 'Y') {
			//snackcontroller를 사용하여 저장된 데이터 출력 (confirmData()) : String)
			String data = scr.confirmDate();
			System.out.println(data);
		}
		
		// 그렇지 않은 경우 종료
	}
}
