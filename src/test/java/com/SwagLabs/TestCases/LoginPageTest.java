package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyCurrentUrl()
  {
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("demo"),"Url is not matched!");
	  System.out.println("Url is matched!: "+actUrl);
  }
  
  @Test(priority=2)
  public void verifyLogin()
  {
	  lp.doLogin("standard_user","secret_sauce");
	  Assert.assertTrue(lp.getAppUrl().contains("inventory"),"User login is fail");
	  System.out.println("User login is Successfull");
  }
  
  
  @Test(priority=3)
  public void verifyAppTitle()
  {	  
	  System.out.println("Application Title is:"+lp.getAppTitle());
  }
}
