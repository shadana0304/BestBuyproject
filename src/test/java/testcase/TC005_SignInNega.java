package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;
  //test case for signin with invalid data
public class TC005_SignInNega extends ProjectSpecification {
	
	@BeforeTest
    public void setup() {
 	  	   excelfile="TC005_SignInNegative";
     }
	
	 @Test(dataProvider="getData")	
	 
	 public void signInTestNega(String email1,String pass) throws IOException, InterruptedException {
		new HomePage(driver)
		.clickAccount()
		.clickSignIn()
		.emailEnter(email1)
		.passWord1(pass)
		.showPassword()
		.clickSignInButton()
		.capture("TC005_SignInNegative");
		
	 }
	 
}
