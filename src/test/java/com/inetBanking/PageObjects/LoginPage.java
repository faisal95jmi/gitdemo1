package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement usrname;
	
	@FindBy(name="password")
	WebElement passwrd;
	
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	
	
	public void setUserName(String uname)
	{
		usrname.sendKeys(uname);
		
	}
	
	public void setPassword(String pwd)
	{
		passwrd.sendKeys(pwd);
		
	}
	
	public void clickSubmit()
	{
		btnlogin.click();
		
	}
	
	
	
	
}
