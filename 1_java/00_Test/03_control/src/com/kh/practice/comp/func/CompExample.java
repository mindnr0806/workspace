package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	
		public void practice1(){ 		
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 : ");	
		int num = sc. nextInt(); 
		
		if(num<1) {
			System.out.println("양수가 아닙니다.");
		}else {
			
		}

			for(int i=1; i<num; i++) {				
				if(i % 2 == 0 ) {
				System.out.print("수");
			}else {
				System.out.print("박");
			}
		}
	}
		
		
	
}
