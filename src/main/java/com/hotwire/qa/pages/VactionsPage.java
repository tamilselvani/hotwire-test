package com.hotwire.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotwire.qa.base.TestBase;


public class VactionsPage extends TestBase{
	
	@FindBy(linkText = "Vacations")
	public static WebElement VactionsLink;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/div/div[2]/farefinder-package/div/div/div[2]/button[1]")
	public static WebElement flight;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/div/div[2]/farefinder-package/div/div/div[2]/button[2]")
	public static WebElement hotel;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/div/div[2]/farefinder-package/div/div/div[2]/button[3]")
	public static WebElement car;
	
	@FindBy(id="farefinder-package-origin-location-input")
	public static WebElement flyfrom;
	
	@FindBy(xpath="//farefinder-package/div/form/div[1]/div[1]/div/ul/li[1]/a")
	public static WebElement sfoselect;
	
	@FindBy(xpath="//farefinder-package/div/form/div[1]/div[2]/div/ul/li[1]/a")
	public static WebElement laxselect;
	
	@FindBy(id="farefinder-package-destination-location-input")
	public static WebElement flyto;
	
	@FindBy(id="farefinder-package-startdate-input")
	public static WebElement startdate;
	
	@FindBy(id="farefinder-package-enddate-input")
	public static WebElement enddate;
	
	@FindBy(id="farefinder-package-pickuptime-input")
	public static WebElement pickupTime;
	
	@FindBy(id="farefinder-package-search-button")
	public static WebElement searchbtn;
	
	public VactionsPage() {
		PageFactory.initElements(driver, this);
	}

}



