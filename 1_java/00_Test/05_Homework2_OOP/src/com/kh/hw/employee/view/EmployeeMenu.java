package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;
import com.kh.hw.employee.model.vo.Employee;

public class EmployeeMenu {

	// 필드부
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	// 기본 생성자
	public EmployeeMenu() {

		// 1. 사원 추가 ==> insertEmp()
		// 2. 사원 수정 ==> updateEmp()
		// 3. 사원 삭제 ==> deleteEmp()
		// 4. 사원 출력 ==> printEmp()
		// 9. 프로그램 종료 ==> “프로그램을 종료합니다.” 출력 후 프로그램 종료
		// 메뉴 번호를 누르세요 :
		// 번호를 잘못 입력했으면 잘못 입력했다는 안내가 뜸
		while (true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				insertEmp();
				break; // 조건문(switch) 종료
			case 2:
				updateEmp();
				break;
			case 3:
				deleteEmp();
				break;
			case 4:
				printEmp();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
	}

	// 메소드부
	// 1. 사원 추가 메뉴
	public void insertEmp() {
		// 사원 번호 :  
		// 사원 이름 :  
		// 사원 성별 :  
		// 전화 번호 :  
		// 추가 정보를 더 입력하시겠습니까?(y/n) :  
		// 추가적인 정보를 더 입력한다고 했을 시(y 또는 Y) 
		// 사원부서, 사원 연봉, 보너스 율을 추가로 더 받고 
		// 모든 데이터를 EmployeeController의 add메소드 인자로 보냄 
		// 추가정보를 입력하지 않겠다고 하면 기본정보만 add메소드 인자로 보냄
		System.out.print("사원 번호 : ");
		int no = sc.nextInt();
		
		sc.nextLine();		// 단순 호출로 버퍼에 \n 제거
		
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("사원 성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("전화 번호 : ");
		String phone = sc.next();
		
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		// char yn = sc.next().charAt(0);
		String yn = sc.next();
		
		// if (yn == 'y' || yn == 'Y') {
		// if (yn.equals("y") || yn.equals("Y")) {
		if (yn.toUpperCase().equals("Y")) {
			// 문자열.toUpperCase() : 문자열의 값을 모두 대문자로 변경
			// ex) yn = "yEs"; --> yn = "YES";
			// 문자열.toLowerCase() : 문자열의 값을 모두 소문자로 변경
			System.out.print("사원 부서 : ");
			String dept = sc.next();
			
			System.out.print("사원 연봉 : ");
			int salary = sc.nextInt();
			
			System.out.print("보너스 율 : ");
			double bonus = sc.nextDouble();
			
			ec.add(no, name, gender, phone, dept, salary, bonus);
		} else {
			// 기본 정보만으로 사원 추가
			ec.add(no, name, gender, phone);
		}
	}

	public void updateEmp() {
		// 가장 최신의 사원 정보를 수정하게 됩니다. 
		// 사원의 어떤 정보를 수정하시겠습니까? 
		// 1. 전화번호 
		// 2. 사원 연봉 
		// 3. 보너스 율 
		// 9. 돌아가기 
		// 메뉴 번호를 누르세요 :  
		
		// 사용자가 수정하고 싶은 내용에 대한 번호를 입력하면 
		// 수정할 XXX : 라고 안내문을 출력 후 사용자에게 값을 받고 
		
		// 받은 값을 EmployeeController의 modify() 인자로 넣어 전달 
		// 9번을 입력하면 “메인메뉴로 돌아갑니다” 출력 후 메인 메뉴로 
		// 잘못 입력할 경우 “잘못 입력하셨습니다.” 출력 후 메인메뉴로 
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까? ");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		
		int menu = sc.nextInt();
		
		String message = "수정할 ";
		switch(menu) {
		case 1:
			message += "전화번호 : ";
			break;
		case 2:
			message += "사원 연봉 : ";
			break;
		case 3:
			message += "보너스 율 : ";
			break;
		case 9:
			System.out.println("메인 메뉴로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.print(message);
		if (menu == 1) {
			String newPhone = sc.next();
			ec.modify(newPhone);
		} else if (menu == 2) {
			int newSal = sc.nextInt();
			ec.modify(newSal);
		} else if (menu == 3) {
			double newBonus = sc.nextDouble();
			ec.modify(newBonus);
		}
	}

	public void deleteEmp() {
		System.out.println("정말 삭제하시겠습니까? (y/n) : ");
		char yn = sc.next().charAt(0);
		
		if (yn == 'y' || yn == 'Y') {
			Employee result = ec.remove();
			if (result == null) {
				System.out.println("삭제에 성공했습니다.");
			} else {
				System.out.println("삭제에 실패했습니다.");
			}
		}
	}

	public void printEmp() {
		String info = ec.inform();
		
		if (info == null) {
			System.out.println("저장된 사원 정보가 없습니다.");
		} else {
			System.out.println(info);
		}
	}
}
