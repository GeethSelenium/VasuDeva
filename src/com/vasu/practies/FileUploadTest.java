package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("asgshsfjjryj");
		driver.findElement(By.id("lastName")).sendKeys("asgarhhddf");
		driver.findElement(By.id("photofile")).click();
		//driver.findElement(By.id("photofile")).sendKeys("D:\Desrt.jpg");
		//autoit
		Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\getha.exe");
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnSave")).click();
	}

}
