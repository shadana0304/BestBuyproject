package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;
//test case for filter an item
public class TC014_FilterAnItem extends ProjectSpecification{
	

	@Test
	public void filterAnItem() throws InterruptedException, IOException {

		new HomePage(driver)
		.addItemToCart()
		.clickMenu()
		.clickByBrand()
		.clickBrandName()
		.clickHeadPhone()
		.clickDiscount()
		.clickClear()
		.enterPriceMinimum("75")
		.enterPriceMaximum("150")
		.clickPrice()
		//.selectAnItem3()		
		//.addItem3ToCart()
		//.clickCart()
		.capture("TC014_FilterAnItem");

}
}