package com.kh.practice1;

// Scanner 클래스 import : 외부 경로의 클래스를 사용할 때 선언
import java.util.Scanner;

public class VariablePractice1 {
	// Q. 이름, 성별, 나이, 키를 사용자에게 입력받아
	//	  각각의 값을 변수에 담고 출력하세요.
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// "이름을 입력하세요 : " 값을 출력
		//  * 줄바꿈 처리하지 않기 위해 print 메소드 사용
		System.out.print("이름을 입력하세요 : ");
		
		// Scanner 객체를 사용하여 문자열을 입력받고,
		//  문자열 타입의 name이라는 변수에 값을 저장
		String name = sc.nextLine();
		
		// "이름은 xxx입니다." 출력
		// System.out.println("이름은 " + name + "입니다.");
		// --------------
		// "성별을 입력하세요(남/여) : " 출력
		System.out.print("성별을 입력하세요(남/여) : ");
		// 사용자가 입력한 문자열을 String타입의 gender라는 이름을 가진 변수에 저장
		String gender = sc.next();
		
		// --------------
		// "나이를 입력하세요 : " 출력
		System.out.print("나이를 입력하세요 : ");
		// 사용자가 입력한 나이(정수형)를 int 타입의 age라는 이름을 가진 변수에 저장
		int age = sc.nextInt();
		// --------------
		// "키를 입력하세요(cm) : " 출력
		System.out.print("키를 입력하세요(cm) : ");
		// 사용자가 입력한 키(실수형)를 double 타입의 height라는 이름을 가진 변수에 저장
		double height = sc.nextDouble();
		// --------------
		
		// "키 x.xcm인 x살 x자 xxx님 반갑습니다^^" 출력
		System.out.println("키 " + height + "cm인 " + age 
								+ "살 " + gender + "자 " 
								+ name + "님 반갑습니다^^");
		
		System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다^^\n",
								height, age, gender, name);
		System.out.println("@@@@@");
		
	}
}


