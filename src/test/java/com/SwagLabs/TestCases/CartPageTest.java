package com.SwagLabs.TestCases;

import org.testng.annotations.Test;

public class CartPageTest extends BaseClass
{
	
	@Test(priority=1)
	public void openCartPage()
	{
		cp.getCartPage();
	}
	
  @Test(priority=2)
  public void verifyRemove()
  {
	  cp.getRemoveProduct();
  }
  
  @Test(priority=3)
  public void verifyContinueShopping()
  {
	  cp.doContinue();
	  ip.addProductToCart("Sauce Labs Bike Light");
	  cp.getCartPage();
	  
  }
  
  @Test(priority=4)
  public void verifyCheckout()
  {
	  cp.doCheckout();
  }
}
