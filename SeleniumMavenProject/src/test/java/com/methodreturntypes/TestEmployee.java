package com.methodreturntypes;

public class TestEmployee {
	
	public static void main (String args[]) {
		
		Employee john= new Employee();
		
		john.calSalary();
		
		Employee david = new Employee();
		david.calSalary();
		
		System.out.println(john.calSalary()+david.calSalary());
		
		System.out.println(2000+4000); // its is printing value
		
		//void is empty return Type
	}

}
