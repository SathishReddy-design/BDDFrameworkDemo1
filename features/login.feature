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
@Login
Feature: GitHub Login feature
  This is GitHub Login featurefile

  @Positive
  Scenario: Positive Login scenario
    When User needs to enter "sathishreddysandhi1995@gmail.com" and "Raju@Rani12"
    And User need to click on Signin button
    And User is able to view their GitHub Account
    
   
    
    @tag2
  Scenario Outline: Negative Login scenario
    When User needs to enter "<uname>" and "<pwd>"
    And User need to click on Signin button
    Then User is  not able to view their GitHub Account
     
     Examples:
    |uname|pwd|
    |sathish|Raju@Rani12|
    |sathishreddysandhi1995@gmail.com|Raju|
    |sathishhh|Raju@Rani12|
    |Sathyam||
    
 
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
