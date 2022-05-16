package com.cm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;


public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();                       //Call parent constructor
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();             //Call method from parent class
	    loginPage = new LoginPage(); //To write this for calling constructor from other class
	    
		}
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"#1 Free CRM customer relationship management software cloud");
	}
	@Test(priority=2)
	public void crmLogoImageTest() {
		 boolean flag = loginPage.validateCRMImage();
		 Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void loginTest()  {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
}
