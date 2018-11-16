package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class OrangeHRM
{
	public FirefoxDriver driver;
@BeforeSuite
public void appLaunch()
{
	 driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
}
@BeforeTest
public void appLogin()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
	driver.findElement(By.id("txtPassword")).sendKeys("Admin");
	driver.findElement(By.id("btnLogin")).click();
}
@AfterTest
public void appLogout() throws Exception
{
	Thread.sleep(3000);
	driver.findElement(By.id("welcome")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Logout")).click();
}
@AfterSuite
public void appClose()
{
	driver.close();
}
}
