package com.kh.ch11_api;

public class API03_Wrapper {
	/*
	 * Wrapper 클래스 
	 * -> 기본 자료형을 객체로 감싸는 클래스
	 * 
	 * 		기본자료형   <-----> Wrapper 클래스
	 * 		boolean             Moolean
	 * 		char				Character		
	 *		byte				Byte
	 * 		short				Short
	 * 		int					Integer
	 * 		long				Long
	 * 		float				Float
	 * 		double				Double
	 * 
	 * 	=>기본 자료형을 객체로 표현하는 경우
	 * 	-메소드 호출 시 => 매개변수가 기봏ㄴ자료형이 아닌 객체타입만 요구할때  
	 * 	-다형성을 적용하고자 할 때
	 * 
	 * 
	 */	

	public static void main(String[] args) {
		//Boxing : 기본 자료형 --> Wrapper 클래스 자료형
		int n1 = 16;
		int n2 = 26;
		
		//System.out.println(n1.equals(n2));
		
		//객체생성
		Integer i1 = new Integer(n1);
		Integer i2 = new Integer(n2);
		
		System.out.println(i1.equals(i2));	
		System.out.println(i1.compareTo(i2));
		//=> 0 : 길드 값,-1(음수) : 뒤쪽이 앞쪽보다 큰 값, 1(양수) : 앞쪽이 뒤쪽보다 큰 값
		
		Integer i3 = n1;  //AutoBoxing: 갹체 생성과정 없이 바로 대입하여 생성
		
		//"101" 이라는 값을 Integer 타입으로 바꾸고자 한다면...?
		Integer i4 = new Integer("101");		//"101" => 101
		System.out.println(i4);
		int n4 = Integer.parseInt("101");
		System.out.println(n4);

		
		//101이라는 값을 String 타입으로 바꾸고자 한다면..?
		String n101 = String.valueOf(101);
		System.out.println(n101);

	}

}
