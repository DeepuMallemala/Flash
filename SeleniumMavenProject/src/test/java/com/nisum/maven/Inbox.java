package com.nisum.maven;

public class Inbox extends Login{
	
	
	public void click() {
		System.out.println("this is child class click method");
		
	}
	//super keyword is used for to refer immediate parent class properties
	// we have to use SUper Keyword only on Non Static functions
	public void button() {
	
		super.click();
		
	}
	
	public static void main(String args[]){
		
		Inbox obj = new Inbox();
		obj.click();
		obj.button();
		
	
		
	
	}

}
