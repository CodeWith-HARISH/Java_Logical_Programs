package com.test1;

public class remove_whitespace {

	public static void main(String[] args) {
	
		
		String p="10";
		
		System.out.println(p.charAt(0));
		
		String b="Harish";
		
		String c="Java";
		
		String d="Program";
		
		System.out.println(b.concat(" "+c).concat(" "+d));
		
		
		
		
		
		
		
		
		
		String a="hidhd   dhudhd hudhudh";
		
		
		a=a.replaceAll("\\s", "");

		System.out.println(a);
		
		
		a=a.replace(" ", "");
		
		System.out.println(a);
		
		
		
		
		
		
		
	}

}
