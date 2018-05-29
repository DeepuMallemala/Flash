package com.nisum.maven;

public class Car {

	// Constructor name always should be Class name
	// Accessmodifier returntype method(){ }
	// Method Declaration
	public void test() {
		System.out.println("This is method");

	}

	// to execute method we need main function

	public static void main(String args[]) {

		// ClassName objName = new ClassName();

		Car obj = new Car();
		//pass memory to object
		obj.test();

		// Constructor will execute when ever you create object for class
		// method will execute when ever you give object reference method 
	}

}
