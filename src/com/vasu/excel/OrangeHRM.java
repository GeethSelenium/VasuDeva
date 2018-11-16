package com.vasu.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM
{
//appLuaunch
	public FirefoxDriver driver;
	public String res;
	public String appLaunch(String url)
	{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//validation
		if (driver.findElement(By.id("btnLogin")).isDisplayed())
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
	public String appLogin(String userName,String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		//validation
		if(driver.findElement(By.linkText("PIM")).isDisplayed())
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
	//appLogout
	public String appLogout() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		//validation
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
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
	//appClose
	
	public void appClose()
	{
		driver.close();
	}
	//AddEmp
	public String empAdd(String fName,String lName) throws Exception
	{
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		driver.findElement(By.id("btnSave")).click();
		//validation
		if(driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed())
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
	//EmpList
	
	public static void main(String[] args) throws Exception
	{
		OrangeHRM app=new OrangeHRM();
		//app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
app.appLogin("Admin","Admin");
app.empAdd("yasmin23456", "selenium12");
app.appLogout();
app.appClose();
	}

}
