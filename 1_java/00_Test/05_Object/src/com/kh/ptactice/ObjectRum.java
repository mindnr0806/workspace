package com.kh.ptactice;

import com.kh.example.practice4.model.vo.Student;

public class ObjectRum {
	//자바 프로그램 실행 시 필요한 메소드 : main
	
	public static void main(String[] args) {
		//학생을 대상으로 프로그램을 해본다면...
		//"학생" 이라는 객체로 선정
		// 정보 -> 학번 이름 나이 성별
		// 기능 --> 정보 조회
		
		//변수를 사용하여 학생의 정보를 관리 한다면
		int no1 = 100;	
		String name1 = "양민욱";
		int age1 = 20;
		char gender1= '남';
		
		int no2 = 101;
		String name2 = "칸나";
		int age2 = 26;
		char gender2 = '여';
				
		int no3 = 102;
		String name3 = "히나";
		int age3 = 28;
		char gender3 = '여';
		// => 너무많은 변수사 사용되었다...
		//배열을 사용해보자(각 정보를 담을 배열)
		
		int[] noArr = {100, 101, 102};
		String[] nameArr = {"양민욱", "칸나", "히나"};
		int[] ageArr = {20,26,28};
		char[] genderArr = {'남', '여', '여'};
		/*
		noArr[0] = 100;
		nameArr[0] = "양민욱";
		ageArr[0] = 20;
		genderArr[0] = '남'
			*/
		
		//클래스를 사용해보자 (서로다른 종류의 데이터를 한공간에 )
		Student s1 = new Student();
		s1.no1 = 100;
		s1.name = "양민욱";
		s1.age = 20;
		s1.gendent = '남';
		
		Student s2 = new Student();
		s2.no2 = 101;
		s2.name = "칸나";
		
		Student s3 = new Student("윈터");
		s3.getName();
		
		s3.name = "원터2";
		
		
	}

}
