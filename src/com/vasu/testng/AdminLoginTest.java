package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdminLoginTest
{
@Test
public void appLogin()
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
}
}
