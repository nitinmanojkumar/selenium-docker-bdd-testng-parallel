@DataTables
Feature: Data tables

	Background: Hey
		Given I navigate to the login page
		When I submit username and password
		

  Scenario: Successful Login with Valid Credentials
		Given User is on Home Page
		When User Navigate to LogIn Page
		And User enters Credentials to LogIn
		| Username   | Password |
    | testuser_1 | Test@1 |
    | testuser_2 | Test@2 |
		Then Message displayed Login Successfully



