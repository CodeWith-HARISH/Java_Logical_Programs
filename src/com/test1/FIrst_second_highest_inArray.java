package com.test1;

public class FIrst_second_highest_inArray {

	public static void main(String[] args) {
		

		
				int[] arr= {10,50,80};
		 
		        int max = arr[0]; //10
		        int min = arr[0];
		        
		        System.out.println(max);
		       
		        for (int i = 0; i < arr.length; i++)
		        {  
		           if(arr[i] > max) { 
		        	   
		               max = arr[i];
		           }
		           
		           else if(arr[i] < min){
		        	   
		        	   min =arr[i];
		        	   
		           }
		        	   
		           
		           
		        }  
		        
		        System.out.println("Largest number:" + max +" "+ "smallest number :" + min);  
		        

		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
	}

}
