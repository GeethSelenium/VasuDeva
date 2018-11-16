package com.vasu.excel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank 
{
	//appLaunch
	public FirefoxDriver driver;
	public String res;
	public String appLaunch(String url)
	{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//validation
		if (driver.findElement(By.id("login")).isDisplayed())
		{
		//System.out.println("AppLaunch Successfully");	
			res="Pass";
		}else
		{
			//System.out.println("AppLaunch Fail");
			res="Fail";
		}
		return res;
	}
	//appLogin
	
//branchCreation
	public String branchCreation(String name,String add) throws Exception
	{
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys(name);
		driver.findElement(By.id("txtAdd1")).sendKeys(add);
		driver.findElement(By.id("txtZip")).sendKeys("44444");
		
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		Thread.sleep(2000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		alt.accept();
		//validation
		if (msg.contains("created Sucessfully")) 
		{
			//System.out.println("BranchCreation Successfully");
			res="Pass";
		}else if(msg.contains("already Exist"))
		{
			//System.out.println("BranchCreation Failed");
			res="Fail";
			
		}else if(msg.contains("Please fill in"))
		{
			//System.out.println("Warning Message");
			res="Warning";
		}
		return res;
	}
}
