package com.kh.ch04_arrY;

public class ArrayRun {

	public static void main(String[] args) {
		/*
		 	-변수 : 하나의 공간에 하나의 값을 저장
		 	-배열 : 하나의 공간에 여러 개의 값을 저장(간, 같은 자료형의 값만 저장)
		 	
		 		*선언
		 				자료형[] 참조변수명(배열이름);
		 		*할당
		 				배열이름 = new 자료형[배열크기]; (배열 크기 >= 0)
		 				
		 		*선언과 동시에 할당
		 				자료형[] 배열이름 = new 자료형[배열크기];\
		 		*값을 대입
		 				배열이름[인덱스] = 값;
		 		
		 				*선언, 할당, 초기화 동시에 처리
		 						자료형[] 배열이름 = new 자료형[]{값, 값,값..};
		 						
		 						자료형[] 배열이름 = {값, 값,값..};
		 				
		 		-일반 변수 : 실제 리터럴(값 자체)를 담을 수 있는 변수
		 		=>기본 자료형(boolean, char, byte, int, float,.......)
		 		
		 		
		 		-참조 변수 (래퍼런스 변수) : 주소값을 담고 있는 변수
		 		=>그 외 자료형 (int[], double[], char[], ... String,Scanner,....)으로 선언된 변수
		 						
		 */
		int[] iArr = new int[3];	//인덱스 범위 : 0 ,1,2
		
		for(int i=0; i<iArr.length; i++)
			System.out.println(iArr[i]);
		System.out.println("--------------------------");
		double[] dArr = new double[5]; //인덱스 범위 " 0 1 2 3 4

		for(int i=0; i<dArr.length; i++)
			System.out.println(dArr[i]);
		//=> 초기화를 하지 않아도 기본 값이 저장됨 --> Heap 공간에는 빈 공간을 두지 않는다.
		//										따라서. JMV이 기본 값으로 초기화해준다. 

		//10개의 데이터를 저장하는 배열 생성 후 랜덤값(1~100)을저장
		//			"arr[i] : x" 형식으로ㅓ 출력
		int[] arr = new int[10];  //인덱스 범위 : 0 1 2...9
		for(int i=0; i<arr.length; i++) {  
			arr[i] = (int)(Math.random() * 100+1);
			
			//System.out.println("arr[" + i + "] : " + arr[i]);
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		
		
		
		
		
		}
	}


