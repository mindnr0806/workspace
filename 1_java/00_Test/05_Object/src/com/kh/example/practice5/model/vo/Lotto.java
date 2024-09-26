package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {

	//변수부
	private int[] lotto;
	//초기화 블럭
	{
		lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			//lotto 배열의 1번째 위치에 랜덤값(1~45)을 저장			
			lotto[i] = (int)(Math.random() * 45 +1);
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	}
	//생성자부
	public Lotto( ) {}
	
	//메시드부
	public void information() {
		//정보 출력 ==> 필드(변수)의 정보를 출력
		//Arrays.toString(배열명) : [값1, 값2, 값3, ...] 혈식 출력
		System.out.println(Arrays.toString(lotto));
		
		//향상된 
		System.out.println("==================");
		for(int num : lotto) {
			System.out.print(num + ", ");
		}
	}
}

