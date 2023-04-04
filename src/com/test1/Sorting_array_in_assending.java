package com.test1;

import java.util.Arrays;

public class Sorting_array_in_assending {

	public static void main(String[] args) {
		
		
		

		
		
		
		int a[]= {10,70,80,40};
		
		
		
		System.out.println("Array Before sorting:"+Arrays.toString(a));

		Arrays.parallelSort(a);
		System.out.println("Array After sorting:"+Arrays.toString(a));
		
		
		
		
		System.out.println("Array Before sorting:"+Arrays.toString(a));

		Arrays.sort(a);
		System.out.println("Array After sorting:"+Arrays.toString(a));
		
		
		
	}

}
