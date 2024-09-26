package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		//면적 : PI * 반지름 * 반지름
		c = new Circle(x, y, radius); 
		double area = Math.PI * c.getRadius() * c.getRadius();
		return "면적 : "  +  c.toString() + " / " + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		double circum = Math.PI *c.getRadius() * 2;
		return "둘레 : " + c.toString() + " / " + circum;
		// 데이터를 RectangleController(rc) calcPerimeter()의 매개변수로 보내 반환값 출력
	}

}
