@FirstExample
Feature:Basic Syntax

	@FirstScenario @SmokeTest
	Scenario: Basic test for Selenium
		Given the user is on the TS homepage
		When the user clicks on the About Us link
		Then the user is redirected to the About Page