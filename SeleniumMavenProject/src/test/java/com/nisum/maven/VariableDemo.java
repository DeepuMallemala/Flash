package com.nisum.maven;

public class VariableDemo {
	// Instance variable inside the class outside of method stored in Heap memory
	// to access instance variable we need an object
	int b = 200;

	static int c = 300; // ststic variable stored in method area memory

	public void add() {

		// local variable is inside method will be stored in stack memory region
		int a = 100;
		System.out.println("a");
	}

	public static void main(String args[]) {

		VariableDemo obj = new VariableDemo();
		System.out.println(obj.b); // instance variable using object
		System.out.println(VariableDemo.c); // call static variable using class name

	}

}
