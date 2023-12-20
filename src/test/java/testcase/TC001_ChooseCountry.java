package testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC001_ChooseCountry extends ProjectSpecification {
       @Test
       public void clickCountry() throws IOException {
    	   new HomePage(driver)
    	   .capture("Home Page");
       }
}
