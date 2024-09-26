package com.kh.practice.point.model.vo;

public class Circle extends Point{ //extends point => point클래스로부터 상속받는다.
	//상속을 받으므로써 x.y 클래스는 총 3개의 변수를 가지게 된다.
	private int radius;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {	
		super(x, y);
		this.radius=radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		// "{x변수가 저장한값},{y변수에서저장된값},{radius변수에저장된값}"
		return super.toString();
	}
	
	
}
