package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class MenuTitles extends ProjectSpecification {
	
	// element are located by using @Findby annotation
	@FindBy(xpath="//a[text()='Holiday Deals']")
	WebElement holidaydeals;
	
	@FindBy(xpath="(//a[text()='Gift Cards'])[2]")
	WebElement giftcard;
	
	@FindBy(xpath="(//li[@aria-hidden='false'])[3]")
	WebElement giftideas;
	
	@FindBy(xpath="(//li[@aria-hidden='false'])[4]")
	WebElement topdeals;
	
	@FindBy(xpath="(//li[@aria-hidden='false'])[5]")
	WebElement dealofday;
	
	@FindBy(xpath="(//li[@aria-hidden='false'])[6]")
	WebElement bestbuysells;
	
	@FindBy(xpath="(//a[text()='My Best Buy Memberships'])[1]")
	WebElement membership;
	
	@FindBy(xpath="(//a[text()='Credit Cards'])")
	WebElement card;
	
	//@FindBy(xpath="//span[text()='More']")
	//WebElement more;
			
	@FindBy(xpath="(//a[text()='Donate to St. Jude'])[2]")
	WebElement donate;
	
	/*@FindBy(xpath="(//a[text()='Best Buy Outlet'])[2]")
	WebElement bestoutlet;
	
	@FindBy(xpath="(//a[text()='Best Buy Business'])[2]")
	WebElement bestbusiness;*/
	
	//constructor initialization
	public MenuTitles(WebDriver driver) {		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public MenuTitles clickHolidayDeals(String expected) {
		
		click(holidaydeals);
		validateTitle(expected);
		back();
		return this;
	}
	
	public MenuTitles clickGiftcard(String expected) {
		click(giftcard);
		validateTitle(expected);
		back();
		return this;
	}
	
	public MenuTitles clickGiftIdea(String expected) throws InterruptedException {
		sleep();
		click(giftideas);
		validateTitle(expected);
		back();
		return this;
	}
	
	public MenuTitles clickTopDeals(String expected) {
		
		click(topdeals);
		validateTitle(expected);
		back();
		return this;
	}
	
	public MenuTitles clickDealOfDay(String expected) {
		click(dealofday);
		validateTitle(expected);
		back();
		return this;
	}
	
	public MenuTitles clickBestBuysell(String expected) {
		click(bestbuysells);
		validateTitle(expected);
		back();
		return this;
	}
	
	public MenuTitles clickBestBuyMembership(String expected) {
		click(membership);
		validateTitle(expected);
		back();
		return this;
	}
	
	public MenuTitles clickCreditCards(String expected) {
		click(card);
		validateTitle(expected);
		back();
		return this;
	}

	public MenuTitles clickMoreLink4(String expected) {
		click(donate);
		validateTitle(expected);
		back();
		return this;
	}
	
	/*public MenuTitles clickMoreLink5(String expected) {
		click(bestoutlet);
		validateTitle(expected);
		back();
		return this;
	}
	
	public MenuTitles clickMoreLink6(String expected) {
		click(bestbusiness);
		validateTitle(expected);
		back();
		return this;
	}*/
	
}
