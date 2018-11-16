package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
	/*//	driver.findElement(By.className("gb_P")).click();
		driver.findElement(By.linkText("Gmail")).click();
		//capture Title
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		//capture Url
		System.out.println(driver.getCurrentUrl());
		driver.close();*/
		
		driver.findElement(By.id("loginsubmit")).click();
		
		driver.quit();
		

	}

}
