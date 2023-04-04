package com.test1;

public class Test_Program2 {

	public static void main(String[] args) {
		
		String a1="Java";
		String a2="Java";
	
		String rev="";
	    String rev2="";
		for(int i=0;i<a1.length();i++) {
			
			rev=rev+a1.charAt(i);
			
			
			//break;
			
		}
		for(int j=0;j<a2.length();j++) {
			
			rev2=rev2+a2.charAt(j);
			
		
		}
		System.out.println(rev);
		System.out.println(rev2);
		System.out.println(rev.contentEquals(rev2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
