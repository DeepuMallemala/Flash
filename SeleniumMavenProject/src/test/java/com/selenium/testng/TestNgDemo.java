package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {

	@BeforeMethod
	public void setUp() {
		System.out.println("Launch Browser");
	}

	// in TestNg it dosen't required any main function to execute test cases

	@Test
	public void tc_1() {
		System.out.println("This is the first testcase");	

	}

	@Test
	public void tc_2() {
		System.out.println("This is the Second testcase");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Kill the Browser");
	}
	@BeforeClass// BeforeClass execute one time in that class
	public void start() {
		System.out.println("Test Execution is ready");
	}
}
