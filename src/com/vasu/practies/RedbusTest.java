package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedbusTest
{
	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.quikr.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='searchedCat']")).click();
		
		Thread.sleep(3000);
	List<WebElement>  list=	driver.findElements(By.xpath(".//*[@id='category-dropdown']/ul/li/a"));
		System.out.println(list.size());
		for (WebElement element : list) 
		{
			System.out.println(element.getText());
		}

	}

}
