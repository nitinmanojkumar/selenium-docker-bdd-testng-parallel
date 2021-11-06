@Webdriver
Feature: Duck Duck Go Search

	Background: Hey
		Given I navigate to the login page
		When I submit username and password
		Then I should be logged in 

  Scenario Outline: I want to search on duck-duck-go site
    Given I am on the website duck-duck-go
    And   I enter the "<keyword>" to search
    And   I navigate to videos search
    Then  I should get minimum 2 search results

  Examples:
    | keyword    |
    | test1      |
    | test2      |
    | test2      |

