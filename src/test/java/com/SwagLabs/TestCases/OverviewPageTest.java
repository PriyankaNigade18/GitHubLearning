package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OverviewPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifySummary()
  {
	  System.out.println("Summary updated");
	  op.getDetailOrderSummary();
  }
  
  @Test(priority=2)
  public void verifyFinshProcess()
  {
	op.doFinish();
  }
}
