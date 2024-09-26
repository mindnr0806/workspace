package com.kh.practice.test2;

public class Task2 extends Thread{
	
	public void run() {
		try {
		for(int i=1; i<30; i++) {
			if(i % 2==0) {
			System.out.println(Thread.currentThread().getName() + i);
			}
			
		}	
		//출력후 0.1초 재우기
		
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
