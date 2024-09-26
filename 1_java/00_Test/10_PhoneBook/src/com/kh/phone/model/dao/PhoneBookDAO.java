package com.kh.phone.model.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.phone.model.vo.PhoneBook;

public class PhoneBookDAO {
	private String filename = "myPhoneBook.txt";
	private final int MAX_COUNT = 20;
	
	public PhoneBookDAO() {
		File f = new File(filename);
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public PhoneBook[] searchPhone() {
		PhoneBook[] pList = new PhoneBook[MAX_COUNT];
		// 저장된 연락처 정보들을 읽어오기!
		try (ObjectInputStream stream = new ObjectInputStream(
											new FileInputStream(filename))) {
			
			for(int i=0; i<MAX_COUNT; i++) {
				
				PhoneBook phone = (PhoneBook)stream.readObject();
				pList[i] = phone;
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {	// readObject 실행 시 더이상 읽을 정보가 없을 경우 발생되는 예외!
			System.out.println("<<<연락처 조회 완료>>>");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return pList;
	}
	
	public void savePhone(PhoneBook[] pList) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(
											new FileOutputStream(filename)
											)) {
			for(int i=0; i<pList.length; i++) {
				if (pList[i] != null) {
					oos.writeObject(pList[i]);
				}
			}
		} catch (IOException e) {	// FileNotFoundException 예외처리가 포함됨 
			e.printStackTrace();			
		}
		
	}
}



