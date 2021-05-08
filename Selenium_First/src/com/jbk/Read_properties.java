package com.jbk;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Read_properties
{
	public static Properties prop = null ;
	
	
	
	@Test(priority = 1)
	public void Read_property () throws Exception
	{
		FileInputStream fis = new FileInputStream("config.properties");
		
		prop = new Properties ();
		
		prop.load(fis);
		
		String value = prop.getProperty("url");
		
		System.out.println(value);
		
	}
	
	
	
	@Test(priority=2)
	public void loginTest()
	
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
	}
	
	
	
}
