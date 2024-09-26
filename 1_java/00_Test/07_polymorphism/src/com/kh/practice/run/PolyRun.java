package com.kh.practice.run;

import com.kh.practice.chap01_poly.model.vo.*;


public class PolyRun {

	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		bookList[0]= new AniBook("원피스","루피","japan", 12);
		bookList[1]= new CookBook("백종원의 집밥","백종원","korea", true);
		
		String title = "백종원의 집밥";
		
		for (int i=0; i<bookList.length; i++) {
			if(bookList[i].getTitle().equals(title)) {
			System.out.println(bookList[i].toString());
			break;
			}
		}
	}

}
