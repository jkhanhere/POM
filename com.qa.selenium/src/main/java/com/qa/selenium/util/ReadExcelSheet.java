package com.qa.selenium.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelSheet {
	
	@Test
	//C:\Users\jafar\eclipse-workspace\com.qa.selenium\src\main\java\com\qa\selenium\testdata\td.xlsx
	public void dataReadTest() throws IOException
	{
		File src = new File(".\\src\\main\\java\\com\\qa\\selenium\\testdata\\td.xlsx");
		FileInputStream  fip = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fip);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int row = sheet.getLastRowNum();
		System.out.println(row);
		
		int col = sheet.getRow(1).getLastCellNum();
		System.out.println(col);
		
		for (int r=1; r<=row; r++)
		{
			sheet.getRow(r);
			for(int c=0; c<=col; c++)
			{
				
				System.out.print(sheet.getRow(r).getCell(c));
				System.out.print("|");
			}
		}
		
		
		
		
		
		/*String A2 = sheet.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(A2);*/
		
		wb.close();
	}

}
