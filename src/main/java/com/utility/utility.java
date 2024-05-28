package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class utility {

	public static String getPropertyDirectly(String key) {

		String path = "C:\\Users\\Rohan\\Desktop\\Freamwork_Selenium_custom_TestNG\\Framework_CustomTestNG\\test_data\\properties\\sit_env.properties";

		try {
			FileInputStream file = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(file);
			
			return prop.getProperty(key);
		} 
		catch (IOException e) {

			e.printStackTrace();
		}
		return null;

	}
	
	public static void setImplicitWait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public static void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}

} 
