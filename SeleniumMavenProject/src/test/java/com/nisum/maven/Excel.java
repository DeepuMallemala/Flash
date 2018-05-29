package com.nisum.maven;

public class Excel implements MsOffice {

	
	//to make relation between two classes we use extend keyword
	
		// to make relation b/n classes ad interface we use implements keyword
	public void open() {
		
		System.out.println("open excel");
	}

	public void write() {
		System.out.println("write code on  excel");
		
	}

	public void save() {
		System.out.println("save excel");
		
	}

	
	
	
}
