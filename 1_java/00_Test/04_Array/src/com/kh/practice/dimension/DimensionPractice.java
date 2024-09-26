package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	
	 public void practice1(){
		 //1. 3행 3열짜리 문자열 배열 선언 및 할당
		 	String[][] arr = new String[3][3];
		 //2.인덱스 0행 0열부터 2행 2열까지 차레대로 "(0,0)" 형식으로 값을 저장
	     // arr.length => 2차원 배열의 길이, 행의 길이
		 	for(int i=0; i<arr.length; i++) { // i= 행의 인덱스 사용
		 		
		 		// arr[i].length => 1차원 배열의 길이, 즉 열의 길이
				// String[] 는 문자열 데이터를담고있는 배열이다.
				for (int j = 1; j < arr[i].length; j++) { // 열의 인덱스로 사용
					// arr[i][j] 는 문자열 데이터다
					arr[i][j] = "(" + i + ", " + j + ")";
				}
			}
			// 3.저장된 값들을 출력
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}

		public void practice2() {
			// 4행 4열 장수형 배열 선언 및 할당
			int[][] numbers = new int[4][4];

			int value = 1;
			for (int i = 0; i < numbers.length; i++) { // 행의 인덱스
				for (int j = 0; j < numbers[i].length; j++) { // 열의 인덱스
					numbers[i][j] = value++;// 4 * i + (j+1)

				}

			}
			// 값을 출력
			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < numbers[i].length; j++) {
					System.out.printf("%-3d", numbers[i][j]);
				}
				System.out.println();
			}
		}

		public void practice4() {
			// 4행 4열 정수행 배열 선언 및 할당
			int[][] arr = new int[4][4];

			// 0행 0열부터는 3행 2얄까지는 1~18까지 임의의 정수 값 저장
			// 3행에는 각 열의 합을, 3열에는 각 행의 합, 3행 3열에는 가로 세로 합

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {

					int lastRow = arr.length - 1; // 마지막 행의 인덱스
					int lastCol = arr[i].length - 1; // 마지막 열의 인덱스

					// 랜덤값을 각 위치에 저장 (0.0 ~ 2.2)
					if (i != lastRow && j != lastCol) {
						arr[i][j] = (int) (Math.random() * 10 + 1);
					}

					// 마지막 행의 위치에 현재 값을 더하기
					if (i < lastRow) {
						arr[lastRow][j] += arr[i][j];
					}

					// 마지막 열의 위치에 현재 값을 더하기
					if (j < lastCol) {
						arr[i][lastCol] += arr[i][j];
					}
				}
			}
		}
		
		 public void practice5(){
			 Scanner sc = new Scanner(System.in);
			 
			 while(true) {
			 System.out.print("행의 크기 :");
			 int row = sc.nextInt();
			 
			 System.out.print("열의 크기 :");
			 int col = sc.nextInt();
			 
			 if (row < 1 || row > 10 || col <1 || col >10) {
				 System.out.print("받드시 1~10 사이의 정수를 입력해야 합니다.");
				 continue;
			 }
			 //입력받은 행크기, 열크기로 2차원 배열 선인 및 할당
			 int[][] chArr = new int[row][col];
			 
			 for(int i=0; i<row; i++)  {
				 for(int j=0; j<col; j++)  {
					 //65 ~90까지의 랜덤값 
					 //           => Math.random() * (최댓값 - 최솟값 +1) +최솟값
					 chArr[i][j] = (int)(Math.random() * (90 - 65 + 1)+ 65);		
				 }
			 }
			 
			 //출력
			 for(int i=0; i<row; i++)  {
				 for(int j=0; j<col; j++)  {
					 System.out.print((char)chArr[i][j] + " ");
				 }
				 System.out.println();
			 }
			break;
			 }
			
		 }

			public void practice7() {
				Scanner sc = new Scanner(System.in);

				System.out.print("행의 크기 : ");
				int row = sc.nextInt();

				// 열의 크기가 다른 2차원 배열 선입 및 할당
				int[][] arr = new int[row][];

				char value = 'a';
				for (int i = 0; i < row; i++) {
					System.out.print(i + "행의 열 크기 : ");
					int col = sc.nextInt();
					arr[i] = new int[col];

					// 각 행의 1차원 배열에 a부터 = 값을 대입?
					for (int j = 0; j < col; j++) {
						arr[i][j] = value++;

					}
				}
				// 배열 데이터 값 출력
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print((char) arr[i][j] + " ");
					}
					System.out.println();
				}
			}

			
			
			
		}
