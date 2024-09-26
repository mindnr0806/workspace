package com.kh.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	private BookDAO bd = new BookDAO();
	
	public void makeFile() {
		// “book.txt”를 매개변수로 받는 File 객체를 생성하여
		File file = new File("book.txt");
		
		// book.txt가 없다면 파일 생성 (exists/createNewFile)
		if (!file.exists()) {		// 해당 파일이 존재하는 지 체크
			try {
				file.createNewFile();	// 없다면, 파일을 생성
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave(Book[] bArr) {
		// 매개변수로 받은 bArr을 BookDAO(bd)의 fileSave()의 매개변수로 보냄 
		bd.fileSave(bArr);
	}
	
	public Book[] fileRead() {
		// bd에 fileRead()의 반환 값을 그대로 반환
		return bd.fileRead();
	}
}
