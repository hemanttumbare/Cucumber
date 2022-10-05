
Feature: Selenium Locators
  I want to use this to practice Selenium Locators
  
  Background:
    Given Login to the site "https://demo.seleniumeasy.com/"

  @Locator
  Scenario: Practice Locators 
    When Locate elements by "xpath"
    And Locate elements by "css"
    And Locate elements by "name"
    And Locate elements by "id"
    And Locate elements by "tag name"
    And Locate elements by "tag name"
    Then Close Driver

 