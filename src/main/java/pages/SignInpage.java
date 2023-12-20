package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SignInpage extends ProjectSpecification {
	
	// element are located by using @Findby annotation
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signin;
	
	@FindBy(id="fld-e")
	WebElement email1;
	
	@FindBy(xpath="//input[@autocomplete='off']")
	WebElement pass;
	
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	WebElement showpword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clicksignin;
		
	//constructor initialization
	public SignInpage(WebDriver driver) {
		this.driver=driver;
	       PageFactory.initElements(driver, this);
	       	
	}
	
    public SignInpage clickSignIn() throws InterruptedException {
    	sleep();
    	click(signin);
    	return this;
    }
    
    public SignInpage emailEnter(String email) throws InterruptedException {
    	sleep();
    	sendKeys(email1,email);
    	return this;
    }
    
    public SignInpage passWord1(String pass1) {
    	sendKeys(pass,pass1);
    	return this;
    }
    
    public SignInpage showPassword() throws InterruptedException {    	
    	click(showpword);
    	return this;
    }
    
    public SignInpage clickSignInButton() {
    	click(clicksignin);
    	return this;
}
    
}