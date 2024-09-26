package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		java.util.Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		// 메뉴 1을 선택했을 때, -> menu 변수의 값이 1과 같다면
		if (menu == 1) {
			System.out.println("입력 메뉴입니다.");
		} // 메뉴 2를 선택했을 때, => menu 변수의 값이 2과 같다면
		else if (menu == 2) {
			System.out.println("수정 메뉴입니다.");
		} // 메뉴 3를 선택했을 때, => menu 변수의 값이 3과 같다면
		else if (menu == 3) {		
		}// 메뉴 4를 선택했을 때, => menu 변수의 값이 4과 같다면
		else if (menu == 4) {
		}// 메뉴 7를 선택했을 때, => menu 변수의 값이 7과 같다면
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();
		
		//입력 받은 값 (num 변수)이 양수인지
		if(num > 0) {
			
			//일력받은 값이 짝수인지
		if(num %2 == 0) {
		    System.out.println("짝수다");
		} else  {	//홀수인 겨우
		   System.out.println("홀수다") ;
		}
		
		}else {//그렇지 않으며 (0, 음수)
			System.out.println("양수만 입력해주세요.");
		}

	}

		 public void practice3(){
		
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어점수 : ");
			int ko = sc.nextInt();
			
			System.out.print("영어점수 : ");
			int en = sc.nextInt();
			
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			
			//합격 조건 : 세 과목의 점수가 가가 40전 이상이고, 평균이 60점 이상일 경우
			if (ko >= 40 && math >= 40 && en >= 40) {
				
				int total = ko + math + en;
				double avg = total / 3;
				
				if (avg >= 60) {
					System.out.print("국어 : " + ko);
					System.out.print("영어 : " + math);
					System.out.print("수학 : " + en);
					System.out.print("합계 : " + total);
					System.out.print("평균 " + avg);
					System.out.print("축하합니다, 합격입니다!");
				}else {
					System.out.print("불합격입니다.");
				}
				
			} else {
				// 세 과목 중 한 괴목이라도 40점 이상인 아닌 경우
				 System.out.println("불합격 입니다.");	
			}
			
	}
		 public void practice4(){
			 Scanner sc = new Scanner(System.in);
			 System.out.print("1 ~ 12 사이의 정수 입력 : ");
			 int month = sc .nextInt();
			 
			 //1 ~ 12 사이의 값인지 체크
			 if(month >= 1 && month <= 12) {
				 String season = "";
				 switch(month) {
			 case 1:
			 case 2:
			 case 12:
			 	season = "겨울";
			 	break; 
			 case 3:
			 case 4:
			 case 5:
				 season = "봄";
				 break; 
			 case 6:
			 case 7:
			 case 8:
				 season = "여름";
				 break;
			 case 9:
			 case 10:
			 case 11:
				 season = "가을";
				 break;
				 default:
				 	season = "해당하는 계절이 없습니다.";
		     }	 	
			 System.out.println(month + "월은" + season + "입니다.");
		} else {   // 1~12 사이의 값이 아니 경우
			 System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		 }
		 
	
		 public void practice5(){
			 Scanner sc = new Scanner(System.in);
			
			 System.out.print("아이디 : ");
			 String id = sc .nextLine();
			
			 
			 System.out.print("비밀번호 : ");
			 String pwd = sc.nextLine();
			 
			 //입력한 아이디 값이 "myid", 입력된 비밀번호 값이 "myPassword12" 인 경우 => 로그인 성공
			 if(id.equals("myid") && pwd.equals("myPassword12")) {
				 System.out.println("로그인 성공");
			 } else if (id.equals("myid")) { // 입력된 아이디 값이 "myid"가 아닌 경우
				 System.out.println("아이디가 틀렸습니다.");
			 }	else {
				 System.out.println("비밃번호가 틀렸습니다.");
				 
			 }
			
		 }
		 
		 public void practice6(){
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.print("권한을 확인하고자 하는 회원 등급 : ");
			 String grade = sc.next();
			 
			 /*
			  * 관리자 : 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성
			  * 횡원 : 게시글 작성, 게시글 조회, 댓글 작성,]
			  * 비회원 : 게시글 조회
			  */
			 if(grade.equals("관리자")) {
			  System.out.print("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			} else if (grade.equals("회원")) {
			  System.out.print("게시글 작성, 게시글 조회, 댓글 작성");
			} else if (grade.equals("비회원")) {
			  System.out.print("게시글 조회 : ");
			} else { 
			  System.out.print("알 수 없습니다.");
		 }
			 
	 } 

		 
		 public void practice7(){
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.print("키(m)를 입력해주세요 : ");
			 double h = sc.nextDouble();
			 
			 System.out.print("몸무게(kg)를 입력해주세요 : ");
			 double w = sc.nextDouble();
			 
			 double bmi = w / (h * h);
			 
			System.out.print("BMI 지수 : " + bmi);
			
			if (bmi < 18.5) {
				System.out.print("저체중");
			}else if (bmi >= 18.5 && bmi <23) {
				System.out.print("정상체중");
			}else if (bmi >= 23 && bmi <25) {
				System.out.print("과체중");
			}else if (bmi >= 25 && bmi <30) {
				System.out.print("비만");
			}else  {
				System.out.print("고도비만");
			 }
		 
				  
		 }

		 public void practice8(){
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.print("피연산자1 입력 : ");
			 int num1 = sc.nextInt();
			 
			 System.out.print("피연산자2 입력 : ");
			 int num2 = sc.nextInt();
		 
			 System.out.print("연산자를 입력(+,-,*,/,%) : ");
			 String op = sc.next();
			 
			 if (num1 > 0 && num2 >0) {          // 두 정수가 모두 양수일 때
				 
				 switch(op) {
				 case "+": // op.eqials("+") => true
					 System.out.printf("%d %s %d = %d", num1, op, num2, (num1 + num2));
					 break;
				 case "-": // op.eqials("-") => true
					 System.out.printf("%d %s %d = %d", num1, op, num2, (num1 - num2));
					 break;
				 case "*": // op.eqials("*") => true
					 System.out.printf("%d %s %d = %d", num1, op, num2, (num1 * num2));
					 break;
				 case "/": // op.eqials("/") => true	 
					 System.out.printf("%d %s %d = %f", num1, op, num2, ((double)num1 / num2));
					 break;
				 case "%": // op.eqials("%") => true
				 	System.out.printf("%d %s %d = %f", num1, op, num2, (double)num1 % num2);
				 	break;
				 	default:
				 		System.out.printf("잘못 입력하셨습니다. 프로그램을 종료합니다."); 
				 }
				 	
				 } else {                               // 두 정수 중 하나라도 양수가 아닐 때
				 		System.out.printf("잘못 입력하셨습니다. 프로그램을 종료합니다."); 
				 }
			 }
		

		 	public void practice9(){
		 		Scanner sc = new Scanner(System.in);
		 		
		 		System.out.print("중간고사 점수 ; ");
		 		int mid = sc.nextInt();
		 		
		 		System.out.print("기말고사 점수 ; ");
		 		int fin = sc.nextInt();
		 		
		 		System.out.print("과제 점수  ; ");
		 		int hw = sc.nextInt();
		 		
		 		System.out.print("풀석 화수 : ");
		 		int at = sc.nextInt();
		 		
		 		System.out.println("============= 결과 ============= ");
		 		double midP = mid * 0.2;
		 		double finP = fin * 0.3;
		 		double hwP = hw * 0.3;
		 		double atP = at;
		 		
		 		double total  = midP + finP + hwP + atP;
		 		
		 		//전체 강의의 30% 이상 결석 => 70% 초과 출석 시 통과
		 		int passAt = (int)(20 * 0.7);
		 		if (passAt > at) {		// 14 >= at
		 			System.out.print("Fail [출석 회수 부족 (" +  at + "/20)]");
		 		}else {
					System.out.println("중간 고사 점수(20) : " + midP);
					System.out.println("기말 고사 점수(30) : " + finP);
					System.out.println("과제 점수(30) : " + hwP);
					System.out.println("출석 점수(20) : " + total);
					System.out.println("총점 : "+  total);
					

					if (total >= 70) {
						System.out.println("pass");
					} else {
						System.out.println("Fall [점수 미달]");
					}
		 		
		 			
		 		}
		 		
		 		

		 	
		 	}



}
		 




