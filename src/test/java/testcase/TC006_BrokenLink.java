package testcase;

import org.testng.annotations.Test;
import base.ProjectSpecification;
import pages.HomePage;

 //test case for validate the given url link is broken or not
public class TC006_BrokenLink extends ProjectSpecification{

	@Test	
	public void brokenLink() {
		new HomePage(driver)
		.verifyURL("https://www.bestbuy.com/");
		
	}
}
