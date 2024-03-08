@Checkout
Feature: Checkout User information page

@Test9
Scenario Outline: Checkout User Information
Given User login into application with "<Username>" and password "<Password>"
When  User clicks on login button
Then  User clicks on dropdown menu with filter icon
Then  User adds "<products>" to the cart
And   products will be added to the cart 
And   User removes the product from the cart
And   User clicks on checkout 
And   User enters checkout information "<firstname>" "<lastname>" "<zipcode>"


Examples:


|Username      | Password    |products                                                                                            |firstname|lastname|zipcode|
|standard_user | secret_sauce|Test.allTheThings() T-Shirt (Red),Sauce Labs Onesie,Sauce Labs Fleece Jacket,Sauce Labs Bolt T-Shirt|Varsha   |Bhattad |123    |


@Test10
Scenario Outline: Checkout User Information
Given User login into application with "<Username>" and password "<Password>"
When  User clicks on login button
Then  User clicks on dropdown menu with filter icon
Then  User adds "<products>" to the cart
And   products will be added to the cart 
And   User removes the product from the cart
And   User clicks on checkout 
And   User enters checkout information "<firstname>" "<lastname>" "<zipcode>"
And   User clicks on continue and should be able to see checkout overview page
And   User clicks on finish

Examples:

|Username      | Password    |products                                                                                            |firstname|lastname|zipcode|
|standard_user | secret_sauce|Test.allTheThings() T-Shirt (Red),Sauce Labs Onesie,Sauce Labs Fleece Jacket,Sauce Labs Bolt T-Shirt|Varsha   |Bhattad |123    |










  
  
   
 



















