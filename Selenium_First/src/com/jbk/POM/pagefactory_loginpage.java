package com.jbk.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagefactory_loginpage
{
	WebDriver driver ;
	
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//button")
	private WebElement lgnBtn;
	
	public void enterUname(String text)
	{
		uname.sendKeys(text);
	}
	public void enterPass(String text)
	{
		pass.sendKeys(text);
	}
	public void clickLogin() 
	{
		lgnBtn.click();
	}
	public String getTitle() 
	{
		return driver.getTitle();
	}
	public void ValidLogin()
	{
		enterUname("kiran@gmail.com");
		enterPass("123456");
		clickLogin();
	}

}