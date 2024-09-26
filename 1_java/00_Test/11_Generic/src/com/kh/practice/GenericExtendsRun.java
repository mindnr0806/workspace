package com.kh.practice;

public class GenericExtendsRun {

	
	public static void main(String[] args) {
		
		print(12345);
		print(3.141592653);
		// print("Wow!!!"); //String 클래스는 Number 클래스를 상속받지 않음! Error!
		}

	//재네릭 메소드 정의 : Number 클래스의 상속받은 타입으로 받는 메소그
 	// 					전달된 값을 콘솔창에 출력하는 기능(print)
	
	public static <T extends Number> void print(T value) {
		System.out.println(value);
	}
	

}
