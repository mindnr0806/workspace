package com.kh.ch12_IO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StreamUtils {
		/*
		 * 보조 스트림 : 기반 스트립만으로 부족한 성능을 향상시켜주는 스트림
		 * 			기반 스트립에서 제공되는 메소드 외에 추가적인 메소드 제공(데이터 전송 속도를 향상)
		 * 
		 */
	//출력 : 프로그램 ---> 외부매채(파일)
	public void ObjectSave(String filename, Object[] Objs) {
		//FileOutputStream : 파일에 연결하여 1바이트 단위로 출력할 수 있는 기반 스트림
		//ObjectOutputStream : 객페 단위로 풀력할 수 있도록 도와주는 보조 스트림(ObjectWriter는 )
		
		//try ~ with ~ resource문
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)) ){
				
			for(Object o : Objs) {
				oos.writeObject(o); //객체 데이터를 출력하는 메소드
			
			}	
	}catch(IOException e) {
		System.out.println("객체 데이터를 파일에 저자 중 문제 발생|| :: " + e.getMessage());
		//e.printStackTrace():
	}
	}

//입력 : 외부 매채(파일) --> 프로그램 
public void ObjectRead(String filename) {
	try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
		while(true) {
			System.out.println(ois.readObject());
		}
	}catch(EOFException e) {
		
	}catch(IOException e) {
		System.out.println("객체 데이터를 읽어오는 중 문제 발생!! :: " + e.getMessage());
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	}
	
}
