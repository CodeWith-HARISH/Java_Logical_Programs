package com.test1;

public class Occuences0f_charcter {

	public static void main(String[] args) {
		
		
		
		String s="Hey sjava hello pressssss";
		
		
		int total_count=s.length();

		int total_withoutA=s.replace("s", "").length();
	
		int count=total_count-total_withoutA;
		
		System.out.println(count);
	
	
	}
	
	

}
