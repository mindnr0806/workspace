package com.kh.example.practice4.model.vo;

public class Student {

	
	//변수부(월드부)
	private static int grade;  //학년
	private int classroom;	   //반
	private String name;	   //학생 이름
	private double height;	   //키
	private char gender;		//성별
	
	{
		grade = 1;
		classroom = 7;
		name = "홍길동";
		height = 170.0;
		gender = '남';
		
		System.out.println("## 초기화 블록 ##");
			
	}
	
	//생성자부
	
	public Student() {
	}
	public Student(String name) {
		this.name = name;
		
		System.out.println("## 기본 생성자 ##");
	}	
	

	//메소드부 
	public void information() {
		System.out.println(
				"grade=" + grade + ", classroom=" + classroom
				+", name=" +name + ", height=" + height 
				+", gender=" +gender
				);
	}
	public static int getGrade() {
		return grade;
	}
	public static void setGrade(int grade) {
		Student.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	

	

	
}
