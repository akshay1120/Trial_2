package com.com.jbk;

import org.testng.annotations.Test;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class LoginWith_DP 
{
	
  @Test(dataProvider = "dp")
  public void loginTest(String uname, String pass) 
  {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Akshay%20S%20Jain/Desktop/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
	String validTitle = "JavaByKiran | Dashboard";
	String invalidTitle = "JavaByKiran | Log in";
	
	if(driver.getTitle().contains("Log in"))
		Assert.assertEquals(driver.getTitle(), invalidTitle);
	else
		Assert.assertEquals(driver.getTitle(), validTitle);
   }

   
  @DataProvider 
  public Object[][] dp() throws Exception
  {
	FileInputStream fis = new FileInputStream("LoginData.xls");
	Workbook wb = Workbook.getWorkbook(fis);
	Sheet sh =wb.getSheet("login");
    String data [][] = new String [sh.getRows()][sh.getColumns()];
    int rows = sh.getRows();// how many rows have a data
	int cols = sh.getColumns();//how many columns have a data
	
    for (int i = 0 ; i < rows ; i++)//loop for rows
	{
		for (int j=0; j< cols; j++)//loop for columns
		{
			Cell cell = sh.getCell(j , i);
			data[i][j] = cell.getContents();
		}
	 }
    return data ;
   }
}
