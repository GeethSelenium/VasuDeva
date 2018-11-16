package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseClick {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://amazon.in");
		driver.manage().window().maximize();
		
WebElement signIn=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
WebElement list=driver.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span"));

Actions mouse=new Actions(driver);
mouse.moveToElement(signIn).build().perform();
mouse.moveToElement(list).click().build().perform();

	}

}
