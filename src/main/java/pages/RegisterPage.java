package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;
import utility.BaseUtility;

public class RegisterPage extends ProjectSpecification {
		
	// element are located by using @Findby annotation
	@FindBy(id = "firstName")
	 WebElement fName;
	
	@FindBy(id = "lastName")
	 WebElement lName;
	
	@FindBy(id = "email")
     WebElement eMail;
	
	@FindBy(id = "fld-p1")
	 WebElement password;
	
	@FindBy(id = "reenterPassword")
	 WebElement rePassword;
	
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	WebElement showpassword;
	
	@FindBy(id = "phone")
	 WebElement mobno;
	
	@FindBy(xpath = "//button[normalize-space()='Create an Account']")
	 WebElement clickCreateAcc;
	
	
//constructor initialization
	
     public RegisterPage(WebDriver driver) {
    	  this.driver=driver;
       PageFactory.initElements(driver, this);
       }
       
       public RegisterPage fName(String firstname) {
    	   sendKeys(fName, firstname);
   		return  this;
   	}
       public RegisterPage lName(String lastname) {
    	   sendKeys(lName, lastname);
   		return this;
   	}
       public RegisterPage eMail(String eemail) {
    	   sendKeys(eMail, eemail);
   		return this;
   	}
       public RegisterPage password(String pasword) {
    	   sendKeys(password, pasword);
   		return this;
   	}
       public RegisterPage rePassword(String reword) {
    	   sendKeys(rePassword, reword);
   		return this;
   	}
       
       public RegisterPage passwordShow() {
    	   click(showpassword);
    	   return this;
    	   
       }
       public RegisterPage mobno(String mobileno) {
    	   sendKeys(mobno,  mobileno);
   		return this;
   		
   	}
       public RegisterPage createAccountLast() {
   		    click(clickCreateAcc);
   		return this;
   	}
      
       
}
