//Blank Login Password Testcase   

package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2
{
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// To open the Browser
		WebDriver driver = new ChromeDriver();
		
		// To enter the URL
		driver.get("file:///C:/Users/Akshay%20S%20Jain/Desktop/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		
		// For finding a WebElement
		WebElement LoginButton = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button"));
		
		//To click a Login Button
		LoginButton.click();
		
		// For finding a WebElement
		WebElement Loginerror = driver.findElement(By.id("email_error"));
		
		String actual_Login_Error = Loginerror.getText();
		String expected_Login_Error = "Please enter email.";
		

		if(actual_Login_Error.equals(expected_Login_Error))
		{
			System.out.println("Login error is Matched");
			// Test will pass
		}
		else
		{
			System.out.println("Login error is not Matched");
			// Test will fail	
		}		
		
		// For finding a WebElement
		WebElement Passerror = driver.findElement(By.id("password_error"));
		
		String actual_Pass_Error = Passerror.getText();
		String expected_Pass_Error = "Please enter password.";
		

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
