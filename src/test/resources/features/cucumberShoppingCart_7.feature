#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Launch the Application

  @tag.tag1
  Scenario: User opens home page and updates currency to pound
    Given User opens URL
    And User updates currency to pound
    When User waits for element to load
    Then currency should be updated to pound

  @tag.tag2
  Scenario: Try to order a canon EOS 5 D camera 
    Given User try to find canon camera link
    And User click on Camera link
		When User waits for element to load
    Then Camera link is open
   
  @tag.tag3
  Scenario: Add to Cart 
    Given Add to cart button is displayed
    And  User click on Add to cart button
    When User waits for element to load
    Then Error message is displayed
   
    @tag.tag4
    Scenario: User click on home page and try to add iphone to Cart 
    Given User click on home page button
    When User waits for element to load
    And User click on iphone link
    When User waits for element to load
    And User change the quantity to two 
    When User click on add to cart button
    When User waits for element to load
    Then success message is displayed
    
    @tag.tag5
    Scenario: user click on View cart 
    Given user click on black color cart icon
    And click on view cart button
    And Change the quantity of iphone to 3
     When User waits for element to load
     Then click on update button
     
     
     
     @tag.tag6
     Scenario: User calculate the amount and checkout
    Given user click on Eco_tax button
    And user click on Vat button
    When User waits for element to load
    When user click on checkout button 
    Then print the error message
    Then user click on remove button and iphone is removed from the cart
    
    @tag.tag7
    Scenario: User adds Mac Book to the cart and verifies success message
    Given user click on mac book link
    And user check quntity is 1 
    And user click on add to cart button
    When User waits for element to load
    Then user verify success message
    
   @tag.tag8
   Scenario: User applys coupon code and print error message
   Given User click on the shopping cart link 
    And user click on use coupon code button
    When User waits for element to load
    And user click on coupon code text box and enter coupon code
    When user click on apply coupon button
    Then coupon code error message is displayed
    
    
  @tag.Tag9
  Scenario: User appays Gift Certificate code and print error message
   Given User clicks on the gift certificate button
   When User waits for element to load
   And User click on gift certificate text box and enter the code
   And user click on apply gift certificate button 
   When User waits for element to load
   Then gift certificate error message is displayed  
    
   
   @tag.tag10
   Scenario: User clears Coupon Code_Gift Certificate Code and proceeds to check out 
   Given User clear coupon code
   When User waits for element to load
   And User clear gift certificate code
   When User waits for element to load
   Then User click on mac book check out button
   When User waits for element to load
   
   
   @tag.tag11
   Scenario: User enters all payment Details
   Given User click on checkout option continue button
   And User enter first name
   And User enter last name 
   And User enter email
   And User enter telephone number
   And User enter passward
   And User enter confirm passward
   And User enter company name
   And User enter address1
   And User enter address2
   And User enter city name
   And User enter post code
   And User enter state
   And User enter newsletter 
   And User click on agree button
   And User click on register button
   When User waits for element to load
   And User click on billing details
   And User click on billing continue
   When User waits for element to load
   
   @TAG.TAG12
   Scenario: User proceeds for Payment
   Given user adds comment 
   When User waits for element to load
  When clicks on payment continue button
   When User waits for element to load
  Then user checks the error message for payment method 
  
  @tag.tag13
  Scenario: User contacts to seller
  Given user clicks on contact us hyperlink
  When User waits for element to load
  And user enters comments
  When submit a contact request
  Then click submit button to end
  Then User quites the browser
   