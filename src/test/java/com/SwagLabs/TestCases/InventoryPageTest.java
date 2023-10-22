package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass
{
	
  @Test(priority=1)
  public void verfiyProductCount()
  {
	  int count=ip.getProductCount();
	  Assert.assertEquals(count,6,"Product count is not match");
	  System.out.println("Product count is match");
	  System.out.println("Total Product available on page: "+count);
  }
  
  @Test(priority=2)
  public void verfiyProductLable()
  {
	  ip.getProductLable();
  }
  
  
  @Test(priority=3)
  public void validateAddToCart()
  {
	  ip.addProductToCart("Sauce Labs Bolt T-Shirt");
  }
}
