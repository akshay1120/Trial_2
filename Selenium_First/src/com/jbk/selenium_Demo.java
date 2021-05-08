package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_Demo 
{
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// To open the Browser
		WebDriver driver = new ChromeDriver();
		
		// To enter the URL
		driver.get("file:///C:/Users/Akshay%20S%20Jain/Desktop/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		
		// To maximise the window
		driver.manage().window().maximize();
		
		// to get title of login page
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement header = driver.findElement(By.xpath("/html/body/div/div[1]/a/b"));
		System.out.println(header.getText());
		
		// For finding a WebElement
		WebElement uname = driver.findElement(By.id("email"));
		
		// For entering a text in to text box
		uname.sendKeys("kiran@gmail.com");
		
		WebElement pass = driver.findElement(By.id("password"));
		
		pass.sendKeys("123456");
		
		WebElement LoginButton = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button"));
		
		//To click a Login Button
		LoginButton.click();
		
		// To get the Title of next page
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle = "JavaByKiran | Dashboard";
		
		System.out.println(driver.getCurrentUrl());
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Title is Matched");
			// Test will pass
		}
		else
		{
			System.out.println("Title is not Matched");
			// Test will fail	
		}		
		Thread.sleep(5000);
		driver.close();
	}
}
