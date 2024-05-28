package com.page_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbtn;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	public WebElement invalidcredentialstext;
	
	public LoginPage(WebDriver driver) {

	  PageFactory.initElements(driver, this);
	}
	
	public void EnterCred(String user, String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
	}
	
	public void ClickLoginBtn() 
	{
		loginbtn.click();
	}
	
}
