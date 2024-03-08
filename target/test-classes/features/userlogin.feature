@Login
Feature: Login functionality


@Test1 
Scenario Outline: User logs in with valid credentials
Given User login into application with "<Username>" and password "<Password>"
When  User clicks on login button



Examples:

|Username      | Password    |
|standard_user | secret_sauce|


@Test2
Scenario Outline: User logs in with invalid credentials
Given User login into application with "<Username>" and password "<Password>"
When  User clicks on login button

Examples:

|Username    | Password  |
|standard_us | secret_sau|


@Test3
Scenario Outline: User logs in with invalid credentials
Given User login into application with "<Username>" and password "<Password>"
When  User clicks on login button

Examples:

|Username      | Password  |
|standard_user | secret_sau|











  
  
   
 



















