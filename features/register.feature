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
Feature: Registration feature
  This is demosite registration page having multiple fields and logos

  @tag1
  Scenario: Positive registration scenario
    When User needs to enter the following fields
    |FirstName|Sathish|
    |LastName|Reddy|
    |Address|SR Nagar Hyderabad|
    |email|sathishreddysandhi1995@gmail.com|
    |Phone|8096130929|
    And User needs to select Gender 
    |Gender|Male|
    And User needs to select Hobbies
    |Hobbies|Cricket|
    And User needs to select Languages 
    |Languages|English|
    And User needs to select Skills
    |Skills|C|
    And User needs to select Country
    
    |Country|Select Country|
    
    |SelectCountry|India|
    
    And User needs to select DOB
    |Year|1995|    
    |Monthh|February|
    |Day|6|
    
    And User needs to select passwordandConfirmPassword 
    |Password|Hello@123|
    |ConfirmPassword|Hello@123|
    And User needs to select FileUpload 
    
    |FileUpload|C:\Users\SSANDHI\Pictures\Screenshots\Screenshot (1).png|
    And User needs to click on submit button
    
    Then User gets succesful membership email
    
    
    

  