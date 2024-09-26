package com.kh.practice;

class DataClass02{
	//재네릭 메소드
	public <T> void test(Integer num) {
		T date; //메소드, 지역변수에 재네릭 적용(사용)
		
		date = (T)num; //형변환도 가능!
	}
	public <T> T test2(T date) {//재네릭을 반환타입, 매개변수 타입에 적용
		T t;
		t = date;
		return t;
	}
}
 Class DataClass02_1 <T> {
	
	public <k> void test(T date, K date2) {
}

 }
public class GenericMethodRun {

	public static void main(String[] args) {
		DataClass02 d1 = new DataClass02();
		
		d1.test(123456); //타입을 지정하지 않으면, T(타입매개변수) --> Object로 변환
		d1.<Double>test(777);  ///T --> Double
		
		
		d1.test2("Orange");  //재네릭 타입 자동으로 결정 T ----> String 
		d1.<Integer>test2(9999999);  //T ---> Integer
		//-----------------------
		DataClass02_1<String> d2 = new DataClass02_1<>();
		
		d2.<Integer>test("Test1", 100); //첫번째 매개변수타입은 객체 생성 시점에 정해짐!
		d2.<Dounble>test("Test2", 3.14);//두번째 매개변수타입은 메소드 호출 시점에 정해짐!
		d2.<String>test("Test3", "zzz");

	}

}
