package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utility.Utility;

public class OverViewPage 
{
	private WebDriver driver;
	
	public OverViewPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//locator
	private By details=By.xpath("//div[@id='checkout_summary_container']");
	private By finish=By.name("finish");
	private By finaltext=By.tagName("h2");
	
	
	//method
	
	public void getDetailOrderSummary()
	{
		String text=driver.findElement(details).getText();
		System.out.println("*****Product Order Summary is********");
		System.out.println(text);
	
	}
	
	
	public void doFinish()
	{
		driver.findElement(finish).click();
		Utility.getScreenshot(driver);
		System.out.println(driver.findElement(finaltext).getText());
	}
	
	
	
	
	
	

}
