package com.selenium.testng;

import org.testng.annotations.Test;

public class TestGroup2 {
	@Test(groups= {"smoke"})
	public void tc_4() {
		System.out.println("RegressionFourth Test Case");
	}
	@Test(groups= {"Regression"})
	public void tc_5() {
		System.out.println("Regression Fifth Test Case");
	}
	@Test(groups= {"smoke"})
	public void tc_6() {
		System.out.println("Smoke Sixth Test Case");

	}
}
