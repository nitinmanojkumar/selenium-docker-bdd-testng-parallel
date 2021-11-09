@Background
Feature: Background feature

	Background: Background bg
		Given User is on Home Page
	
  Scenario Outline: Background scenaio outline
    Given User is on Home Page
    And I am testing the keyword "<keyword>"

	@BG
  Examples:
    | keyword    |
    | regr1      |
    | regr2      |
    | regr2      |

	
