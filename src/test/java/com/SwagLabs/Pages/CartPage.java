package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage
{
	private WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By cartbtn=By.xpath("//a[@class='shopping_cart_link']");
    private By removebtn=By.xpath("//button[text()='Remove']");
    private By cshopping=By.id("continue-shopping");
    private By checkbtn=By.id("checkout");
    
    public void getCartPage()
    {
    	driver.findElement(cartbtn).click();
    	System.out.println("Cart page Open");
    }
    
    
    public void getRemoveProduct()
    {
    	driver.findElement(removebtn).click();
    	System.out.println("Product get removed from cart page");
    	
    }

    public void doContinue()
    {
    	driver.findElement(cshopping).click();
    	System.out.println("Select the product for continue");
      	
    }
    
    public void doCheckout()
    {
    	driver.findElement(checkbtn).click();
    	System.out.println("Checkout page open");
    }
}
