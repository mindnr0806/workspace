package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	// 필드부(변수)
	private Shape s = new Shape();
	
	// 생성자부 : 생략! (기본생성자는 있을 것임)
	
	// 메소드부
	public double calcPerimeter(double height, double width) {
		// 모양 타입 번호와 전달받은 매개변수
		// 매개변수 있는 생성자로 초기화 시킨 후 둘레 반환 
		// 둘레: 너비*2 + 높이*2
		s = new Shape(4, height, width);
		return (s.getWidth() * 2) + (s.getHeight() * 2);
	}
	
	public double calcArea(double height, double width) {
		// 모양 타입 번호와 전달받은 매개변수를 
		// 매개변수 있는 생성자로 초기화 시킨 후 넓이 반환
		// 넓이 : 너비 * 높이
		s = new Shape(4, height, width);
		return s.getWidth() * s.getHeight();
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "사각형 " + s.information();
	}
}







