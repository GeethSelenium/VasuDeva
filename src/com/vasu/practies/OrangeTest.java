package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeTest {

	public static void main(String[] args)
	{
		//String expText="Welcome Admin";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		//validations
	//String actText=driver.findElement(By.id("welcome")).getText();
	if (driver.findElement(By.id("menu_pim_viewPimModule")).isDisplayed())
	{
		System.out.println("AdminLogin Successfull");
	}else
	{
		System.out.println("AdminLogin Fail");
	}
		

	}

}
