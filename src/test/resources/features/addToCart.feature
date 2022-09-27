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
Feature: Add To Cart_Camera

  @tag1
  Scenario: Try to order a canon EOS 5 D camera 
    Given User try to find canon camera link
    And User click on Camera link
		When User waits for element to load
    Then Camera link is open
   
  @tag2
  Scenario: Add to Cart 
    Given Add to cart button is displayed
    And  User click on Add to cart button
    Then Error message is displayed

  