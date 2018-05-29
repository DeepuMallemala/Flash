package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTestExecution {
	
	public WebDriver driver;
	@BeforeClass
	public void launchBrowser(String myBrowser) {
		if (myBrowser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}else if (myBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hdmallemala\\eclipse-workspace\\SeleniumMavenProject\\chromedriver.exe");
			driver= new ChromeDriver();
		}
	}
	@Test
	public void tc_1() {
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		
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
