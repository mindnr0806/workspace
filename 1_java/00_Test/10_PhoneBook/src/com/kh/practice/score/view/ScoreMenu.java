package com.kh.practice.score.view;

import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {

	
		private Scanner sc = new Scanner(System.in);
		
		private ScoreController scr = new ScoreController();
		
		public void mainMenu() {
			System.out.println("1. 성적 저장");
			
			System.out.println("2. 성적 출력");
			
			System.out.println("9. 끝내기 ");
			
			System.out.println("메뉴 번호 : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				saveScore();
				return;
			case 2:
				readScore();
				return;
			case 9:
			System.out.println("프로그램을 종료합니다");
			return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				

			}
		}
	
		public void saveScore() {
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				int num = 0; 
				System.out.println("N번 째 학생 정보 기록");
				System.out.println("이름 : ");
				System.out.println("국어 점수 : "); 
				int ko = sc.nextInt();
				System.out.println("영어 점수 : ");
				int en = sc.nextInt();
				System.out.println("수학 점수 : ");				
				int math = sc.nextInt();
				
				int total =(int)(ko + en + math);
				System.out.println("총점 :" + (int)(ko + en + math));
				System.out.println("총점 :" + total);
				
				System.out.println("평균 :" + (int)(ko + en + math)/3);
				System.out.println("평균 :" + total/3);
				
				System.out.println("N 또는 n 이라고 입력하면 종료됩니다");
				System.out.print("내용 : ");
				String content = sc.nextLine();
				
				if (! content.equals("N 또는 n")) {
					
				}else {
					braek;
				}
			
				// ScoreController(scr)의 saveScore() 매개변수로 모두 넘겨 주고 
				 // 그 학생 점수의 합계와 평균도 함께 매개변수로 넣어줌 
				 // 그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 :  
				 // N이나 n을 입력하지 않으면 이름 및 점수를 받는 것을 반복함 
				 // N이나 n을 입력하면 사용자에게 받는 반복문을 나감 
			}
			
	
		}
		public void readScore() {
			
		}

}
