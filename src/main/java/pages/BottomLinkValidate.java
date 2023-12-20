package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class BottomLinkValidate extends ProjectSpecification{
	
	// element are located by using @Findby annotation
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	WebElement termcondition;
	
	//constructor initialization
	public BottomLinkValidate(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	public BottomLinkValidate navigateToBottom() {
		moveToElement(termcondition);
		click(termcondition);
		return this;
		}
	
	public BottomLinkValidate verifyTermsAndConditions(String expected) {
		validateTitle(expected);
		return this;
		
		
	}
}