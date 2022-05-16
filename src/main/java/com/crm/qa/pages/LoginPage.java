package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory - Object Repositary:
	
	@FindBy(xpath="//div[@class='rd-navbar-wrap']/a")
	WebElement Login;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//div[contains(@class,'submit')]")
	WebElement submitBtn;
	
	@FindBy(xpath = "//a[contains(@title,'register')][1]")
	WebElement SignUpBtn;
	
	@FindBy(xpath = "//div[@class='rd-navbar-brand']")
	WebElement crmlogo;
	
	
	//Initialization the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver,this);
		
	}
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmlogo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd) {
		Login.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
		
		return new HomePage();     //After Click on Login Page it should return HomePage class i.e. we create HomePage
		
	}
	
	
}
