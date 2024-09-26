package com.kh.hw.employee.model.vo;

public class Employee {
	// 필드부
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
	// 기본생성자
	public Employee() {}
	// 4개 매개변수를 가지는 생성자
	public Employee(int empNo, String name, char gender, String phone) {
		// 전달된 값들을 각 변수에 초기화
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	// 모든 필드를 매개변수(7개)로 가지는 생성자
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.dept = dept;
		this.salary = salary;
		this.bonus = bonus;
	}
	// empNo 변수의 getter/setter
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String printEmployee() {
		//2 김길순 여 010-5678-1234 영업부 3000000 0.15
		return empNo + " " + name + " " + gender + " "
				+ phone + " " + dept + " " + salary + " "
				+ bonus;
		// return String.format("%d %s %c %s %s %d %.2f",
		//						empNo, name, gender, phone, dept, salary, bonus);
	}
	
}






