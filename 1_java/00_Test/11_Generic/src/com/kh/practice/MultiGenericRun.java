package com.kh.practice;

class DateClass03<L, R>{
	private L left;
	private R right;
	
	public L getLeft() {
		return left;
	}
	public void setLeft(L left) {
		this.left=left;
	}
	public R getRight() {
		return right;
	}
	public void setRight(R right) {
		this.right = right;	
	}
}
	

public class MultiGenericRun {

	public static void main(String[] args) {
		DateClass03<String, Integer> d1 = new DateClass03<>();		
		d1.setLeft("안녕!");
		d1.setRight(1000);
		String left = d1.getLeft();
		int right = d1.getRight();
		
		DateClass03<Double, Boolean> d2 = new DateClass03<>();
		d2.setLeft(111.22);
		d2.setRight(false);
		
		
			
	}

}
