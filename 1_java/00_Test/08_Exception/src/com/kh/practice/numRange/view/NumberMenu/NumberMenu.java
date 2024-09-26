package com.kh.practice.numRange.view.NumberMenu;

import java.util.Scanner;
import com.kh.practice.numRange.controller.NumberController.NumberController;

public class NumberMenu {
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController cc =new NumberController();
		System.out.printf("정수1 : ");
		System.out.printf("정수2 : ");
		String str = sc.nextLine();
		
		int check = cc. checkDouble(str);
		System.out.printf("'%s' 은(는) '%s'의 배수인가 ? :  ");
	}

}
