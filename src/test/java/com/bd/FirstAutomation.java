package com.bd;

import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver
{
  String url = "https://www.selenium.dev/downloads";
  @Test
  public void openUrl() throws InterruptedException 
  {
	  driver.get(url);
	  driver.manage().window().maximize();
	  Thread.sleep(6000);
  }
}