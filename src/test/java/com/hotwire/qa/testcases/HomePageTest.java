package com.hotwire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hotwire.qa.base.TestBase;
import com.hotwire.qa.pages.HomePage;


public class HomePageTest extends TestBase {
	
	HomePage homePage;

	public HomePageTest() {
		super();
	}


	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		homePage = new HomePage();	
		Thread.sleep(3000);

	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		
		Assert.assertEquals(homePageTitle, "Cheap Hotels, Cars, & Flights | Last Minute Travel Deals | Hotwire");
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
