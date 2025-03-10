Feature: Validate the login functionality

Background: Given user is in base page 
						And chooses the country it navigates to login page

Scenario: Validate Login Functionality with valid credentials
					Given user is in login page
					When user enters the valid username "testrail@yopmail.com" and password "Test@123"
					Then it navigates to product page
