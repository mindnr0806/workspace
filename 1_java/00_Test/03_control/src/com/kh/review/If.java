package com.kh.review;

public class If {
	/*
	 * 조건문 : 조건에 따라 프로그램 흐름을 제어하고자 할 때 사용
	 * - 조건식 을 통해서 참인지 거칫인지 판단하여 그에 해당하는 코드를 실행
	 *   *조건식의 결과 : true / salse
	 *   *연산자 : 비교연산자 (대소/동등), 논리연산자 (&&,||,..) 주로 사용
	 *   
	 *   - if/ switch
	 *   *if문
	 *   	
	 *   	if(조건식) {
	 *   		//조건식의 결과가 참일 때 실행할 코드
	 *   	} else if(조건식2){
	 *   		//	조건식의 결과가 거짓이고, 조건식2의 결과가 참일 때 실행할 코드
	 *   	}else {
	 *   		// 조건식의 결과가 거짓일 때 실해할 코드
	 *   	}
	 *   
	 *   	*switch문 
	 *   	
	 *   	switch(조건식=>비교대상) {
	 *   	case 값1: 
	 *   		//비교대상 == 값1 인 경우 실행코드;
	 *   		break;		//breakl // break를 만나면 switch문이 종료
	 *   	default:
	 *   	// 모든 case 값에 해당하지 않을 경우 실행코드
	 *    	}
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(String[] args) {
			char ch = sc.next().charAt(0);
		}
		//대문자인지 확인하는 코드 => 조건문을 사용
		String result;
		if(ch >= 'A' && ch <= 'Z') {
			result = "대문자";
		}else {
			result = "대문자 아님";
		}
		System.out.println(result);

	}

}
