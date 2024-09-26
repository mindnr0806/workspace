package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import com.kh.model.vo.User;

public class PlayController {

	private Scanner sc = new Scanner(System.in);
	private User user = new User("양민욱 ");
	

	public void game01() {
		int computerNum = (int)(Math.random() * 50 + 1);
		boolean isSuccess = false;
		
		for (int i = 1; i <= 6; i++) {
			System.out.print("1~50까지 숫자를 입력하세요: ");
			int userNum = sc.nextInt();
			if (userNum > computerNum) {
				System.out.println("Down, 더 낮은 숫자입니다.");
			} else if (userNum < computerNum) {
				System.out.println("UP, 더 높은 숫자입니다.");

			} else {

				System.out.println("일치합니다.");
				System.out.println(i + "번 안에 성공했습니다.");
				System.out.println("-----------------------");
				isSuccess = true;
				break;
			}

		}
		if (isSuccess == false) {
			System.out.println("실패");
		}
	}

	public void game02() {

	}

	public void game03() {
			
		        int[] com = new int[3];
		        
		        Random r = new Random();                          
		        com[0] = Math.abs(r.nextInt()%9)+1;
		        do {
		            com[1] = Math.abs(r.nextInt()%9)+1;
		        }while(com[0]==com[1]);
		        do {
		            com[2] = Math.abs(r.nextInt()%9)+1;
		        }while(com[0]==com[2] || com[1]==com[2]);
		        
		        System.out.println("답 : "+com[0]+","+com[1]+","+com[2]);       
		        
		        int cnt=1;                                           
		        System.out.println(cnt+" 번째 도전");
		        while(com[0]==com[1])
		        {
		         cnt++;
		        System.out.println(cnt+" 번째 도전 ");
		
		        }
		        System.out.println("정답!!");
	}
    static boolean playGame(int[] com) throws IOException
    {
        System.out.print("세자리 수 입력 : ");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));    // 세자리수 입력받기
        int user  = new Integer(in.readLine());
        int[] usr = new int[3];
        for(int i=2;i>=0;i--)
        {
            usr[i] = user%10;
            user = user/10;
        }
        int strike = 0;
        int ball = 0;
        for(int i=0;i<3;i++)            // 숫자 비교
        {
            for(int j=0;j<3;j++)
            {
                if(usr[i]==com[j])
                {
                    if(i==j)
                        strike++;
                    else
                        ball++;

	}
            }
        }
        if(strike==0 && ball==0)
            System.out.println("아웃");
        else
            System.out.println("스트라이크 = "+strike+" 볼 = "+ball);
        if(com[0]==usr[0] && com[1]==usr[1] && com[2]==usr[2])
            return false;
        else
            return true;
    }
}



