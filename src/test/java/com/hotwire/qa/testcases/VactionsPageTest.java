package com.hotwire.qa.testcases;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.hotwire.qa.base.TestBase;
import com.hotwire.qa.pages.VactionsPage;


public class VactionsPageTest extends TestBase {
	
	VactionsPage vacationsPage;

	public VactionsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		vacationsPage = new VactionsPage();	
		Thread.sleep(7000);
	}
		
	@Test(priority=1)
	public void findVacation() throws Exception{

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar oCalendar = Calendar.getInstance();
        oCalendar.add(Calendar.DATE, 1);
        String sDate= dateFormat.format(oCalendar.getTime());
        System.out.println(sDate);
        oCalendar.add(Calendar.DATE, 21);
        String eDate= dateFormat.format(oCalendar.getTime());
        System.out.println(eDate);
        VactionsPage.VactionsLink.click();
        Thread.sleep(2000);
        VactionsPage.car.click();
        VactionsPage.flyfrom.sendKeys("SFO");
        Thread.sleep(3000);
        VactionsPage.sfoselect.click();
        VactionsPage.flyto.sendKeys("LAX");
        Thread.sleep(3000);
        VactionsPage.laxselect.click();;
        VactionsPage.startdate.clear();
        VactionsPage.startdate.sendKeys(sDate);
        VactionsPage.enddate.clear();
        VactionsPage.enddate.sendKeys(eDate);
        Select sStart= new Select(VactionsPage.pickupTime);
        sStart.selectByVisibleText("Evening");    
        VactionsPage.searchbtn.click();
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
