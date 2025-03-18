package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.factory.DriverFactory;
import com.qa.pages.AccountsPage;

import io.cucumber.java.en.Then;

public class AccountPageSteps {
	
	AccountsPage acp= new AccountsPage(DriverFactory.getDriver());
	
	
		
	@Then("the user checks the accout headers")
	public void the_user_checks_the_accout_headers() {
		String title=acp.pageTitle();
		System.out.println(title);
		acp.getHeadersList();
		Assert.assertEquals(title,"Register A New Account | Claire's US");
	    
	}

}
