package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int n1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int n2 = sc.nextInt();
		
		// 더하기/빼기/곱하기/나누기몫 결과 출력
		System.out.println("더하기 결과 : " + (n1 + n2));
		System.out.println("빼기 결과 : " + (n1 - n2));
		System.out.println("곱하기 결과 : " + (n1 * n2));
		System.out.println("나누기 몫 결과 : " + (n1 / n2));
	}
}





