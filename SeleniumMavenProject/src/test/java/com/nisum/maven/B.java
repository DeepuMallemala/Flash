package com.nisum.maven;

public class B extends A{

	public void div() {
		System.out.println("This is an div function");
	}

	public static void main(String args[]) {

		A e = new A();
		e.add();
		
		
		B b = new B();
		b.div();
		b.add();
		
// if u using extends keyword non need to create object for class
		//inheritance child class acquires parent class properties
	}

	
	
}
