package com.test1;

import java.util.HashSet;

public class Find_duplicate_element_fromArray {

	public static void main(String[] args) {
		
		
		String[] arr1= {"Java", "C", "AB","jk","Java"};
		
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=i+1;j<arr1.length;j++) {
				
				if(arr1[i]==arr1[j]) {
					
					System.out.println("duplicate word : "+arr1[j]);
					
				}
				
			}
			
		}
		
         int[] arr2= {10,20,30,30};
		
         		for(int i=0;i<arr2.length;i++) {
			
         			for(int j=i+1;j<arr2.length;j++) {
				
	              			if(arr2[i]==arr2[j]) {
					
					System.out.println("duplicate number : "+arr2[j]);
					
				}
				
			}
			
		}
		
		
		
		
		
		
		
//		String arr[]= {"Java", "C", "AB","jk","Java"};
//
//		HashSet<String> all=new HashSet();
//		
//		
//		for(String m:arr) {
//			
//			if(all.add(m)==false) {
//				
//				System.out.println("duplicate"+m);
//				
//			}
//			
//			
//			
//		}
//		
		
		
		
	}

}
