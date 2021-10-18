@Smoke
Feature: User able to login with valid username & password

Description: "User login zoopla website & search the property &"
        "select  the  property as well as verify the property price." 
                                                  
Scenario: User login with valid username & verify the page title

Given User can open any browser
And User able to enter "https://www.zoopla.co.uk/" url
When User able to click on the signin  button
And  User enter the userName "shumisaif@yahoo.com" and password "sweethome2000"
And User click on the signing button
Then User able to verify successfully login & verify the homepage title
