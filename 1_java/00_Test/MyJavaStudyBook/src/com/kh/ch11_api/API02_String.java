package com.kh.ch11_api;

import java.util.StringTokenizer;

public class API02_String {

	public static void main(String[] args) {
		System.out.println("====java.lang.String=====");

		String str = "Hello, World!";

		System.out.println(str);

		// 문자열.charAt(dlseprtm) : char
		// => 문자열에서 해당 인덱스 위치의 문자를 추ㅜㅊㄹ해서 반환
		System.out.println("인덱스 7본 위치의 문자 : " + str.charAt(7));
		char ch = str.charAt(7);
		System.out.println("ch : " + ch);

		// 문자열.concat(문자열) : String
		// =>문자열A이랑 전달된 문자열B을 합쳐서 새로운 문자열로 반환
		String str2 = str.concat("###");
		System.out.println("str2 : " + str2);

		String str3 = str + "###";
		System.out.println("str3 : " + str3);

		System.out.println("str2 == str3  ? " + (str2 == str3));
		// => 저장된 값은 동일이나 저장된 위치가 다으므로 false

		// 믄자열A.equals(문자열B) : boolean
		// => 문자열A와 문자열B에 저장된 값을 비교하여 같으면 TRUE, 다르면 FALSE를 반환
		System.out.println("str2.equals(str3) : " + (str2.equals(str3)));

		// 문자열.trim() : String
		// =>문자열의 앞, 뒤의 공백을 제거한후 새로운 문자열을 반환
		System.out.println("str.trim() : " + str.trim());
		String str4 = " JA V A ";
		System.out.println("str4.trim() : " + str4.trim());

		// 문자열 length()
		// => 문자열의 길이 반환
		System.out.println("문자열 길이 : " + str.length());

		// 문자열.toChatArray() : char[]
		// => 문자열을 문자형 배열로 반환
		char[] chArr = str.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			System.out.println(i + "번째 : " + chArr[i]);
		}

		// 문자열.toUpperCase() : String
		// => 문자열을 모두 대문자로 변환하여 반환
		// 문자열.toLowerCase() : String
		// => 문자열을 모두 소문자로 변환하여 반환
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		// --------------------------------
		String language = "Java,Otacle,HDBC,HTML,CSS,JS,Spring";

		// 1) 문자열. split(구분자) : String[]
		/*
		String[] lArr = language.split(",");
		System.out.println("lArr 배열의 길이 : " + lArr.length);

		for (String lang : lArr) {
			System.out.println(lang);

		}
		*/
		// 2)StringTokenizer 클래스 사용
		// java.util.StringTokenizer
		StringTokenizer st = new StringTokenizer(language, ",");
		
		/*
		System.out.println(st.countTokens() ); //토큰화된 개수
		
		for(int i=0; i<st.countTokens(); i++) {
		System.out.println(st.nextToken() );
		}
		System.out.println(st.nextToken() );
		*/
		
		//System.out.println(st.hasMoreTokens() );
		//토큰이 있는 지 여부를 확인하여 데이터를 조회
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken() );
		}
	}
}
