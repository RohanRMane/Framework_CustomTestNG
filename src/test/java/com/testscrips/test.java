package com.testscrips;

import java.io.IOException;
import org.testng.annotations.Test;

import com.base.base;
import com.utility.utility;

public class test extends base{

	@Test
	public void test1() throws IOException 
	{
		driver.get(url);
		utility.maximizeWindow(driver);
		utility.setImplicitWait(driver, 10);
		
	}
}
