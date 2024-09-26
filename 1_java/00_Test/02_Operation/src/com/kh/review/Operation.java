package com.kh.review;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {

//		inDecrease();
		triple

	}

	public static void inDecrease() {
		/*
		 * 증강연산자 (단황연산자)
		 *  ++ : 변수에담긴 값을 1씩 증가시켜주는 연산자
		 *  	ex) ++변수 / 변수++
		 *  -- : 변수에 담긴 값을 1씩 감소시켜주는 연산자
		 *  	ex) --변수 / 변수--
		 *  * 증강 연사자 의에 다른 연산자도 있을 경우 처리 순서
		 *  전위연산 : 증감연산자를 먼저 처리한 후에 다른 연산을 수행
		 *  		(증감연산자)변수 : "선증감" 후처리
		 *  후위연산 : 다른 연산을 먼저 수행 한 후 증감연산자를 수행
		 *  		변수(증감연산자): 선처리 "후증감"
		 */
		int n1 = 10;
		System.out.println("전위 연산 적용 전 m1값 : " + n1);  //10
		System.out.println("1회 수행 결과 : " + ++n1); 	   //11
		System.out.println("2회 수행 결과 : " + ++n1); 	   
		System.out.println("3회 수행 결과 : " + ++n1); 
		System.out.println("최종 n1 : " + +n1); 
		
		System.out.println("-----------------"); 
		
		int n2 =10;
		System.out.println("후위 연산 적용 전 n2의 값 : " + n2); 
		System.out.println("1회 수행 결과 : " + n2++); 
		System.out.println("2회 수행 결과 : " + n2++); 
		System.out.println("3회 수행 결과 : " + n2++); 
		System.out.println("최종 n2 : " + n2); 
		
		System.out.println("-----------------");
		
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println(a++);
		System.out.println((++a) + (b++));
		System.out.println((a++) + (--b) + (--c));
		
		System.out.printf("a : %d, b : %d, c : %d\n", a, b, c);
		
		
	}
	public static void triple() {
		/*
		 * *삼향연산자 : 조건문(if)과 유사한 성격의 연산자
		 * 	[표현식]
		 * 		조건식 ? 조건식의 결과가 참인 경우 사용될 값 ; 조건식의 결과가 거짓인경우
		 * 
		 * ex) 입력받은 문자가 대문자인지 확인
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		
		// ch라는 변수에 값이 대문자인지 확인 'A' ~ 'Z' 사이의 값이면 "대문자"
		//									,그렇지않으면 "대문자 아님" 출력
		
	//	string resilt = ch>= 65 && ch <= 90 ? "대문자" : "대문자 아님";
		String result = ch >= 'A' && ch <= 'Z' ? "대문자" : "대문자 아님";
		System.out.println(result);
				
		
		
		
		
		
	}
	
}
