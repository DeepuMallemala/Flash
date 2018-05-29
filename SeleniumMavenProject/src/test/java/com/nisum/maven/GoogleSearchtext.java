package com.nisum.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchtext {

	public static void main(String[] args) {
		//for launching browser
		
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
        // get url
		
/*	WebDriver is interface its having unimplemented methods ,
		the unimplemented methods are implemented in FirefoxDriver class
		FirefoxDriver is a class constructor*/
		
		//Handle TextBox
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		
		driver.findElement(By.name("btnk")).click();
	}

}
