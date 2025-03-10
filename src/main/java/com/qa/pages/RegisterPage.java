package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.utils.ElementUtils;

public class RegisterPage {
	private ElementUtils eleutil;
	
	
	private By dayfield = By.cssSelector("#dwfrm_profile_customer_day");
	private By monthfield=By.cssSelector("#dwfrm_profile_customer_month");
	private By yearfield=By.cssSelector("#dwfrm_profile_customer_year");
	private By datesubmitbutton=By.cssSelector(".create-account");
	
	 public RegisterPage(WebDriver driver) {
		this.eleutil= new ElementUtils(driver);
	        
	    }
	 public String getPageTitle() {
		 return eleutil.getPageTitle();
	 }
	
	    // Navigate to the login page
	    
	 public void dateSignup(String day,String month,String year) throws InterruptedException {
		
		 Thread.sleep(2000);
		 eleutil.doSendKeys(dayfield,day);
		 eleutil.doSendKeys(monthfield,month);
		 eleutil.doSendKeys(yearfield, year);
		
		 eleutil.doClick(datesubmitbutton);
	 }
	 
	
	

}
