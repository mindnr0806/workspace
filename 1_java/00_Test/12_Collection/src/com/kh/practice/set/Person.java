package com.kh.practice.set;

public class Person {
	
	private String name;	//이름
	private int age;		//나이
	private double height;	//키
	
	//모든 필드의 값이 일치하면 동일한 객체로 판단 :equals, hashCode
	
	
	
	public Person(String name, int age, double height) {
		this.name= name;
		this.age= age;
		this.height= height;
	}
	@Override
	public int hashCode() {
		String info = name + age + height;
		return info.hashCode();
	}
	//Person객체A.equals(Person객체B)이런식으로 호출되어 사용됨 것임
	@Override
	public boolean equals(Object obj) {
		//현재객체와 전달받는 객체의 각 필드값을 비교하여 모두 일치하면 true, 그렇지 않으면 false
		//Person 	Object
		if(obj instanceof Person) {
			Person P = (Person)obj;
			if(this.name.equals(P.name)&&
					this.age == P.age &&
						this.height == P.height) {
				return true;
						
			}
			//비교대상이 Obj 객체가 Person 타입의 아니거나,
			// 3개의 필드중 하나라도 값이 다른 경우 false 리턴
			return false;
		}

		
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	
	
	
}
