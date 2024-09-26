package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		//1 길이가 10인 배열 선언 (1부터 10까지의 값을 저장 => int)
		int[] arr = new int[10];
		//2. 반복문을 사용하여 배열 인덱스에 그 값을 저장
		/*
		for(int i=1; i<=10; i++) {
			//인덱스 시작번호 : 0
			arr[i-1 = i;]		//arr 배열의 i-1 위치에 i값을 저장
		}
		*/
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
		}
		//3. 반복문을 사용하여 각 인덱스의 값을 출력
		for(int i=0; i<10; i++) {
			
			System.out.print(arr[i]);
		if(i != 9) {
			System.out.print(" ");
		}
			
		}	
		
		
	}
	public void practice2(){
		int[] arr = new int[10];
		
		//값을 저장
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length -i;
			//System.out.print("i=%d");
		}
		
		//출력
		//배열명.length : 배열의 길이
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length-1) {
				System.out.print(" ");
					}
				}
	}
	
	public void practice3(){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("양의 정수 : ");
	int num = sc.nextInt();
	
	//입력받은 정수값의 길이만큼 배열을 생성
	// * 자료형[] 변수명 =new 자료형[배열길이];
	int[] arr = new int[num];
	
	for(int i=0; i<num; i++) {
		arr[i] = i+1;
	}
	for(int i=0; i<num; i++) {
		System.out.print(arr[i]);
		
		if (i != num-1) {
					System.out.print(" ");
				}
			
}
}
	
	 public void practice4(){
		 //문자열 배열
		 String[] strArr = new 	String[] {"사과", "귤", "포도", "복숭아", "참외"};
		 
		 //"귤" 출력
		 System.out.println(strArr[1]);
	 }
	
	 public void practice5(){
		 Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열 : ");
			String str = sc.next();
			
			System.out.print("문자 : ");
			char ch = sc.next().charAt(0);
			
			//문자열의 길이 : 문자열_변수/값.length()
			//배열 길이 : 문자열_변수/값.length
			char[] arrCh = new char[str.length()];
			//입력받은 문자열을 배열레 문자 하나하나 저장 => 문자열 배열
			for(int i=0; i<arrCh.length; i++) {
				arrCh[i] = str.charAt(i);
			}
		
			System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
			int cnt = 0;
			for(int i=0; i<arrCh.length; i++) {
			if (arrCh[i] == ch) {
				cnt++;
				System.out.print(i + " ");
			}
		}
			System.out.println();
			System.out.println(ch + "의 개수 : " + cnt);
			}
	 
	 public void practice6(){
		 //문자열 배열에 "월" ~"일" 까지 초기화
		 String[] days = {"월", "화", "수", "목", "금", "토", "일"};
		 
		 
		 //0부터 6까지 입력하기
		 Scanner sc = new Scanner(System.in);
		 System.out.print("0 ~ 6 사이 숫자 입력 : ");
		 int num = sc.nextInt();
		 
		 //0부터 6까지의 범위의 숫자가 아닌 경우 "잘못 입력하셨습니다"를 출력
		 if (num < 0 || num > 6) { 
			 System.out.print("잘못 입력하셨습니다.");
		 }else {
			 System.out.println(days[num] + "요일");
		 }
		 //0부터 6까지의 범위의 숫자인 경우만 요일을 출력
		 if (num < 0 && num < days.length) {
			 System.out.println(days[num] + "요일");
		 }else {
			 System.out.print("잘못 입력하셨습니다.");
		 }
	 
	 }
	 
	 
	 public void practice7(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("정수 : ");
		 int n = sc.nextInt();
		  //정수형 배열 선언 및 생성 (배열길이: 입력받은 정수 값)
		 int[] arr = new int[n]; 
		 
		 for(int i=0; i<arr.length; i++) {
			 // i: 0. 1, 2, n-1 
			 System.out.print("배열 " + i + "번째 인덱승네 넣을 값 : ");
			 arr[i] = sc.nextInt(); //arr 배열의 i번째 위치에 입력된 값을 대입		 }
		 }
		  int total = 0;
		  for(int i=0; i<arr.length; i++) {
			  System.out.print(arr[i] + " ");
			  total += arr[i];  //total = total + arr[i];
			  
		  }
	
		  System.out.println("\n총 합 : " + total);
		
	 }

		public void practice8(){
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) {
		 System.out.print("정수 : ");
		 int num = sc.nextInt();
		 
		 //3이상인 홀수
		 if (num >= 3 && num % 2 != 0) {
			 //입력 받은 정수 길이만틈 정수형 배열 선언 및 할당
			 int[] arr = new int[num];
			 
			 int value = 1; //배열에 저장할 값
			 for(int i=0; i<num; i++) {
				 
				 if(i < num / 2) {
				 arr[i] = value++;  //중간 위치까지는 증가
				 }else {
				 arr[i] = value--;  // 중간 위차부터 감소
				}
			 }
			 
			 //배열의 데이터 출력
			 for (int i=0; i<arr.length; i++) {
				 if(i < arr.length - 1) { // 배열의 마지막위치-1 까지는, 포힘히여
				 System.out.print(arr[i] + ",");
			 }else {
				 System.out.print(arr[i]);
			 }
		 }
			 break;
	 	 }else {
	 		System.out.println("다시 입력하세요. ");
	 	 }
		}
	 }
		
		
		 public void practice9(){
			 String[] ck = new String[]{"후라이드", "양념", "블랙올리오", "허니콤보", "갈비"};
			 
			 Scanner sc = new Scanner(System.in);
			 System.out.print("치킨 이름을 입력하세요 : ");
			 String name = sc.next();
			
			int count=0;
			for(int i=0; i<ck.length; i++) {
				if (ck[i].equals(name)) {
					count++;
				}
			}
				if (count > 0) {				
					System.out.println(name + "치킨 배달 가능");
				}else {
					System.out.println(name + "치킨은 없는 메뉴입니다.");
			
			
		 }	

		 }
		 
		 
		 public void practice10(){
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.print("주민등록번호(-포함) :");
			 String ssn = sc.next();
			 
			 //문자열의 문자 하나하나를 문자형 배열로생성 후 값을 저장
			 // -문자형 배열 선언 및 할당 (문자열 길이만큼)
			 char[] origin = new char[ssn.length()];
			// - 반복문을 사용하여 문자열 처음 위치부터 마지막 위치까지의 문자를 배열에 저장
			 for(int i=0; i<origin.length; i++) {
				 
				 origin[i] = ssn.charAt(i); 
			}
				 
				 //원복 배열 값의 변경 없이 복사 -> 깊은 복사
				 char[] copy = new char[origin.length];
				 for(int i=0; i<copy.length; i++) {
					 if (i <= 7) {						 				 
						 copy[i] = origin[i];  //인덱스 7번 위치까지
					 }else {
						 copy[i] = '*'; 
					 }
				 		 
		 }
				 //복사본 배열의 값을 출력
				 for(int i=0; i<copy.length; i++) {
					 System.out.print(copy[i]);
				 }
			 }
			
		 public void practice13(){
			 //길이가 10인 정수형 배열을 선언 및 할당
			int[] numbers = new int[10];
			
			for(int i=0; i<numbers.length; i++) {
				// 1~10까지의 랜덤값 저장
				numbers[i]  = (int)(Math.random() * 10 + 1); //Math.random : 랜덤값
				
				//i~1 (현재 위치의 직전 위치)까지 중복값이 있는지 확인
				for(int j=0; j<i; j++)
					//i번째 위치의 값과 j번째 위치의 값을 비교
					// 같으면 다시 랜덤값을 저장 --> 현재 위치의 값을 다시 저장할 수 있도록..
					if(numbers[i] == numbers[j]) {
						i--;
						break;
					}
				}
					
			//배열의 데이터 출력
			for(int i=0; i<numbers.length; i++) {
				System.out.print(numbers[i] + " ");
			}
		 }

			public void practice11() {
				String[] days = {"월", "화", "수", "목", "금", "토", "일"};
				
				Scanner sc = new Scanner(System.in);
				System.out.print("0 ~ 6 사이 숫자 입력 : ");
				int num = sc.nextInt();
				
				if (num<0 || num > 6) {
					System.out.println("잘못 입력하셨습니다.");
				}else {
					System.out.println(days[num] + "요일");
				}
		
			}

		}
