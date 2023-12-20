package testcase;

import java.io.IOException;
import org.testng.annotations.Test;
import base.ProjectSpecification;
import pages.HomePage;

  //test case for validate bottomlink on the homepage
public class TC007_BottomLink extends ProjectSpecification{
   
	@Test
	public void BottomLink() throws IOException {
		new HomePage(driver)
		.clickBottomLink()
		.navigateToBottom()
		.verifyTermsAndConditions("BestBuy.com Terms and Conditions");
		
	}
}
 