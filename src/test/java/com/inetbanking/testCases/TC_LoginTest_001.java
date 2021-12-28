package com.inetbanking.testCases;


import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException 
	{
			
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");

		driver.findElement(By.name("btnLogin")).click();

		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals(".::AVEC-SAVE::."))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}
