package com.page_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

	@FindBy(xpath ="//a[text()='Add Employee']")
	public WebElement addemployee;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-middlename']")
	public WebElement middleName;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']")
	public WebElement lastName;
	
	
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	public WebElement CreateLogingDetails;
	
	@FindBy(xpath ="(//input[@class='oxd-input oxd-input--active'])[3]")
	public WebElement username;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	public WebElement password;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	public WebElement confirmpassword;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	public WebElement saveBtn;
	
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void employeeFullName(String fname, String mname, String lname) 
	{
		firstName.sendKeys(fname);
		middleName.sendKeys(mname);
		lastName.sendKeys(lname);	
	}
	
	public void clickonLoginDetails() 
	{
		CreateLogingDetails.click();	
	}
	
	public void employeeCred(String uname, String pass, String cpass) 
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		confirmpassword.sendKeys(cpass);	
	}
	
	public void clickOnSaveBtn()
	{
		saveBtn.click();
	}
}
