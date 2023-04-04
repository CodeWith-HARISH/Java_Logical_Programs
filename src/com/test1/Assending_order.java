package com.test1;

public class Assending_order {

	public static void main(String[] args) {


		int[] arr= {20,90,50,10,80};
		
		int temp=0;
		
		System.out.println("Original Array : ");
		for(int m=0;m<arr.length;m++) 
		{
		
			System.out.print(" "+arr[m]);
			
	    }
		
		for(int i=0;i<arr.length;i++)
		{	
			for(int j=i+1;j<arr.length;j++)
			{
			    if(arr[i] > arr[j]) 
			    {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				 }
			}
		}
		System.out.println();
		
		System.out.println("Array after assending :");
		for(int n=0;n<arr.length;n++) 
		{
		
			System.out.print(" " + arr[n]);
			
	    }
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
