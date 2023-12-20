package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ForgetPasswordpage extends ProjectSpecification{
	
	// element are located by using @Findby annotation
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;	
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	WebElement signinbut;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement forgetpword;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement resetemail;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement continu;
	
	
	//constructor initialization
	public ForgetPasswordpage(WebDriver driver) {
		this.driver=driver;
	       PageFactory.initElements(driver, this);
	       	
	}
	
	public ForgetPasswordpage clickAccount() throws InterruptedException {
	    sleep();
	    click(account);
        return this;
	
    }  
	public ForgetPasswordpage clickSignIn() throws InterruptedException {
    	sleep();
    	click(signinbut);
    	return this;
    }
	
	 public ForgetPasswordpage clickForgetPassWord() {
	    	click(forgetpword);
	    	return new ForgetPasswordpage(driver);
	    }
    
	
     public ForgetPasswordpage reEnterMail(String email) throws InterruptedException {
    	sleep();
    	sendKeys(resetemail, email);
    	return this;
    }
    
    public ForgetPasswordpage clickContinu() {
    	click(continu);
    	return this;
}

}
