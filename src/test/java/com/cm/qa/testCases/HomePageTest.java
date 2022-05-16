package com.cm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	public HomePageTest() {
		super();
		
	}
	//Test Cases should be independent with each other
	//Before Each test cases --launch the browser and login
	//@test--execute test case
	//after each test case--close the browser
	
	@BeforeMethod
	public void setUp()  {
			initialization();//Call method from parent class
	   loginPage = new LoginPage(); //To write this for calling constructor from other class
	   contactsPage = new ContactsPage();
	   homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		}
	
	@Test(priority = 2)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifiedHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM","Home Page Title is not match");
		
	}
	@Test(priority = 1)
	public void userNameTest() {
		Assert.assertTrue(homePage.verifiedCorrectUserName());
	}
	
	@Test(priority = 3)
	public void verifyContactsLinkTest() {
		contactsPage = homePage.clickOnContactLink();
		}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
