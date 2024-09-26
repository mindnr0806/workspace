package com.kh;

public class VariablePraction {

	public static void main(String[] atgs) {
		
		/*
		 * 예제 1) 변수를 사용하여 아래 코드를 이해하기 쉽도록 변경해보기.
		 * - 연도에 해당하는 값을 정수형(int) 다임의 year 이름의 변수로 선언
		 * -현재 연도를 year 변수에 대입
		 * 
		 * -나이에 해당하는 값을 정수형(int) 다입의 age 이름의 변수로 선언 및 대입
		 */
		// 변수를 사용하지 않은 경우
		System.out.println("[1} 현재 2024년이고, 올해 20살입니다.");
		
		// 변수 선언 및 대입
		int year;       // 정수형 변수 year이라는 이름으로 선언
		year = 2024;    // year 변수에 2024라는 값을 대입
		
		int age = 20;	// 정수형 변수 age라는 이름으로 선언 및 20이라는 값을 대입
		
		// 변수를 사용하여 화면에 출력 ( println / printf 사용)
		System.out.println("[2} 현재 " + year + "년이고, 올해" + age
											+ "살입니다.");
		System.out.printf("[3} 현재 %d년이고, 올해 %d살입니다.", year, age);
		
	    
		final int LIMIT_WEIGHT = 80;
		System.out.printf("몸무게가" + LIMIT_WEIGHT + "kg 이상인 경우 탐승을 못합니다.");
		// -------------------------------
		/*
		 * * 형변화  : 연산을 할 때 자료형의 종류가 다른 경우 형변환이  발샐한다.
		 *    - 자동형변환 규칙
		 *    [1] 값의 범위가 작은 범위에서 큰 범위로 형변환 발생
		 *    [2] 정수형과 실수형 연산 시엔는 정수형에서 실수형으로 형볂롼 발생		 
		 */
		int uum1 = 10;
		double dNum = 5.5;
		
		// num1 변수가 자동형변환이 발생 (int -> double)
		System.out.printf(uum1 + dNum1);   // rufrhk => 15.5
		
		// dNum1 변수를 강제형변환. (double -> int)
		System.out.printf(uum1 + (int)dNum1);  // 결과 => 15
		
		//char <--> int
		char ch = 'A';
		System.out.println(ch);  // 결과 => 'A'
		
		System.out.println((int)ch);  // 결과 => 65 
		
		System.out.println(ch + 3);    // 결과 => 'A' -> 65(자동형변환)
		                              //         65 + 3 => 68
		System.out.println((char)(ch+3));
		
	}
}
