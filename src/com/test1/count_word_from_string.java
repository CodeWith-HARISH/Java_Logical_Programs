package com.test1;

public class count_word_from_string {

	public static void main(String[] args) {
		
		String a="Hey ja       av  j  aua hah";
		
		int count=1;

		for(int i=0;i<a.length();i++)
		{			
			
			if(a.charAt(i)==' ' && a.charAt(i+1)!=' ')
			{
				
				count++;
				
			}
			
		}
		
		
		System.out.println(count);
		
		
		
		
	}
	
}






