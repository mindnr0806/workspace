package com.kh.ch04_inheritance;

public class Fruit {
	
		private String name;//이름
		private int price;  //가격
		
			
		public Fruit() {}
		
		public Fruit(String name, int price) {
			this.name=name;
			this.price=price;
			
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

		@Override
		public String toString() {
			return "이름 : " + name + ", 가격 : " + price;
		}
		
		
		

}
