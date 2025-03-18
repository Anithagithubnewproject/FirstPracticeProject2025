package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.utils.ElementUtils;

public class AccountsPage {
	private ElementUtils utils;
	
	By headerlist =By.xpath("//h2[contains(text(),'Account')]/..//ul/li/a/h3");
	
	public AccountsPage(WebDriver driver){
		this.utils=new ElementUtils(driver);
		
	}
	
	public String pageTitle() {
		return utils.getPageTitle();
	}
	
	public void getHeadersList() {
		utils.getListofElements(headerlist);
	}
	
	

}
