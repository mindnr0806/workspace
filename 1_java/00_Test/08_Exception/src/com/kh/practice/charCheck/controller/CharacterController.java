package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exceptionCharCheckException.CharCheckException;

public class CharacterController {

	public CharacterController() {}
	
	public int countAlpha(String s) throws CharCheckException{
		int count = 0 ;
		for(int i=0; i<s.length(); i++) {
		if(('a' <=	s.charAt(i) && s.charAt(i) <= 'z')
				||('A' <= s.charAt(i) && s.charAt(i) <= 'Z')) {
			count++;
		}
		if(s.charAt(i) ==' ') {
			System.out.println(i + "번째 문자는 공백입니다." );
		}
		}
		
		return count;
		
	
	}
}
