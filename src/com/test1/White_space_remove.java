package com.test1;

public class White_space_remove {

	public static void main(String[] args) {
		
		
		String str="India    Is My Country";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			
			char ch=str.charAt(i);
			
			if(ch==32 || ch==' ')
			{
				count++;
			}
			
		}
		
		System.out.println("White-spaces are:"+count);
		
		
		
		
		
		
		

		
		
		
		

	}

}
