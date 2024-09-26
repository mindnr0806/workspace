package com.kh.practice;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//직렬화 적용 : Sarializable 인터페이스 구현(상속)
class Student implements Serializable{
	String name;
	int age;
	double heigth;
	
	public Student(String name, int age, double heigth) {
		this.name = name;
		this.age = age;
		this.heigth = heigth;
	}
	
	public String toString() {
		return "Student[name="+name+", age="+age+", heigth="+heigth+"]";
	}
}

public class IO06_bjectOutputStream {

	public static void main(String[] args) {
		
		File f = new File("./resources", "objectTest.txt");
		
		ObjectOutputStream oos = null;
		
		try {
		oos = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(f)
						)
				);
		
		//출력 대상 객체(데이터)
		Student s1 = new Student("양준혁", 00, 174);
		Student s2 = new Student("이주원", 02, 170);
		Student s3 = new Student("최종균", 94, 180);
		
		//출력
		oos.writeObject(s1);
		oos.flush();
		
		oos.writeObject(s2);
		oos.writeObject(s3);
		oos.flush();
		
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		try {
			
			if(oos !=null) oos.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
}

