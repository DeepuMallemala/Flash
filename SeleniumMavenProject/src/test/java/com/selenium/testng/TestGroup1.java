package com.selenium.testng;
import org.testng.annotations.Test;

public class TestGroup1 {
	
	@Test(groups= {"smoke"})
	public void tc_1() {
		
		System.out.println("Smoke First Test Case");
		
	}
	@Test(groups= {"smoke"})
	public void tc_2() {
		System.out.println("Smoke Second Test Case");
	}
	@Test(groups= {"smoke"})
	public void tc_3() {
		System.out.println("Smoke Third Test Case");
	}
}


//Git Project  DeepuMallemala Mallemala/testng.java
//https://github.com/DeepuMallemala/Flash.git