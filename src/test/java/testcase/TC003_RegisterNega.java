package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;
  //test case enter details for register with invalid credientials
public class TC003_RegisterNega extends ProjectSpecification {
	
	@BeforeTest
    public void setup() {
 	   
 	   excelfile="TC003_RegisterNegative";
     }
	
	@Test(dataProvider="getData")
	
	public void registerNegative(String fName,String lname,String eMail,String password,String rePassword,
   		   String mobno) throws IOException, InterruptedException {
		
		new HomePage(driver)
		.clickAccount()
		.createAccount()
		.fName(fName)
		.lName(lname)
		.eMail(eMail)
		.password(password)
		.rePassword(rePassword)
		.passwordShow()
		.mobno(mobno)
		.createAccountLast()
		.capture("TC003_RegisterNega");
		
		
	}
}
