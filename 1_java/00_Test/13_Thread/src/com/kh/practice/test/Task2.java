package com.kh.practice.test;

//Thread 정의 방법2) Runnable 인터페이스 구현
public class Task2 implements Runnable{

	//이 Thread에서 실홍시킬 작업용 run()메소드에 재정의
	@Override
	public void run() {
		String hello = Thread.currentThread().getName();
		String name = Thread.currentThread().getName();
		System.out.println();
		
	}

		
	
	
	
}
