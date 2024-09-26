package com.kh.review;

public class cast {
	/*
	 * 형변환 : 값의 자료형을 바꾼는 것.
	 * 
	 * *컴퓨터에서의 값 어리 규칙(형변환이 필요한 상황)
	 * 1) 대입 연산자: 왼쪽과 오른쪽이 같은 자료향이어야 함.
	 * 	=> 다른 자료형의 값을 대입하고자 한다면 형변환이 필수
	 * 
	 * 자료형 변수형 = (자료형)값;
	 * 
	 * 2) 같은 자료형끼리만 연산이 가능 
	 * 
	 * 결과값= 값1 + 값2 => 값1, 값2 모두 같은 자료형이어야 힘.
	 * 						결과값도 같은 자료형이어야 함
	 */
	public ststic void main(String)[] args) {
		outoCasting()
	}
	public static void autoCasting() {
		/*
		 * *자동 형변환 
		 * 	-값의 범위가 작은 자료형에서 큰 자료형으로 자동 형변환
		 */
		
		int i1 =12;
		double d1 = i1; 		//int
		
		int i2 = 15;
		double d2 = 3.3;
		
		double result = i2 + d2; //i2 => int -> double
								//			15 - 15.0
	}

	public static void forceCCasting( ) {
		// 강제형변환 : 큰 범위의 자료형에서 작은 범위의 자료형으로 변환이 필요할 때
		
		double d1 = 4.0;
		int i1 = 50;
		
		int result = (int)(i1 + d1);
		//강제형변환시 데이터 손실이 발생할 수 있음!
		int iNum = 290;
		byte bNum = (byte)iNum;  //byte 범위 : -129 ~ 127
		
		System.out.println("bNum의 값은 : " + bNum); // 출력값 34
		
	}
}
