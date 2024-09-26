package com.kh.example.practice6.model.vo;

public class Book {
	//필드부
	private String title;
	private String publisher;
	private String author;
	private int pricel;
	private double discountRate;
	
	//생성자부(3)
	public Book() {} 	//기본 생성자 : 초기화 데이터 없이 객체 생성
	
	//매개변수가 3개입 생성자 : 전달된 데이터를 변수에 초기화하여 갱체 생성
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	//매개변수가 5개만 생성자 
	public Book(String title, String publisher, String author,
			int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.pricel = price;
		this.discountRate = discountRate;
	}
	//메소드부
	public void inform() {
		System.out.printf("title=%s, publisher=%s, author=%s, pricel=%d, discountRate=%f\n"
									,title, publisher, author, pricel, discountRate);
				
	}
	
}
