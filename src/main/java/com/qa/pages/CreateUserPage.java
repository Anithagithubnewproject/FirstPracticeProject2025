package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.utils.ElementUtils;

public class CreateUserPage {
	private ElementUtils utils;

	public CreateUserPage(WebDriver driver) {
		utils = new ElementUtils(driver);

	}

	private By firstname = By.cssSelector("#dwfrm_profile_customer_firstname");
	private By lastname = By.cssSelector("#dwfrm_profile_customer_lastname");
	private By email = By.cssSelector("#dwfrm_profile_customer_email");
	private By country = By.cssSelector("#dwfrm_profile_address_country");
	private By postalcode = By.cssSelector("#dwfrm_profile_address_postal");
	private By mobile = By.cssSelector("#dwfrm_profile_customer_phone");
	private By password = By.cssSelector("#dwfrm_profile_login_password");
	private By confirmpassword = By.cssSelector("#dwfrm_profile_login_passwordconfirm");
	private By firstcheckbox = By.xpath("//label[@for='consent-email']");
	private By createsignup = By.name("dwfrm_profile_confirm");
	//private By acceptCookiesBtn = By.xpath("//button[contains(text(),'Accept All Cookies')]");

	public String getPageTitle() {
		return utils.getPageTitle();
	}

	public void registeruserdetails(String fn, String ln, String em, String countr, String postcode, String mob,
			String pwd, String confirmpwd)  {
		
		utils.doSendKeys(firstname, fn);

		utils.doClick(confirmpassword);
		utils.doSendKeys(lastname, ln);

		utils.doSendKeys(email, em);

		utils.doClick(country);
		utils.selectByVisibleText(country, countr);

		utils.doSendKeys(postalcode, postcode);
		utils.doSendKeys(mobile, mob);

		utils.doSendKeys(password, pwd);

		utils.doSendKeys(confirmpassword, confirmpwd);

	}

	public void dosignupclick() {
		utils.doClick(firstcheckbox);		
		utils.doClick(createsignup);

	}

}
