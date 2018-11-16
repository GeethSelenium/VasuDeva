package com.vasu.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmpRegTest extends OrangeHRM
{
@Test
public void empReg() throws Exception
{
	
	driver.findElement(By.linkText("PIM")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("Ram1234");
	driver.findElement(By.id("lastName")).sendKeys("selenium345");
	driver.findElement(By.id("btnSave")).click();
}
}
