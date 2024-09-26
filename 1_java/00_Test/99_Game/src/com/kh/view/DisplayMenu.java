package com.kh.view;

public class DisplayMenu {
	
		private Scanner  = new Scanner(System.in);
		private PlayController = new PlayController();
		
		public void mainMenu() {
			System.out.println("======Console Game======");
			System.out.println("1. Up & Down");	//--> pc.game01();
			System.out.println("2. 가위바위보");	//--> pc.game02();
			System.out.println("3. 숫자 야구");	//--> pc.game03();
			System.out.println("9. 점수 조회");	//--> pc.getUserInfo();
			System.out.println("0. 게임 종료");
			System.out.println("========================");
			
			int menu = sc.nextInt();
			sc.nextLine();		
			
			switch(menu) {
			case 1:
				pc.game01();
				break;
			case 2:
				pc.game02();
				break;
			case 3:
				pc.game03();
				break;
			case 9:
				pc.getUserInfo();
				break;
			case 0:
				return;
			default:
				
		}
		

}
