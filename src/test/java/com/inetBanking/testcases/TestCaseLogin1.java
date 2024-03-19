package com.inetBanking.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.LoginPage;

public class TestCaseLogin1 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException
	
	{
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String title =driver.getTitle();
		System.out.println(title);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Home Page"))
		{
			Assert.assertTrue(true);
		//System.out.println("matched");
		}
		else
		{
			Assert.assertTrue(false);
		//System.out.println("not matched");
		}
		
	}

}
