package com.kh.ch09_interface;

public class Monstera extends Plant{
	
		public Monstera(String name) {
			this.name = name;
		}
		@Override
		public void sprinkleWater() {
			//nutrients의 값을 10 증가
			int n = getNutrients();
				setNutrients(n+10);
			
		}
		
		@Override
		public void backSun() {
			//intrients의 값을 20증가
			setNutrients(getNutrients() + 20);
		}
		
		//tostring()재정의 : 모든 필드 정보 반환
		@Override
		public String toString() {
			return "name=" + name + ", getNutrients()=" + getNutrients() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() ;
		}
		

	
}
