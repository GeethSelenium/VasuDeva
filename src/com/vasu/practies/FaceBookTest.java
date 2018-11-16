package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookTest
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://facebook.com");
		driver.manage().window().maximize();
		//select day
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByIndex(6);
		//Select month
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(10);
		//select year
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByIndex(6);
	}

}
