package com.qa.stepDefinitions;

import com.qa.factory.DriverFactory;
import com.qa.pages.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class RegisterPageSteps {

    
    
    private RegisterPage registerPage = new RegisterPage(DriverFactory.getDriver());

    

    @Given("user enters the valid day {string} month {string} and year {string}")
    public void user_enters_valid_day(String day, String month, String year) throws InterruptedException {
        Thread.sleep(2000);
        registerPage.dateSignup(day, month, year);
        
        
    }

    @Then("the page navigates to the registerpage")
    public void page_navigates_to_register_page() {
        String actualTitle = registerPage.getPageTitle();
        System.out.println(actualTitle);
        

       // String expectedTitle = "Expected Register Page Title";  // Replace with actual expected title
       // Assert.assertEquals(actualTitle, expectedTitle, "Register page title mismatch!");
    }
}
