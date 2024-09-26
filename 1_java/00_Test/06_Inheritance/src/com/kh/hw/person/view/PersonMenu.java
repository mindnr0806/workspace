package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {

	private  Scanner sc = new Scanner(System.in);
	private  PersonController pc = new PersonController();
	
	
	
	public void mainMenu() {
		System.out.println("1. 학생 메뉴");
		System.out.println("2. 사원 메뉴");
		System.out.println("9. 끝내기");
		System.out.println("메뉴 번호 : "); 
		
		int menu = sc.nextInt();
	}
	
	public void studentMenu() {}
	
	public void employeeMenu() {}
	
	public void insertStudent() {}
	
	public void printStudent() {}
	
	public void insertEmployee() {}
	
	public void printEmployee() {}
	
	
}
