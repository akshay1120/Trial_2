package com.jbk;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTest 
{
	@Test
	// Verify courses
	public void TestCase_7 ()  
	{
		ArrayList<String> ExpectedNames = new ArrayList<String>();
		ExpectedNames.add("Selenium");
		ExpectedNames.add("Java / J2EE");
		ExpectedNames.add("Python");
		ExpectedNames.add("Php");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay%20S%20Jain/Desktop/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		
		List<WebElement> courses = driver.findElements(By.tagName("h3"));
		
		ArrayList<String> actualNames = new ArrayList<String>();
		
		for(WebElement element : courses)
		{
			String text = element.getText();
			System.out.println("actualNames : " +  text);
			actualNames.add(text);
		}
		for(int i = 0 ; i<actualNames.size();i++)
			Assert.assertEquals(actualNames.get(i), ExpectedNames.get(i));
		//If we dont use above loop then also it works
		driver.close();
	}

}