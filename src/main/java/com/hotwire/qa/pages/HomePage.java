package com.hotwire.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotwire.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(linkText = "Vacations")
	WebElement VactionsLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		
		return driver.getTitle();
	}
	
	public WebElement clickOnVacationsLink(){
		
		return VactionsLink;
	}

}
