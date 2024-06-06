package com.testscrips;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class exceltest {
	@Test

	public void tset() throws IOException {
		
		String path = "C:\\Users\\Rohan\\Desktop\\Freamwork_Selenium_custom_TestNG\\Framework_CustomTestNG\\test_data\\excelsheet\\testdata.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Workbook workbook = new XSSFWorkbook(file);
		
	    Sheet sheet = workbook.getSheet("Sheet1");	 
	    
	    System.out.println(sheet.getRow(0).getCell(0));            //username
	    System.out.println(sheet.getRow(0).getCell(1));            //password
	    System.out.println(sheet.getRow(1).getCell(0));            //admin123
	    System.out.println(sheet.getRow(1).getCell(1));            //1234
	    System.out.println(sheet.getRow(2).getCell(0));            //admin345
	    System.out.println(sheet.getRow(2).getCell(1));            //4567 
	    
	}
}
