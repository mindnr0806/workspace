package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			sb.append(token);
		}
		return sb.toString();
	}
			
	public String firstCap(String input) {
		String subStr = input.substring(0,1);
		return subStr.toUpperCase() + input.substring(1);
		
	
	}
	
	public int findChar(String input, char one){
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}

	

}
