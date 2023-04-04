package com.test1;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		
		
		System.out.println("ko");
		Scanner sc=new Scanner(System.in);

		int number=sc.nextInt();
		
		System.out.println("Enter a number");
		
		for(int i=0;i<=number;i++){
			
			System.out.println(i);
			
		}
		
		sc.close();
		
		
		
		
		
		
	
	
	}

}
