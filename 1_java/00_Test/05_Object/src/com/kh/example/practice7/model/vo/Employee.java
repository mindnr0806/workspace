package com.kh.example.practice7.model.vo;

public class Employee {

	//필드명(변수)
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private char salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	//생성자부
	public Employee() {
		
	}
	public Employee() {int empNo, String empName) {
		this.empNo =empNo;
		this.empName =empName;
	}
	public Employee(int empNo, String empName, String dept ,String job, int age,
			char gender, char salary, double bonusPoint, String phone, String address);
	
	public Employee() {}
	
	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	
	//메소드부	
	public int getEmpNo() {
		return empNo;
		}
	public int SetEmpNo(int getEmpNo) {
		this.empNo = empNo;
	}
	public void getEmpName() {
		return empName;
	}
	public void SetEmpName(String empName) {
		this.empName = empName;
	}
	public void getDept( ) {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void getJob( ) {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public int setAge(int age) {
		this.age;
	}
	public char getGender() {
		return gender;
	}
	public char setGender( char gender) {
		this.gender;
	}
	public int getSalary() {
		return salary;
	}
	public int setSalary(int salary) {
		this.salary;
	}
	public double getBonusPoint() {
		return  bonusPoint;
	}
	public double setBonusPoint(double bonusPoint) {
		this.bonusPoint; 
	}
	public void getPhone() {
		return 	phone;
	}
	public void setPhone(String phone) {
		this.phone;
	}
	
	public void getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address

	
	
}

