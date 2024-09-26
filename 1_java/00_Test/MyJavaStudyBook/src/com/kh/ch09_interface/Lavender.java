package com.kh.ch09_interface;

public class Lavender extends Plant{
	
	public Lavender(String name) {
		this.name=name;		
	}
	
	@Override
	public void sprinkleWater() {
		//nutrients 값을 3증가
		setNutrients(getNutrients()+3);
	}
	@Override
	public void backSun() {
		// nutrients 값을 7 증가	
		setNutrients(getNutrients()+7);
	}

	@Override
	public String toString() {
		return "name=" + name 
				+ ", nutrients=" + getNutrients();
	
				
				
	}
	
	
	
}
