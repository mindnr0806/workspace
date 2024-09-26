package com.kh.practice;

public class Ebook extends Book{

	public Ebook(String title			// 제목
			, String author		// 저자명
			, String category	// 카테고리
			, int price		// 가격
			) {
		super(title, author, category, (int)Math.round(price*0.8));
		super.setDiscount(0.2);
}
}
