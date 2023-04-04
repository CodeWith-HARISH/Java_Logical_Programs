package com.test1;

import java.util.Collections;

public class element_present_in_Array {

	public static void main(String[] args) {


		String[] str= {"hdg","hdsg","yet","ury"};
		
		
		int[] a= {10,20,30,40};

		
				System.out.println(str[2]);
	
				for(int k=0;k<a.length;k++) {
					
					System.out.println(a[k]);
					
				}
		
	for(String item:str) {
		
		System.out.println(item);
		
		
	}
	
		boolean count=false;
	
		for(String list :str) {
			
			if(list.contains("hdg")) {
				
				System.out.println(list);
				
				count=true;
				break;
				
			}
			
		}
		
		System.out.println(count);
		
		
		
		
		
		
		
		
		

	}

}
