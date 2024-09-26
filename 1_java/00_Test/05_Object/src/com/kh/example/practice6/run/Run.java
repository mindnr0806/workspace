package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		//기본생성자료 Book 객체생성
		Book b1 = new Book();
		
		//매개변수가 3개인 생성자료 Book 객체 생성
		Book b2 = new Book("자바 프로그램의 입문"
							, "이지스 퍼블리싱"
							, "박은종");
		//매개변수가 5개인 생성자호 Book 갱체 생성
		Book b3 = new Book("삼국지"
						    , "어딘가.."
						    , "나관중"
						    , 50000
						    , 0.5);
		//각 객체의 정보를 출력
		b1.inform();
		b2.inform();
		b3.inform();
					
	}

}
