package com.kh.practice.point.view;

import java.util.Scanner;
import com.kh.practice.point.controller.*;


public class PointMenu {
	
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	//기본생성자는 자동으오 생성될것
	
	public void mainMenu() {
		System.out.println("=======메뉴========");
		System.out.println("1. 원");
		System.out.println("2. 사작형");
		System.out.println("9. 끝내기");
		System.out.println("메뉴 번호 : ");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			circleMenu();
		break;
		case 2:
			rectangleMenu();
			break;
		case 9:
			System.out.println("종료합니다.");
			return;
			default:
				System.out.println("다시 입력해주세여.");
		}
	}	
	public void circleMenu() {
		System.out.println("=======원 메뉴========");
		System.out.println("1. 원둘레");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		
		int menu = sc.nextInt();
		
		if(menu == 1) {
			calcCircum();
		}else if (menu == 2) {
			calcCircleArea();
		}else if (menu == 9) {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}else{
			System.out.println("잘못 입력했습니다. 메인으로 돌아갑니다.");
			return;
			//return; //현재 반복문이 실행중이므로 굳이 사용하지 않는다.
		}
	}
	
	public void rectangleMenu() {
		System.out.println("=======메뉴========");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("3. 메인으로");
		System.out.println("메뉴 번호 : ");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 3:
			System.out.println("메인으로 돌아갑니다.");
			return;
			default:
				System.out.println("잘못 입력했습니다. 메인으로 돌아갑니다.");
				return;
		}
	}
	public void calcCircum() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();

		System.out.println("반지름 : ");
		int r = sc.nextInt();
		
		System.out.println(cc.calcCircum(x, x, r));
		
	}	
	public void calcCircleArea() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();

		System.out.println("반지름 : ");
		int r = sc.nextInt();
		
		System.out.println(cc.calcArea(x, x, r));
		
	}	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("높이 : ");
		int h = sc.nextInt();
		
		System.out.print("너비 : ");
		int w = sc.nextInt();


		System.out.println(rc.calcPerimeter(x, y, h, w));
	}	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("높이 : ");
		int h = sc.nextInt();
		
		System.out.print("너비 : ");
		int w = sc.nextInt();


		System.out.println(rc.calcPerimeter(x, y, h, w));
		
	}
	

	
}
