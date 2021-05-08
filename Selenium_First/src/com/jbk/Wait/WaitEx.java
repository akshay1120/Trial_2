package com.jbk.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitEx 
{
	@Test
	public void test_01 ()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("file:///C:/Users/Akshay%20S%20Jain/Desktop/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		// timeOut Exception
		
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		//It will work on all WebElements
		//No Such Element Exception
		
		WebDriverWait wait = new WebDriverWait (driver , 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		//It will work on particular element
		//Element Not Visible Exception
		
		Wait<WebDriver>w = new FluentWait<WebDriver>(driver)
				.withTimeout(30 , TimeUnit.SECONDS)
				.pollingEvery(3, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		//It will work on particular element.
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		
		
	}
}
