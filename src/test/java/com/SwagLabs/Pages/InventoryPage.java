package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage 
{
	private WebDriver driver;
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//Locators
	 private By products=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name']");
	
	private By addbtn=By.xpath("//button[text()='Add to cart']");
	private By cartbtn=By.xpath("//a[@class='shopping_cart_link']");
	
	
	//methods
	public int getProductCount()
	{
		return driver.findElements(products).size();
		
	}
	
	public void getProductLable()
	{
		List<WebElement> list=driver.findElements(products);
		
		System.out.println("************Product Lables are************");
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}
	
	public void addProductToCart(String pname)
	{
		List<WebElement> list=driver.findElements(products);
		for(WebElement i:list)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		driver.findElement(addbtn).click();
		System.out.println("Product added to the cart");
		//driver.findElement(cartbtn).click();
		
	}
}
