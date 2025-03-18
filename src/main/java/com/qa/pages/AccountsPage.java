package com.qa.pages;

import org.openqa.selenium.WebDriver;

import com.qa.utils.ElementUtils;

public class AccountsPage {
	private WebDriver driver;
	private ElementUtils utils;
	
	public AccountsPage(WebDriver driver,ElementUtils utils){
		this.driver=driver;
		this.utils=utils;
		
	}
	
	public String pageTitle() {
		return utils.getPageTitle();
	}
	
	

}
