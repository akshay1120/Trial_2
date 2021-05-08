package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Users 
{
	@Test
	// User Tests - To check suffix of email
	public void TestCase_9 ()  
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay%20S%20Jain/Desktop/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		
		//List<WebElement>
		
	}
}
