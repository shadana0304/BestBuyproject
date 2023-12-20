package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
   //test case for headless browser
public class TC011_HeadlessBrowser {
	
	 public WebDriver driver;

		@Test
		public void verifyTitle() {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		driver=new ChromeDriver(options);
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//a[@class='us-link'])[1]")).click();
		String acutal=driver.getTitle();
		String excepted="Best Buy | Official Online Store | Shop Now & Save";
		Assert.assertEquals(acutal, excepted);
		System.out.println("Title are match");
		driver.close();
		}
}
