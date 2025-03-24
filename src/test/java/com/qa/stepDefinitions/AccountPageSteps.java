package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.factory.DriverFactory;
import com.qa.pages.AccountsPage;

import io.cucumber.java.en.Then;

public class AccountPageSteps {
	
	AccountsPage acp= new AccountsPage(DriverFactory.getDriver());
	
	
		
	@Then("the user checks the menu bar")
	public void the_user_checks_the_menu_bar() {
		String title=acp.pageTitle();
		System.out.println(title);
		acp.getHeadersList();
		acp.getMenuDetails();
		Assert.assertEquals(title,"Claire's Rewards Dashboard | C.CLUB | Claire's US");
	    
	}

	@Then("the user clicks the shopnow")
	public void the_user_clicks_the_shopnow() throws InterruptedException 
	{
		acp.clickShopNow();
		String title=acp.pageTitle();
		System.out.println(title);
		
	
	    
	}

}
