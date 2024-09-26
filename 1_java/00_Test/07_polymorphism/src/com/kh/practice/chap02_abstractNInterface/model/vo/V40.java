package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen {
	
	public V40() {
		setMaker("LG");
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}

	@Override
	public String picture() {
		return "1200, 1600만 트리플 카메라";
	}

	@Override
	public String touch() {
		return "정전식";
	}

	@Override
	public boolean bluetoothPen() {
		return !PEN_BUTTON;
	}

	@Override
	public String printInformation() {
		return String.format("V40은 %s에서 만들어졌고 제원은 다음과 같다.\n"
							+ "%s\n%s\n%s\n%s\n%s\n"
							+ "블루투스 펜 탑재 여부 : %b",
							getMaker(), 
							makeCall(),
							takeCall(),
							picture(),
							charge(),
							touch(),
							bluetoothPen());
	}
	
	
}
