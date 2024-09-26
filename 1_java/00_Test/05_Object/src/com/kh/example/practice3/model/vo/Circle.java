package com.kh.example.practice3.model.vo;

public class Circle {
	
	//변수부
	//PI : double = 3.14
	private static final double PI = 3.14;//- PI : double - 3.14 (밑줄)
	private static int radius = 1;
	
	//생성자부
	// + Circle()
	public Circle() {}
	
	
	//메소드부
	// + incrementRadius() : void
	public void incrementRadius() {
		//반지름의 값을 1증가
		radius++;
	}
	// +getAreaOfCircle() : void
	public void getAreaOfCircle() {
		//원의 넓이 계산 후 출력
		// -> 원주율 * 반지름 * 반지름
		System.out.println("원의 넓이 : " + (PI * radius *radius ));
	}
	// + getSizeOfCircle() : void 
	public void getSizeOfCircle() {
		// 원의 둘레 계산 후 출력
		// -> 2 * 원주율 * 반지름
		System.out.println("원의 둘레 : " + (2 * PI *radius ));
	}

}
