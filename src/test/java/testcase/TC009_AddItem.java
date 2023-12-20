package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;
  //test case for add an item
public class TC009_AddItem extends ProjectSpecification {
	
		@BeforeTest
		public void setup() {
			
			excelfile="TC009_AddAnItem";
			
		}
		
		@Test(dataProvider ="getData" )
		public void addItemToCart( String item,String title,String firstname,String lastname,String address,String city,String state,String zip)throws InterruptedException, IOException {
	
			new HomePage(driver)
			.addItemToCart()
			.searchAnItem(item)
			.clickSearch()
			//.selectAnItem()
			.addToCart()
			//.verifyItemAdded(title)
			//.clickContinue()
			.clickMenu()
			//.capture("TC009_click menu");
			.clickByDepartment()
			.clickTab()
			.clickGalaxyTab()
			.clickGalaxyTabUltra()
			.selectTab()
			.addTabToTheCart()
			.clickContinue()
			.clickMenu()
			.clickByBrand()
			.clickBrandName()
			.clickHeadPhone()
			.selectItem2()
			.addItem3ToCart()
			.clickGoToCart()
			.clickClose()
			.clickCheckOut()
			.clickContinueAsGuest()
			.clickSwitch()
			.enterFirstName(firstname)
			.enterLastName(lastname)
			.enterAddress(address)
			.enterCity(city)
			.selectState(state)
			.enterzipCode(zip)
			.moveToSwitch()
			.capture("TC009_AddAnItem");
					
			
			
		}
}
