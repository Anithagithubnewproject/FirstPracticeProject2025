package com.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.utils.ElementUtils;

public class LoginPage {
    private ElementUtils eleutil;
    
    public LoginPage(WebDriver driver) {
        this.eleutil = new ElementUtils(driver);
        
    }

    // Locators
    private By accountLink = By.xpath("(//p[contains(text(),'My Account')])[1]");
    private By acceptCookiesBtn = By.xpath("//button[contains(text(),'Accept All Cookies')]");
    private By signInLink = By.xpath("(//p[contains(text(),'Sign In')])[1]");
    private By countryButton = By.cssSelector("#localeSelectorButton");
    private By usernamefield = By.cssSelector("#dwfrm_login_username");
    private By passwordfield = By.cssSelector("#dwfrm_login_password");
   // private By submitSignInBtn = By.xpath("//button[contains(text(),'Sign In')]");

    // Methods for interacting with the page

    // Get page title
    public String getPageTitle() {
        return eleutil.getPageTitle();
    }

    // Accept cookies
    public void acceptCookies() {
        eleutil.doClick(acceptCookiesBtn);
       
    }

    // Choose the country
    public void chooseCountry() throws InterruptedException {
    	 eleutil.doClick(countryButton);
    	
       
    }

    // Navigate to the login page
    public void navigateToLogin() {
    	 eleutil.doClick(acceptCookiesBtn);
    	 eleutil.doClick(accountLink); 
    	  eleutil.doClick(signInLink);
    }

    // Perform login
    public void performLogin(String username, String password) {
    	
    	eleutil.doSendKeys(usernamefield,username);
    	eleutil.doSendKeys(passwordfield, password);
    }
}