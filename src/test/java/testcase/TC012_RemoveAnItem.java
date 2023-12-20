package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;
//test case for remove an item from cart
public class TC012_RemoveAnItem extends ProjectSpecification {

	
	@Test
	public void removeItem() throws InterruptedException, IOException {
		
		
		new HomePage(driver)
		.addItemToCart()
		.clickMenu()
		.clickByBrand()
		.clickBrandName()
		.clickHeadPhone()
		.selectItem2()
		.addToCart()
		.clickGoToCart()
		.clickClose()
		.removeAnItem()
		.verifyTotal("$0.00")
		.capture("TC012_RemoveAnItem");
		
		
		
	}
	
}
