package com.jbk.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageFactory_LoginPage_Test 
{
	WebDriver driver;
	LoginPage lp;
	//DashboardPage dp;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.drive", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		lp=new LoginPage(driver);
		//dp=new DashboardPage(driver);
	}

	@Test// tester working login page
	public void validLoginTest() {
		lp.enterUname("mangesh@gmail.com");
		lp.enterPass("123456");
		lp.clickLogin();
	}
	
	@Test// tester working on Dashboard page
	public void test02() {
		lp.ValidLogin();
		Assert.assertEquals(driver.getTitle(),lp.getTitle());
	}
}
