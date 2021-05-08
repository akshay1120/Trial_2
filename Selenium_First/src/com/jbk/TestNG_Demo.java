package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Demo 
{
	@Test
	// LoginTest
	public void TestCase_4 () 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay%20S%20Jain/Desktop/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		String actualText =driver.findElement(By.tagName("small")).getText();
		String expectedText = "Courses Offered";
		Assert.assertEquals(actualText, expectedText);
		driver.close();
	}

	
	@Test
	// LoginTitle
	public void TestCase_5 () 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay%20S%20Jain/Desktop/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		String expectedTitle = "JavaByKiran | Log in";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
	}
	
	
	@Test
	// To Verify Logo
	public void TestCase_6 () 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay%20S%20Jain/Desktop/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.tagName("img"));
		boolean flag = logo.isDisplayed();
		Assert.assertEquals(flag,true);
		driver.close();
	}
}
