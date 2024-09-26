package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
	// 상수 : 1개
	public static final char[] NUMBERPAD = {'1', '2', '3',
											'4', '5', '6',
											'7', '8', '9',
											'*', '0', '#'
											};
	// 추상메소드 : 2개
	public abstract String makeCall();
	/*public abstract*/ String takeCall();
}
