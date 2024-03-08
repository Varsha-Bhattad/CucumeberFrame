@Product
Feature: Application Products Page


@Test4
Scenario Outline: Hamburger menu
Given User login into application with "<Username>" and password "<Password>"
When  User clicks on login button
Then  User clicks on hamburger menu
And   User should see all the items


Examples:

|Username      | Password    |
|standard_user | secret_sauce|

@Test5
Scenario Outline: Dropdown menu 
Given User login into application with "<Username>" and password "<Password>"
When  User clicks on login button
Then  User clicks on dropdown menu with filter icon


Examples:

|Username      | Password    |
|standard_user | secret_sauce|


@Test6
Scenario Outline: Add to cart
Given User login into application with "<Username>" and password "<Password>"
When  User clicks on login button
Then  User clicks on dropdown menu with filter icon
Then  User adds "<products>" to the cart
And   products will be added to the cart 

Examples:

|Username      | Password    |products|
|standard_user | secret_sauce|Test.allTheThings() T-Shirt (Red),Sauce Labs Onesie,Sauce Labs Fleece Jacket,Sauce Labs Bolt T-Shirt|


@Test7
Scenario Outline: Remove product from cart
Given User login into application with "<Username>" and password "<Password>"
When  User clicks on login button
Then  User clicks on dropdown menu with filter icon
Then  User adds "<products>" to the cart
And   products will be added to the cart 
And   User removes the "<product>" from the cart

Examples:

|Username      | Password    |products|
|standard_user | secret_sauce|Test.allTheThings() T-Shirt (Red),Sauce Labs Onesie,Sauce Labs Fleece Jacket,Sauce Labs Bolt T-Shirt|


@Test8
Scenario Outline: Checkout
Given User login into application with "<Username>" and password "<Password>"
When  User clicks on login button
Then  User clicks on dropdown menu with filter icon
Then  User adds "<products>" to the cart
And   products will be added to the cart 
And   User removes the "<products>" from the cart
And   User clicks on checkout 


Examples:


|Username      | Password    |products|
|standard_user | secret_sauce|Test.allTheThings() T-Shirt (Red),Sauce Labs Onesie,Sauce Labs Fleece Jacket,Sauce Labs Bolt T-Shirt|










  
  
   
 



















