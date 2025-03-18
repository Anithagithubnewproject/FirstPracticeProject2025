Feature: Accounts user functionality 
Background: Given user is in base page 
						And chooses the country it navigates to login page
Scenario Outline: Register a new user successfully
        Given user enters the valid day "08" month "09" and year "1993"
        Then the user enter the register details
        | firstname | lastname | email| country | postcode | mobile     | password  | confirmpassword |
       | <firstname> | <lastname> | <email>| <country> | <postcode> | <mobile>   | <password> | <confirmpassword> |
       Then the user checks the accout headers
         
        
Examples:
       | firstname | lastname | email                     | country | postcode | mobile     | password  | confirmpassword |
       | Myrin   | Myrish    |monris@yopmail.com   | United States | 90001    | 222 555 4567  | Test@123  | Test@123         |
       