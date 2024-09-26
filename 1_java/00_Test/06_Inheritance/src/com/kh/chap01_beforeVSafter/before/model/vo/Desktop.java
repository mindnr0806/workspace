package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	
	private String brand;
	private String code;
	private String name;
	private int price;
	private boolean allnOne;
	
	public Desktop() {}
	
	public String information() {
		return "brand=" +brand
				+", code="+code
				+", name="+name
				+", price="+price
				+", allnOne="+allnOne;
				}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAllnOne() {
		return allnOne;
	}

	public void setAllnOne(boolean allnOne) {
		this.allnOne = allnOne;
	}
	

	

}
