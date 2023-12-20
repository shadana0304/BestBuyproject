package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification {
	
	// element are located by using @Findby annotation
	@FindBy(xpath = "((//a[@class='us-link'])[1]")
	WebElement usa;
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;	
	
	@FindBy(xpath="//a[text()='Create Account']")	
	WebElement createaccount;
		
	@FindBy(xpath="(//a[@role='button'])[2]")
	WebElement signinbut;
	
	//@FindBy(xpath="//a[text()='Forgot your password?']")
	//WebElement forgetpword;
	
	//constructor initialization
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage clickAccount() throws InterruptedException {
	    sleep();
	    click(account);
        return this;
	
    }      
		
	public RegisterPage createAccount() throws InterruptedException {
		sleep();
		click(createaccount);
		return new RegisterPage(driver);
	}
	
    public SignInpage clickSignIn() throws InterruptedException {
    	sleep();
    	click(signinbut);
    	return new SignInpage(driver);
    }
    
    public ForgetPasswordpage ForgetPassWord() {
    	//click(forgetpword);
    	return new ForgetPasswordpage(driver);
    }
        	
	public BottomLinkValidate clickBottomLink() {
		
		return new BottomLinkValidate(driver);
	}
	
	public MenuTitles menu() {
		
		return new MenuTitles(driver);
	}
	
	public AddAnItems addItemToCart() {
		
		return new AddAnItems(driver);
	}
	
	
	
	
}
