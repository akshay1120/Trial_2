//Wrong email and Wrong  Password Test Case

package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_3 
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// To open the Browser
		WebDriver driver = new ChromeDriver();
		
		// To enter the URL
		driver.get("file:///C:/Users/Akshay%20S%20Jain/Desktop/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		
		// For finding a WebElement
		WebElement uname = driver.findElement(By.id("email"));
				
		// For entering a text in to text box
		uname.sendKeys("kiran@gmail..com");
		
		WebElement pass = driver.findElement(By.id("password"));
		
		pass.sendKeys("1234567");
		
		WebElement LoginButton = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button"));
		
		//To click a Login Button
		LoginButton.click();
		
		// For finding a WebElement
		WebElement emailerror = driver.findElement(By.id("email_error"));
		
		String actual_email_Error = emailerror.getText();
		System.out.println("actual email error = "+actual_email_Error);
		
		String expected_email_Error = "Please enter email as kiran@gmail.com";
		System.out.println("expected email error = Please enter email as kiran@gmail.com");
		
		if(actual_email_Error.equals(expected_email_Error))
		{
			System.out.println("email error is Matched");
			// Test will pass
		}
		else
		{
			System.out.println("email error is not Matched");
			// Test will fail	
		}		
		
	
		// For finding a WebElement
		WebElement Passerror = driver.findElement(By.id("password_error"));
		
		String actual_Pass_Error = Passerror.getText();
		System.out.println("actual pass error = "+actual_Pass_Error);
		
		String expected_Pass_Error = "Please enter password 123456";
		System.out.println("expected pass error = Please enter password 123456");
		
		if(actual_Pass_Error.equals(expected_Pass_Error))
		{
			System.out.println("Password error is Matched");
			// Test will pass
		}
		else
		{
			System.out.println("Password error is not Matched");
			// Test will fail	
		}		
		
		Thread.sleep(5000);
		driver.close();
	}
}
