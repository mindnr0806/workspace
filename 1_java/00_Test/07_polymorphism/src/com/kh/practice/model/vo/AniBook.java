package com.kh.practice.model.vo;

public class AniBook {
	private String title;
	private String author;
	private String publisher;
	private int accessAge;
	
	public AniBook() {}
	
	public AniBook(String title, String author, String publisher, int accessAge) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.accessAge = accessAge; 
	}

	@Override
	public String toString() {
		return "title="+title+" , author ="+ author
				+ ", publisher=" +publisher+", accessAge="+accessAge ;
	}

	public Object getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
