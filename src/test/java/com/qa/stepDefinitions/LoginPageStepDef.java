package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.factory.DriverFactory;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {

   
	
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
   // private WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));


    

    @Given("user is in base page")
    public void user_is_in_base_page() {
        loginPage.acceptCookies();
        String pageTitle = loginPage.getPageTitle();
         System.out.println(pageTitle);
        Assert.assertEquals(pageTitle,"My Account Login | Claire's US");
    }

    @Given("chooses the country it navigates to login page")
    public void chooses_the_country_it_navigates_to_login_page() throws InterruptedException {
        loginPage.chooseCountry();
        Thread.sleep(2000);
        loginPage.navigateToLogin();
        Thread.sleep(2000);
        String pageTitle = loginPage.getPageTitle();
        System.out.println(pageTitle);
    
       // Assert.assertEquals(pageTitle, "Expected Login Page Title", "Login page title mismatch!");
    }

    @Given("user is in login page")
    public void user_is_in_login_page() {
        String pageTitle = loginPage.getPageTitle();
        System.out.println(pageTitle);
        
        //Assert.assertEquals(pageTitle, "Expected Login Page Title", "Login page title mismatch!");
    }

    @When("user enters the valid username {string} and password {string}")
    public void user_enters_the_valid_username_and_password(String username, String password) {
        loginPage.performLogin(username, password);
      
    }

    @Then("it navigates to product page")
    public void it_navigates_to_product_page() {
        String pageTitle = loginPage.getPageTitle();
        System.out.println(pageTitle);
        
      //  Assert.assertEquals(pageTitle, "My Account Login | Claire's US", "Product page title does not match!");
    }
}