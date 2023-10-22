package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utility.Utility;

public class LoginPage
{
	
	private WebDriver driver;
	
	//Initialize a driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By btn=By.id("login-button");
	
	
	//Methods
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		Utility.getScreenshot(driver);
		driver.findElement(btn).click();
	}
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}

}
