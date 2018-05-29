package com.selenium.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	Reporter report = new Reporter();
	@Test
	public void tc_1() {
		report.log("this test case executed with invalid data");
		System.out.println("First Test Case");
		Assert.assertEquals("Test","Test123");
	}
	@Test
	public void tc_2() {
		System.out.println("Second Test Case");
	}
	@Test
	public void tc_3() {
		System.out.println("Third Test Case");
	}
}
	
	//Test suite is collection of test cases
	//Test suite or test cases are organized by TestNG XML
	
	/*Suite: Multiple Tests
	Test:Multiple classes
	Class:Multiple Methods*/

