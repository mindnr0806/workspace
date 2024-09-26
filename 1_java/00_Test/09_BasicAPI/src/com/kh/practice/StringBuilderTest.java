package com.kh.practice;

public class StringBuilderTest {

	public static void main(String[] args) {
		//StringBu

		String str = "Winter";
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println(System.identityHashCode(sb));
		System.out.println("------------------------");
		
		//값을 변경하고자 할때 :변수명,append(추가할값)
		sb.append(" is pretty ");
		sb.append(" !!! ");
		
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		
		
		
	}

}
