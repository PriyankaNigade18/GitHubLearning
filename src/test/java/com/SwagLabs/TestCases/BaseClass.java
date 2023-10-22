package com.SwagLabs.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;
import com.SwagLabs.Utility.PropertiesUtil;
import com.SwagLabs.Utility.Utility;

public class BaseClass
{
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	public CheckOutPage check;
	public OverViewPage op;
	public PropertiesUtil ps;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		ps=new PropertiesUtil();
		
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp=new CartPage(driver);
		check=new CheckOutPage(driver);
		op=new OverViewPage(driver);
		
		
		
		
	}
	

	@BeforeClass
	public void pageSetUp()
	{
		System.out.println("******Login page****************");
		lp.doLogin(ps.getData("un"),ps.getData("psw"));
		waitForTask();
		System.out.println("*****Inventory page***************");
		System.out.println("Total Products are: "+ip.getProductCount());
		ip.getProductLable();
		Utility.getScreenshot(driver);
		ip.addProductToCart(ps.getData("pname1"));
		Utility.getScreenshot(driver);
		waitForTask();
		System.out.println("****************Cart Page***************");
		cp.getCartPage();
		Utility.getScreenshot(driver);
		waitForTask();
		cp.getRemoveProduct();
		Utility.getScreenshot(driver);
		waitForTask();
		cp.doContinue();
		Utility.getScreenshot(driver);
		waitForTask();
		ip.addProductToCart(ps.getData("pname2"));
		cp.getCartPage();
		waitForTask();
		cp.doCheckout();
		waitForTask();
		System.out.println("************CheckOut**********");
		check.doContinue(ps.getData("fname"),ps.getData("lname"),ps.getData("zcode"));
		System.out.println("**********Overview Page**********");
	}
	
	
	public void waitForTask()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
