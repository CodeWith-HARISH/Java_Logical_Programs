package com.test1;

public class White_space_count2 {
	
	
	public static void main(String[] args) {
		
		
		String a="India   Is My CounTRy";
		int White_space=0;

			
		for(int i=0;i<a.length();i++)
		{
		    char ch=a.charAt(i);
		    if(ch==' ')
		    {
		    	White_space++;
		    }
	
		}
		
		System.out.println("Total white spaces : "+White_space);
		
		
		
		}
		
 
	

 }

























