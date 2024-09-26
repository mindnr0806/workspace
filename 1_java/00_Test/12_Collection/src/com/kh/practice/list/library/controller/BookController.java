package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

// 제어(controller)용 클래스 --> 사용자의 요청에 따라 작업을 제어(수행)한 후 결과를 전달하는 역할
public class BookController {
	private List<Book> list = new ArrayList<>();
	
	public BookController() {
		// 초기 값 4개 추가
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		list.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
		// 전달받은 Book 객체(bk)를 리스트에 추가 : add
		list.add(bk);
	}
	
	public ArrayList<Book> selectList() {
		// 해당 리스트의 주소값 반환 --> 현재 컨트롤러에서 사용중인 리스트의 참조변수를 반환
		return (ArrayList<Book>)list;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		// 검색 결과를 담을 변수 선언 및 생성
		ArrayList<Book> searchList = new ArrayList<>();
		
		// 반복문을 통해 리스트의 책 중에서 책이름에 keyword가 포함된 객체를 searchList 추가
		for(int i=0; i<list.size(); i++) {	// 검색 대상인 list(필드) 길이만큼 반복문 수행
			Book b = list.get(i);			// [1] 리스트에서 인덱스(i)에 해당하는 Book 객체 조회
			String title = b.getTitle();	// [2] 해당 Book 객체의 데이터 중 책 제목 조회
			if (title.contains(keyword)) {	// [3] keyword가 책 제목에 포함되어 있는 지 확인
				// 책 제목에 keyword가 포함되어 있는 경우
				//  searchList 에 해당 객체 추가
				searchList.add(b);
			}
		}
		
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		// 삭제될 도서를 담을 Book 객체 선언 및 null로 초기화
		Book removeBook = null;
		
		// 반복문을 통해 책 목록에서 책 제목이 동일하고, 저자명이 동일한 객체 삭제
		for(int i=0; i<list.size(); i++) {
			Book b = list.get(i);
			if (b.getTitle().equals(title) && b.getAuthor().equals(author)) {
				// 리스트에서 책 제목과 저자명이 모두 동일한 객체인 경우
				removeBook = list.remove(i);	// remove(index) 리스트에서 해당 인덱스 위치의 객체를 제거하고 해당 객체를 반환
				break;
			}
		}
		
		return removeBook;
	}

	public int ascBook() {
		// 책 이름으로 오름차순 정렬 후 1 반환
		
		// ArrayList에 담긴 객체인 Book 클래스에 compareTo 메소드 재정의하여 정렬
		Collections.sort(list);
		
		return 1;
	}
}





