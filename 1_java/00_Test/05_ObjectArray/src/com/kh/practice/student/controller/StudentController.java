package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	// 필드부
	private Student[] sArr = new Student[7];

	// + CUT_LINE : int = 60 ( 밑줄 )
	public static final int CUT_LINE = 60;

	// 생성자
	public StudentController() {
	sArr[0] = new Student("강지", "자바", 100);
	sArr[1] = new Student("칸나", "디비", 90);
	sArr[2] = new Student("유니", "자바", 50);
	sArr[3] = new Student("히나", "화면", 70);
	sArr[4] = new Student("리제", "자바", 60);
	sArr[5] = new Student("타비", "자바", 80);
	sArr[6] = new Student("마시로", "자바", 55);
	

	// 메소드
	/*
	Student[] sArr = {
			new Student("강지", "자바", 100),
			new Student("칸나", "디바", 90),
			 new Student("유니", "자바", 50),
			 new Student("히나", "자바", 70),
			 new Student("리제", "자바", 60),
	};
	sArr = init;
	*/
	}
	//메소드
	//getter의 역할을 하는 메소드
	public Student[] printStudent() {
		return sArr;

	}
	
	public int sumScore() {
		//객체 배열의 점수의 합을 반환
		//Student 클래스에 점수를 저장하는 변수; Score
		int total = 0;
		
		//방법1
		for(int i=0; i<sArr.length; i++) {
			total += sArr[i].getScore();
		}
		return total;
	
		//방법2 : 향상된 for문
		/*
		int t2 =0;
		for(Student s : sArr) {
			t2 += s.getScore();
	}
	*/
	
}
	public double[] avgScore() {
		//1. double 배열을 만들기
		double[] avg = new double[2];
		//2. sumScore의 리턴 값을 0번째 인덱스에 저장
		int total = sumScore();
		avg[0] = total;
		//3. 합의 평균을 1번째 인덱스에 저장
		//	 평균= 총합 / 총개수;
		avg[1] = total / sArr.length;
		//4. 배열 리턴
		return avg;
		
	}

}
