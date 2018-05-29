package com.method.overloading;

public class StringDemo {
	
	public static void main (String[]args) {
		
		String a= "Hi Iam learning selenium" ;
		//System.out.println(a);
		/*
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.length());
		System.out.println(a.substring(16));
		System.out.println(a.substring(0,16));
		
		System.out.println(a.contains("java"));
		*/
		String temp[]=a.split(",");
		//System.out.println(temp[3]);
		
		for(int i = 0; i <temp.length; i++) {
			System.out.println(temp[i]);
		}
	}

}
