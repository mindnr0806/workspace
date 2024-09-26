package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;

public class Run {

	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		System.out.println(d.information());
		
		Desktop d2 = new Desktop("삼성", "SS-01", "삼성데스크탑", 200, true);
		System.out.println(d2.information());
		
		Desktop d3 = new Desktop("삼성", "ss-02", "삼성데스크탑2", 220, true);
		System.out.println(d3.information());

		SmartPhone s1 = new SmartPhone();
		System.out.println(s1.information());
		
		SmartPhone s2 = new SmartPhone("애플", "ap-02", "맥북2", 240, "kt");
		System.out.println(s2.information());

	}

}
