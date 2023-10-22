package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage 
{
	private WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	private By fname=By.name("firstName");
	private By lname=By.name("lastName");
	private By zcode=By.name("postalCode");
	private By cancel=By.id("cancel");
	private By cbtn=By.id("continue");
	
	
	
	//Methods
	public void doCancel()
	{
		driver.findElement(cancel).click();
	}

	
	public void doContinue(String fn,String ln,String zc)
	{
		driver.findElement(fname).sendKeys(fn);
		driver.findElement(lname).sendKeys(ln);
		driver.findElement(zcode).sendKeys(zc);
		System.out.println("checkout details added!");
		driver.findElement(cbtn).click();
	}
}
