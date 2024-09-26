package com.kh.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

public void mainMenu() {
	
	System.out.println("====도서 목록====");
	while(true) {
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("6. 베스트 셀러 추가");
		System.out.println("7. 베스트 셀러 삭제");
		System.out.println("8. eBook 추가");
		System.out.println("9. eBook 삭제");
		System.out.println("10. 종료");
		
		System.out.print("메뉴 번호 선택 : ");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1: insertBook(); break;
		case 2: selectList(); break;
		case 3: searchBook(); break;
		case 4: deleteBook(); break;
		case 5: ascBook(); break;
		case 6: bestsellerAdd(); break;
		case 7: deletebestseller(); break;
		case 8: eBookAdd(); break;
		case 9: deleteEBook(); break;
		case 10: System.out.println("프로그램 종료합니다.");
				return;		
		default: System.out.println("잘못 입력했습니다. 다시 입력해주세요."); break;
		}
	}
}
//추가
public void insertBook() {
	System.out.print("도서명 : ");
	String title = sc.nextLine();
	System.out.print("저자명 : ");
	String author = sc.nextLine();
	System.out.print("장르(1.문학 / 2.역사 / 3.추리 / 4.기타) : ");
	int category = sc.nextInt();
	System.out.print("가격 : ");
	int price = sc.nextInt();
	
	String strCtg = "";
	if (category == 1) {
		strCtg = "문학";
	} else if (category == 2) {
		strCtg = "역사";
	} else if (category == 3) {
		strCtg = "추리";
	} else if (category == 4) {
		strCtg = "기타";
	}
	Book b = new Book(title, author, strCtg, price);
	
	bc.insertBook(b);
}

public void selectList() {
	
	ArrayList<Book> bookList = bc.selectList();
	if(bookList.isEmpty()) {
		System.out.println("존재하는 도서가 없습니다.");
	} else {
		
		for(int i=0; i < bookList.size(); i++) {	
			System.out.println(bookList.get(i));
		}
	
	}
}


public void searchBook() {
	
	System.out.print("검색 키워드 : ");
	String keyword = sc.nextLine();
	

	ArrayList<Book> searchList = bc.searchBook(keyword);
	
	if(searchList.isEmpty()) {
		System.out.println("검색 결과가 없습니다.");
	} else {
		for (Book b : searchList) {
			System.out.println(b);
		}
	}
}

//삭제
public void deleteBook() {

	System.out.print("도서명 : ");
	String title = sc.nextLine();
	
	System.out.print("저자명 : ");
	String author = sc.nextLine();
	
	
	Book remove = bc.deleteBook(title, author);
	
	
	if (remove != null) {
	
		System.out.println("성공적으로 삭제되었습니다.");
	} else {
		
		System.out.println("삭제할 도서를 찾지 못했습니다.");
	}
}


public void ascBook() {
	
	int result = bc.ascBook();
	if (result == 1) {
		System.out.println("정렬에 성공했습니다.");
	} else {
		System.out.println("정렬에 실패했습니다.");
	}
}

public void bestsellerAdd(){
	
	System.out.print("도서명 : ");
	String title = sc.nextLine();
	
	System.out.print("저자명 : ");
	String author = sc.nextLine();
	
	System.out.print("카테고리 : ");
	String category = sc.nextLine();
	
	System.out.print("가격 : ");
	int price = sc.nextInt();
	sc.nextLine();
	
	//Integer.parseInt("2000")
	String bestTitle = "[베스트 셀러]" + title;			
	Bestsellers b = new Bestsellers(bestTitle, author, category, price);
//	System.out.println(b);
	bc.insertBook(b);
	
	System.out.println("베스트 셀러에 추가되었습니다.");
	
}

public void deletebestseller() {

	System.out.print("도서명 : ");
	String title = sc.nextLine();
	
	System.out.print("저자명 : ");
	String author = sc.nextLine();
	
	
	Book remove = bc.deleteBook(title, author);
	
	
	if (remove != null) {
	
		System.out.println("성공적으로 삭제되었습니다.");
	} else {
		
		System.out.println("삭제할 도서를 찾지 못했습니다.");
	}
}

public void eBookAdd(){
	System.out.print("도서명 : ");
	String title = sc.nextLine();
	
	System.out.print("저자명 : ");
	String author = sc.nextLine();
	
	System.out.print("카테고리 : ");
	String category = sc.nextLine();
	
	System.out.print("가격 : ");
	int price = sc.nextInt();
	sc.nextLine();
	String ebooklist = "[eBook]" + title;			
	Ebook eb = new Ebook(ebooklist, author, category, price);
	bc.insertBook(eb);
	
	System.out.println("eBook에 추가되었습니다.");
}
public void deleteEBook() {

	System.out.print("도서명 : ");
	String title = sc.nextLine();
	
	System.out.print("저자명 : ");
	String author = sc.nextLine();
	
	
	Book remove = bc.deleteBook(title, author);
	
	
	if (remove != null) {
	
		System.out.println("성공적으로 삭제되었습니다.");
	} else {
		
		System.out.println("삭제할 도서를 찾지 못했습니다.");
	}
}
}


