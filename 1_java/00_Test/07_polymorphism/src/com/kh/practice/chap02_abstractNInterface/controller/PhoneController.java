package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	private String[] result = new String[2];
	
	/**
	 * Phone객체 배열의 각 인덱스에 GalaxyNote9, V40 객체 저장하고 
	 * 각 객체의 정보를 문자열 배열에 저장하여 
	 * 문자열 배열 주소를 반환하는 메소드
	 */
	public String[] method() {
		// 2개의 Phone 객체를 저장할 수 있는 객체배열 생성
		Phone[] phoneList = new Phone[2];
		// 각각의 인덱스에 다형성을 적용하여 GalaxyNote9, V40 객체 저장
		phoneList[0] = new GalaxyNote9();
		phoneList[1] = new V40();
		// for문을 이용하여 Phone 객체배열에 각 인덱스의 printInformation()의 반환 값을 
		// String배열에 담아 반환		
		int index = 0;		// result 배열에서 사용할 인덱스 값
		for(int i=0; i<phoneList.length; i++) {
			/*
				(instanceof 활용하기)
			이때 참조한 객체의 타입이 GalaxyNote9 경우 GalayNote9에 오버라이딩된 printInform() 호출,
			V40인 경우V40에 오버라이딩된 printInform() 호출
			 */
			if(phoneList[i] instanceof GalaxyNote9) {
				result[index++] = ((GalaxyNote9)phoneList[i]).printInformation();
			} else if (phoneList[i] instanceof V40) {
				result[index++] = ((V40)phoneList[i]).printInformation();
			}
		}
		
		return result;
	}
}
