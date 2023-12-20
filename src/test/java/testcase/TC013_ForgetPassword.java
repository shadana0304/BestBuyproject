package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;
//test case for forget password page
public class TC013_ForgetPassword extends ProjectSpecification{
		
	@BeforeTest
    public void setup() {
 	  	   excelfile="TC013_ForgetPassword";
     }
	
	 @Test(dataProvider="getData")	 
	 public void forgetPasswordTest(String email,String pass) throws IOException, InterruptedException {
		new HomePage(driver)
		.ForgetPassWord()
		.clickAccount()
		.clickSignIn()
		.clickForgetPassWord()
		.reEnterMail(email)
		.clickContinu()
		.capture("TC013_ForgetPassword");

}
}