package com.kh.ch05_object;

public class Animal {
	//정보 은닉
	private String name;		// 이름
	private int age;			// 나이
	private char gender;		// 성별
	private String masterName;	// 주인 이름
	private String type;		// 종
	
	//생성자 : 기본생성자, 모든 필드를 매개변수로 갖는 생성자
	public Animal() {}
	
	public Animal(String name, int age, char gender, String masterName, String type) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.masterName=masterName;
		this.type=type;
		
	}
	
	//캡슐화
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	public String getMasterName() {
		return masterName;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	

	 
	 
}
