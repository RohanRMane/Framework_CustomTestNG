package com.testscrips;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.base;
import com.page_class.DashbordPage;
import com.page_class.LoginPage;
import com.page_class.PimPage;
import com.page_class.SidebarPage;
import com.utility.utility;

public class TC_addEmployee extends base {

	
	
	LoginPage login;
	DashbordPage dashborad;
	SidebarPage sidebarpage;
	PimPage pimpage;
	  
	@Test
	public void TC_addmployee() throws IOException, InterruptedException {
		
		String path = "C:\\Users\\Rohan\\Desktop\\Freamwork_Selenium_custom_TestNG\\Framework_CustomTestNG\\test_data\\excelsheet\\testdata.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Workbook workbook = new XSSFWorkbook(file);
		
	    Sheet sheet = workbook.getSheet("addEmployeeData");	
	    
		login = new LoginPage(driver);
		dashborad = new DashbordPage(driver);
		sidebarpage = new SidebarPage(driver);
		pimpage = new PimPage(driver);
		
		
		utility.maximizeWindow(driver);
		driver.get(url);
		utility.setImplicitWait(driver,10);
		login.EnterCred("Admin", "admin123");
		login.ClickLoginBtn();
		
		String actualresult = dashborad.DashBoardText.getText();
		String expectedresult = "Dashboard";
		
		Assert.assertEquals(actualresult, expectedresult);
		
		sidebarpage.pim.click();
		pimpage.addemployee.click();
		
	    pimpage.employeeFullName(sheet.getRow(1).getCell(0).toString(), sheet.getRow(1).getCell(1).toString(), sheet.getRow(1).getCell(2).toString());
	    pimpage.clickonLoginDetails();
	    pimpage.employeeCred(sheet.getRow(1).getCell(3).toString(), sheet.getRow(1).getCell(4).toString(), sheet.getRow(1).getCell(5).toString());
	    pimpage.clickOnSaveBtn();
		Thread.sleep(3000);
	
		
	}
}





//
