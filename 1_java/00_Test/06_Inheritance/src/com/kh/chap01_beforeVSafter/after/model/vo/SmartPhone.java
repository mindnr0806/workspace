package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product {
	
		
		public String mobileAgency;
		
		public SmartPhone() {
			
		}
		
		public SmartPhone(String brand, String code, String name, int price, String mobileAgency) {
			super(brand, code, name, price);
			this.mobileAgency = mobileAgency;
		}

		public String information() {
			return  super.information()
					+", mobileAgency="+mobileAgency;
		}
		
		public String getMobileAgency() {
			return mobileAgency;
		}
		

}
