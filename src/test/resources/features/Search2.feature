@Search2
Feature: Duck Duck Go Search2

	Background: Hey
		Given I navigate to the login page
		When I submit username and password
		Then I should be logged in 

  Scenario Outline: I want to search on duck-duck-go site from Search2 feature
    Given I ama on the website duck-duck-go
    And   I entera the "<keyword>" to search
    And   I entera the "<keyword1>" to search
    And   I navigatea to videos search
    Then  I shoulda get minimum 2 search results

  Examples:
    | keyword    |
    | docker1    |				
		| docker2    |
		| docker2    |


