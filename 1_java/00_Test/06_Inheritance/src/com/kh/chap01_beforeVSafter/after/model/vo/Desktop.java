package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product{

	public boolean allnOne; 
	
	public Desktop() {}
	
	public Desktop(String brand
					, String code
					, String name
					, int price
					, boolean allnOne) {
		super(brand, code, name, price);
		
		this.allnOne = allnOne;
		
	}
	
	public String information() {
		return super.information()
				+", allnOne=" + allnOne;
	}
	public boolean isAllnOne() {
	 return allnOne;
	}
	public void setallnOne(boolean allnOne) {
		this.allnOne = allnOne;
	}
}
