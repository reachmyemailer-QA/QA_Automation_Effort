# Login Feature
# Author: Anas
# Description: Verify the login functionality of the application.

Feature: Login Functionality

  As a registered user
  I want to log into the application
  So that I can access my dashboard

  # Valid Login Scenario
@Positive
@Smoke
@Sanity
@Regression
  Scenario: LOGIN_001 - Verify Login with valid credentials
    Given the user is on the Login page of saucedemo
    When the user enters username "standard_user" and password "secret_sauce" and click login button
    Then the user should be redirected to the Dashboard_Hompage
    
@Negative    
   Scenario: LOGIN_002 - Verify login with invalid username
    Given the user is on the Login page of saucedemo
    When the user enters invalid username "standard_userss" and invalid password "secret_sauce123" and click login button
    Then the user should get error message
    
 
    
    

 