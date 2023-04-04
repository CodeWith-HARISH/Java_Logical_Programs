 package com.test1;

public class Largest_numberin_Array{

	public static void main(String[] args) {
		
		  
		int[] arr= {10,50,80,70,60};
 
        int max = arr[0]; //10
        int min = arr[0]; //10
        
        System.out.println(max);
        
      
        for (int i = 0; i < arr.length; i++)
        {  
           if(arr[i] > max) {
        	   
               max = arr[i];    
           }
           else if(arr[i] < min)
           {
        	   min = arr[i];
           }
        
        }  
        
        System.out.println("Largest value : " + max + "  smallest value :" + min);  
        
        
        
        
    }

		
		
		

	

}
