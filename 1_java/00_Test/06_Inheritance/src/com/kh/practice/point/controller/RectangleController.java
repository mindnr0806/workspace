package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int width, int height) {
		r = new Rectangle(x, y, width, height);
		return "면적 : " + r.toString() + " / " + (r.getWidth() * r.getHeight());
	}
	
	public String calcPerimeter(int x, int y, int width, int height) {
		r = new Rectangle(x, y, width, height);
		return "둘레 : " + r.toString() + " / " + (2* r.getWidth() + r.getHeight());
	}
}
