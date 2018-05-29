package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		//to maximize window
		driver.manage().window().maximize();
		//enter url
		driver.get("https://www.w3schools.com/html/html_tables.asp");
/*String firstName =driver.findElement(By.xpath(".//*[@id='main']/table[1]/tbody/tr[2]/td[3]")).getText();
*[@id='main']/table[1]/tbody/tr[2]/td[3]
		*/
		//To Handle Alert
		driver.switchTo().alert().accept();
	}

}
