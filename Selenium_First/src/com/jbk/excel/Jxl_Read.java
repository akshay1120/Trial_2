package com.jbk.excel;

import java.io.FileInputStream;
import org.testng.annotations.Test;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Jxl_Read 
{
	@Test
	public void test01() throws Exception
	{
		FileInputStream fis = new FileInputStream("LoginData.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh =wb.getSheet("login");
		int rows = sh.getRows();// how many rows have a data
		int cols = sh.getColumns();//how many columns have a data
		System.out.println("rows and cols in excel are :"+rows+" and "+cols);
		
		for (int i = 0 ; i < rows ; i++)//loop for rows
		{
			for (int j=0; j<cols; j++)//loop for columns
			{
				Cell cell = sh.getCell(j , i);
				String data = cell.getContents();
				System.out.println(data+"  ");
			}
			System.out.println();
		}
	}
	
}
