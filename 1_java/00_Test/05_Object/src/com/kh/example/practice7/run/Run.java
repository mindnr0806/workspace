package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.empNo(100);
		e1.empName("홍길동");
		e1.dept("영업부");
		e1.job("과장");
		e1.age(25);
		e1.gender('남');
		e1.salary(2500000);
		e1.bonusPoint(0.05);
		e1.phone("010-1234-5678");
		e1.address("서울시 강남구");
		
	}

}
