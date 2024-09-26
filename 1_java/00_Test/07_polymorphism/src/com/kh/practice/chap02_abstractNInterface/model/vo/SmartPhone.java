package com.kh.practice.chap02_abstractNInterface.model.vo;

// CellPhone, TouchDisplay 인터페이스를 구현(상속)
public abstract class SmartPhone implements CellPhone, TouchDisplay {
/*
	- maker : String // 제조사 정보
*/
	private String maker;	// 제조사 정보
/*
	+ SmartPhone()
*/
	public SmartPhone() {}
/*
	+ printInformation() : String (기울임)
	+ setMaker(maker : String) : void
	+ getMaker() : String
 */
	// 추상메소드 : 6개 (CellPhone - 4, TouchDiplay - 1, 본인꺼(SmartPhone) - 1)
	public abstract String printInformation();
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getMaker() {
		return maker;
	}
}




