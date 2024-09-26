package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {
private List<Book> list = new ArrayList<>();
	
	public BookController() {
		list.add(new Book("비블리아 고성당", "미카미 엔", "문학", 7000));
		list.add(new Book("해저2만리", "쥘 베른", "문학", 14000));
		list.add(new Book("고구려는 천자의 제국이었다", "이덕일", "역사", 16500));
		list.add(new Book("마녀와의 7일", "히가시노 게이고 ", "추리", 18800));
		list.add(new Book("레미제라블", "빅토르 위고", "문학", 22000));
		list.add(new Book("걸리버 여행기", "조나단 스위프트", "문학", 11500));
		list.add(new Book("셜록 홈즈", "아서 코난 도일", "추리", 15800));
		list.add(new Book("나무", "베르나르 베르베르", "문학", 15800));
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	public ArrayList<Book> selectList() {
		return (ArrayList<Book>)list;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<>();
		
		
		for(int i=0; i<list.size(); i++) {	
			Book b = list.get(i);			
			String title = b.getTitle();	
			if (title.contains(keyword)) {
				searchList.add(b);
			}
		}
		
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		
		Book removeBook = null;
		
		
		for(int i=0; i<list.size(); i++) {
			Book b = list.get(i);
			if (b.getTitle().equals(title) && b.getAuthor().equals(author)) {
			
				removeBook = list.remove(i);	
				break;
			}
		}
		
		return removeBook;
	}

	public int ascBook() {
		
		Collections.sort(list);
		
		return 1;
	}
	public int bestsellerAdd() {
		return 6;
	}
}







