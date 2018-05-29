package com.method.overloading;


public class Box {
	
	int length;
	int width;
	
	public void calculateArea(int width) {
		int area= length*width;
		System.out.println(area);
	}
		
	public void calculateArea(int length, int width) {
		
		int area = length*width;
		System.out.println(area);
		
	}

public void calculateArea(double length, double width) {
		
		double area = length*width;
		System.out.println(area);
		
	}
}





/*Method Overloading:
Polymorphism: Methods performing many actions based on object

CompileTime:
	
RunTime Polymorphism:
	
Method OverLoading:Same method names with different parameters*/