package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;
  //test case for save an item
public class TC010_SaveAnItem extends ProjectSpecification{
	
	@Test
	public void saveAnItemTest() throws IOException, InterruptedException {
			
		new HomePage(driver)
		.addItemToCart()
		.clickMenu()
		.clickByBrand()
		.clickBrandName()
		.clickHeadPhone()
		.clickSave()
		.verifySavedItem("Saved to My Saved Items")
		.clickMySaved("Saved Items - Best Buy")
		.capture("TC0010_SaveAnItem");
		
		
	}
	}

