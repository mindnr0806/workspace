package com.kh.practice;

class Parent<T>{
	T date;
}

class Child1 extends Parent {
	
}

class Chil2 extends Parent<String> {
	
}

class Chil3<K> extends Parent<K>{
	
}

class Chil4<M, N> extends Parent<M>{
	N date;
	//M date;

	public void set(String string, int i) {
		// TODO Auto-generated method stub
		
	}
}

public class GenericInheritRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Chil3 클래스 객체를 생성하여 date 변수에 "안녕하세요" 라는 값을 저장
		
		Chil3<String> c3 = new Chil3<>();
		c3.date = "안녕하세요";
		
		System.out.println(c3.date);
		
		//Chil4 클래스 객체를 생성하여 "이름", 나이(정수) 두가지 데이터를 저장
		
		
			Chil4<String, Integer> c4 = new Chil4<>();
				 c4.data = "양민욱";
				 c4.data2 = 25;
				
			}
			
			
		
	}


