package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//span[contains(text(),'MANAV CHOKSHI')]")
	WebElement userNameLable;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement ContactLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement TasksLink;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public String verifiedHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifiedCorrectUserName() {
		return userNameLable.isDisplayed();
	}
	
	public ContactsPage clickOnContactLink() {
		ContactLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealstLink() {
		ContactLink.click();
		return new DealsPage();
	}
	
	public TaskPage clickOnTasksLink() {
		ContactLink.click();
		return new TaskPage();
	
	}
			
}
