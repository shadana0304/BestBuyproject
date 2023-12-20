package testcase;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.ProjectSpecification;
import pages.HomePage;
import pages.SignInpage;
  //test case for signin with valid data
public class TC004_SignIn extends ProjectSpecification{
	@BeforeTest
    public void setup() {
 	  	   excelfile="TC004_SignInSheet";
     }
	 @Test(dataProvider="getData")	 
	 public void signInTest(String email1,String pass) throws IOException, InterruptedException {
		new HomePage(driver)
		.clickAccount()
		.clickSignIn()
		.emailEnter(email1)
		.passWord1(pass)
		.showPassword()
		.clickSignInButton()
		.capture("TC004_SignInSheet");
		
	 }
	 
	 
}
