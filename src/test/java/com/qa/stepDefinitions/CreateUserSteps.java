package com.qa.stepDefinitions;

import java.util.List;
import java.util.Map;

import com.qa.factory.DriverFactory;
import com.qa.pages.CreateUserPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;


public class CreateUserSteps {
	
	CreateUserPage createuserpage= new CreateUserPage(DriverFactory.getDriver());
	
	
	@Then("the user enter the register details")
	public void the_user_enter_the_register_details(DataTable dataTable)  {
		
		 List<Map<String, String>> userData = dataTable.asMaps(String.class, String.class);
	        String firstName = userData.get(0).get("firstname");
	        String lastName = userData.get(0).get("lastname");
	        String email = userData.get(0).get("email");
	        String country = userData.get(0).get("country");
	        String postcode = userData.get(0).get("postcode");
	        String mobile = userData.get(0).get("mobile");
	        String password = userData.get(0).get("password");
	        String confirmPassword = userData.get(0).get("confirmpassword");
	        
	        createuserpage.registeruserdetails(firstName,lastName,email, country, postcode, mobile, password, confirmPassword);
	        createuserpage.dosignupclick();
	         
	}
   

    }


