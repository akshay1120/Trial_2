package com.jbk;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_8 
{
	@Test
	// Verify course details
	public void TestCase__8 ()  
	{
		ArrayList<String> ExpectedNames = new ArrayList<String>();
		ExpectedNames.add("Automation Testing");
		ExpectedNames.add("Software Development");
		ExpectedNames.add("Data Science");
		ExpectedNames.add("Web Development");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay%20S%20Jain/Desktop/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		
		List<WebElement> courses = driver.findElements(By.xpath("//div[@class='inner']/p"));
		
		ArrayList<String> actualNames = new ArrayList<String>();
		
		for(WebElement element : courses)
		{
			String text = element.getText();
			System.out.println("actualNames : " +  text);
			actualNames.add(text);
		}
		Assert.assertEquals(actualNames, ExpectedNames);

		driver.close();
	}
}
