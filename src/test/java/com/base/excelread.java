package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelread {
	@Test(dataProvider = "credentials")
	public void loginTest(String username, String password) {
		System.out.println(username + " " + password);

	}

	@DataProvider(name = "credentials")
	public Object[][] dataSupplier() throws IOException {
		File excelFile = new File(System.getProperty("user.dir") + "C:\\Users\\Rohan\\Desktop\\New.xlsx");
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowCount][columnCount];

		for (int r = 0; r < rowCount; r++) {
			XSSFRow row = sheet.getRow(r + 1);
			for (int c = 0; c < columnCount; c++) {
				XSSFCell cell = row.getCell(c);
				CellType cellType = cell.getCellType();
				switch (cellType) {
				case STRING:
					cell.getStringCellValue();
					data[r][c] = cell.getStringCellValue();
					break;
				case NUMERIC:
//	    		    	data[r][c] = Integer.toString()cell.getDateCellValue();	
					break;
				case BOOLEAN:
					data[r][c] = cell.getBooleanCellValue();
					break;

				}

			}

		}
		return data;
	}
}
