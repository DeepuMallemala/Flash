package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AllControls {

	
	public static void main(String[]args) {
		
		//launching browser
		WebDriver driver = new FirefoxDriver();
		//to maximize window
		driver.manage().window().maximize();
		//enter url
		driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");
		//Handle Hyper link
		
		driver.findElement(By.linkText("Selenium Practice page")).click();
		
		//Handle text box
		driver.findElement(By.name("Name")).sendKeys("selenium");
		//Handle checkbox
		driver.findElement(By.name("subscribe")).click();
		
		//Handle Text Area
		driver.findElement(By.name("comments")).sendKeys("Handle all controls by selenium");
		
		//Handle Dropdown
				
		new Select(driver.findElement(By.name("countries"))).selectByIndex(1);
		
	//Handle Radio Button

		//*[@attribute_name='attribute_value']
		driver.findElement(By.xpath("//input[@value=good]")).click();
		
	}
}
