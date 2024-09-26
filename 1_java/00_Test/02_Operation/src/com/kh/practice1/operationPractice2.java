package com.kh.practice1;

import java.util.Scanner;

public class operationPractice2 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
	    double w = sc.nextDouble();
	    
	    System.out.print("세로 : ");
	    double h = sc.nextDouble();
	    
	    // 면적 : 가로 * 세로 
	    // 둘레 : (가로 + 세로) * 2
	  
	    System.out.printf("면적 : %.2f\n", w*h);
	    System.out.printf("둘레 : %.1f", w+h*2);
	    
	    
	    
	}

}
