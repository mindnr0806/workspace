package com.kh.practice.model.vo;

public class CookBook {
	private String title;
	private String author;
	private String publisher;
	private boolean coupon;
	
	public CookBook() {}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.coupon = coupon;
		
	}
	@Override
	public String toString() {
		return  "title="+title+" , author ="+ author
				+ ", publisher=" +publisher+", coupon="+coupon ;
	} 

	
	

	
}
