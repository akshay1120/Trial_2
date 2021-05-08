package com.jbk.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;
	LoginPage lp;
	
	@BeforeMethod
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.drive", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay%20S%20Jain/Desktop/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		lp=new LoginPage(driver);
	}

	@Test// tester working login page
	public void validLoginTest() 
	{
		lp.enterUname("akshay@gmail.com");
		lp.enterPass("123456");
		lp.clickLogin();
	}
	
	@Test// tester working on Dashboard page
	public void test02()
	{
		lp.ValidLogin();
		Assert.assertEquals(driver.getTitle(),lp.getTitle());
	}
	
}


