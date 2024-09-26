package com.kh.practice.run;


import java.util.Scanner;
import com.kh.practice.model.vo.AniBook;
import com.kh.practice.model.vo.CookBook;

public class Run {

	public static void main(String[] args) {
		
		AniBook[] aniList = {
				
					new AniBook("원피스","루피","japan", 12),
					new AniBook("나루토","나루토","japan", 15),
					new AniBook("갓오하","진모리","korea", 9),
					new AniBook("만화2","작가","korea", 8),
					new AniBook("만화3","작가1","korea", 7),
					new AniBook("만화4","작가2","korea", 11),
		};
		
	
		CookBook[]  cookList= {
				
				
				new CookBook("백종원의 집밥","백종원","korea", true),
				new CookBook("길거리 음식","작가3","korea", false),
				new CookBook("동네 맛집","작가4","korea", true),
					};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("조회하고자 하는 책 제목 입력 : ");
		String title = sc.nextLine();
		
		boolean found = false;
		for(int i=0; i<aniList.length; i++) {
			if (aniList[i].getTitle().equals(title)) {
				System.out.println(aniList[i].toString());
					found = true;
					break;
				
			}
		}
		
	}
}
