package com.testscrips;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.base;
import com.page_class.DashbordPage;
import com.page_class.LoginPage;
import com.utility.utility;

public class TC_001 extends base
{
	
	LoginPage login;
	DashbordPage dashborad;
 
	@Test(description = "Verify Login with valid ESS username and valid password")
	public void tc_001() {
		
		login = new LoginPage(driver);
		dashborad = new DashbordPage(driver);
		
		driver.get(url);
		utility.maximizeWindow(driver);
		utility.setImplicitWait(driver, 10);
		login.EnterCred("Admin", "admin123");
		login.ClickLoginBtn();
		
		String actualresult = dashborad.DashBoardText.getText();
		String expectedresult = "Dashboard";
		
		Assert.assertEquals(actualresult, expectedresult);
		
	}
	
	
}
