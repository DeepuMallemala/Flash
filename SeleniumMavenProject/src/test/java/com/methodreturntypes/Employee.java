package com.methodreturntypes;

public class Employee {

	double salary= 3000.3456;
	double bonous= 5679.4787898;
	
	public double calSalary() {
		
		double totalSalary=salary+bonous;
		//System.out.println(totalSalary);
		return totalSalary;
		
		
	}
	
	
}
