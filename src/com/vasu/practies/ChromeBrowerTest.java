package com.vasu.practies;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowerTest
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
	}

}
