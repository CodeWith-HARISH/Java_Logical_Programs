package com.test1;

public class Test_Program1 {

	public static void main(String[] args) {
		String s1="abcde"; String s2="KFecab"; 
		
		int[] ar=new int[127];
		
		if(s1.length()!=s2.length())
		{
			System.out.println("requirement failed");
		}
		
		for(int i=0;i<s1.length();i++)
		{
			ar[s1.charAt(i)]=ar[s1.charAt(i)]+1;
			ar[s2.charAt(i)]=ar[s2.charAt(i)]-1;
			
		}
		int flag=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
			{
				System.out.println("condition failed");flag=1;break;
			}
		
		}
		
		if(flag==0)
		{
			System.out.println("String is good");
		}
		

		
		
		
		
	}

}
