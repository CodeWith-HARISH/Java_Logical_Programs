package com.test1;

public class searching_element_array_linear {

	public static void main(String[] args) {
		
		
		int[] a= {10,20,30,40};
		
		int search_ele=30;
		
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(search_ele==a[i])
			{
				
				System.out.println("Enter into if condition");
				
				System.out.println("Element found at :" +i + " Element found :" + a[i]);
				flag=true;
				//break;
	        }
	
			
		}
		
		if(flag==false)
		{
		System.out.println("Element not found");
		}
	
		
		
		

	}
	
	
	
	
	
	

}
