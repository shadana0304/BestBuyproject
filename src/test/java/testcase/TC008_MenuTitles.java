package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.ProjectSpecification;
import pages.HomePage;

  //test case for validation of titles on the homepage
public class TC008_MenuTitles extends ProjectSpecification {
	@BeforeTest
	public void setup() {

		excelfile="TC008_Menu";
	}
	
	@Test(dataProvider="getData")
	
	
	public void menuTest(String title1,String title2,String title3,String title4,String title5,String title6,
			String title7,String title8,String title9) throws InterruptedException, IOException {
		
		new HomePage(driver)
		.menu()
		.clickHolidayDeals(title1)
		.clickGiftcard(title2)
		.capture("TC008_MenuTitles");	
		/*.clickGiftIdea(title3)
		.clickTopDeals(title4);
		.clickDealOfDay(title5)
		.clickBestBuysell(title6)
		.clickBestBuyMembership(title7)
		.clickCreditCards(title8)
		.clickMoreLink4(title9);
		.clickMoreLink5(title10)
		.clickMoreLink6(title11);*/
		
	}
	
	
	
	
	
}
