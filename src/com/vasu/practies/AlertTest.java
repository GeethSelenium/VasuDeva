package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(3000);
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();//click on 
		//al.dismiss();//click on cancel
		//al.getText();// apture text
		//al.sendKeys("vasudev");//sending text
		
		

	}

}
