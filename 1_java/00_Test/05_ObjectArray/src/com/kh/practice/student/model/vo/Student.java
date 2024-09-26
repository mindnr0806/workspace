package com.kh.practice.student.model.vo;

//학생 정보를 담는 클래스
public class Student {
		//필드부(변수부)
	private String name;		// 이름
	private String subject;		// 과목
	private int score;			// 점수
	
	public Student() {}
	
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject =subject;
		this.score =score;
		
		
	}
	//메소드부
	public String inform() {
		//이름 : 홍길동 / 과목 : 자바 /점수 : 100
//		String info = "이름 : " + name + " / 과목 : " + subject + " / 점수 : " + score;
		return String.format("이름 : %s / 과목 : %s / 점수 : %d",
									name, subject, score); 
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	

}
