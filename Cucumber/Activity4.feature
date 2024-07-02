@activity4
Feature: Data driven test without Example

	@loginTest @loginSuccess
	Scenario: Testing with correct data from inputs
		Given the user is on the login page
		When the user enters "admin" and "password"
		And clicks on Submit button
		Then get the confirmation text and verify message as "Welcome Back, admin"