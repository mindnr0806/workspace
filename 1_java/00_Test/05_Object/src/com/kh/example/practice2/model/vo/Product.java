package com.kh.example.practice2.model.vo;

public class Product {

	private String name;
	private int price;
	private String brand;
	
	public Product() {}
	
	//메소드부
	//pName 변수의 getter/setter
	//+ information() {}
	

	//getter메소드 : 해당 변수의 값을 제공하는 기능을 수행하는 메소드
	public String getName() {  //get변수명()
		return name;
	}
	//setter 메소드 : 해당 변수에 값을 저장하는 기능을 수행하는 메소드
	public void setName(String name) { //set변수명(해당변수의자료형 변수명)
		this.name = name;
	}
	//price 변수의 getter/seter
	public int getPrice () {
		return price;
	} 
	public void setPrice(int price) {
		this.price = price;
	}
	
	//brand 변수의 getter/seter
	public String getbrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	// + information() : void
	public void information() {
		//현재 클래스의 데이터를 출력
	System.out.println("pName=" + name 
						+ ", price=" + price
						+ ", brand=" + brand);
}
}
