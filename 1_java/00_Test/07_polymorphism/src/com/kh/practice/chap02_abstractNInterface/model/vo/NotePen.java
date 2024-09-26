package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface NotePen {
	// + PEN_BUTTON : boolean = true (밑줄)
	public static final boolean PEN_BUTTON = true;
	
	//	+ bluetoothPen() : boolean  // 블루투스펜 탑재여부 (기울임)
	/*public abstract*/ boolean bluetoothPen();
}
