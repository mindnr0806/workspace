package com.kh.practice;

interface Inter1<T>{
	void method1(T date);
}
interface Inter2<F>{
	void method2(F date);
}
class DataClass04<E> implements Inter1<E>, Inter2<E>{
	public String method1;
	


	//void method1(E date);
	public void method1(E date) {
		System.out.println(date);		
	}
	//void method2(E date);
	public void method2(E date) {
		System.out.println(date);		
	}
}

public class GenericImplRun {

	public static void main(String[] args) {
		//TODO : DataClass04 객체를 생성해서,
		//	"좋아하는 색은" ---> method1사용, "xxx다" ---> method2 사용
		
		DataClass04<String> d4 = new DataClass04<>();
		d4.method1("좋아하는 색은");
		d4.method2("검정색");
		
		DataClass04<Integer> d5 = new DataClass04<>();
	
		System.out.println();
		d5.method1(10000);		
		d5.method2(12345);

	}

}
