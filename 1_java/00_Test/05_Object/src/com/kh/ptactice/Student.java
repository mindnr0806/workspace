package com.kh.ptactice;

public class Student {
	
	int no;
	String name;
	int age;
	char gender;
	
	public Student(String name) {
		//이름을  저장할 name 변수에 전달된 값(name)을 대입(초기화)
		this.name = name;
	}
	
	public Student( ) {}

	//정보 조회
	public void inform() {
		System.out.println("[" + no +"]"
						+ name + ","+age+"," +gender);
		
	}
	public void setName(String n) {
		name = n;
	}
}
