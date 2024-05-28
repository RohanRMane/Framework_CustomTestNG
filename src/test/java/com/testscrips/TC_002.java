package com.testscrips;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.base;
import com.page_class.DashbordPage;
import com.page_class.LoginPage;
import com.utility.utility;

public class TC_002 extends base
{
	
	LoginPage login;
	DashbordPage dashborad;
 
	@Test(description = "Verify Login with valid ESS username and Invalid password")
	public void tc_002() {
		
		login = new LoginPage(driver);
		dashborad = new DashbordPage(driver);
		
		driver.get(url);
		utility.maximizeWindow(driver);
		utility.setImplicitWait(driver, 10);
		login.EnterCred("Admin", "23456");
		login.ClickLoginBtn();
		
		String actualresult = login.invalidcredentialstext.getText();
		String expectedresult = "Invalid credentials";
		
		Assert.assertEquals(actualresult, expectedresult);
		
	}
	
	
}
