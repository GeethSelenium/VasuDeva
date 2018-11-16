package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://amazon.in");
		driver.manage().window().maximize();
		//WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select sl=new Select(driver.findElement(By.id("searchDropdownBox")));
		//sl.selectByIndex(32);
		//sl.selectByVisibleText("Books");
		//sl.selectByValue("search-alias=fashion");
		//capturing all items froms dropdown
	List<WebElement> dropList=sl.getOptions();
	for (WebElement element : dropList) 
	{
		System.out.println(element.getText());
	}

	}

}
