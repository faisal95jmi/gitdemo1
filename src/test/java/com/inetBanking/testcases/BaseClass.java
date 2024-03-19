package com.inetBanking.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public String url="https://demo.guru99.com/v3/index.php";
	public String username="mngr555338";
	
	public String password="vanurun";
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}
	
}
