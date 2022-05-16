package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//div[contains(text(),'Contacts')]")
	WebElement ContactLable;
	
}
