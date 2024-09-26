package com.kh.practice1;

import java.util.Scanner;

public class Varblepractlce2 {
	public static void main(String[] args) {
		
		// "문자열을 입력하세요 : " 출력
		System.out.print("문자열을 입력하세요 : ");
		// 사용자로부터 문자열로 입력을 받는다. => Scanner
		Scanner sc = new Scanner(System.in);
		
		//문자열을 입력받아주는 메소드 : next(), nextline()
		String str = sc.nextLine();
		
		//String 기능 중 문자 하나씩 꺼내오는 메소드 : charAT(위치값)
		System.out.println("첫 번째 문자 :" + str.charAt(0));
		System.out.println("두 번째 문자 :" + str.charAt(1));
		System.out.println("세 번째 문자 :" + str.charAt(2));
    }

}
