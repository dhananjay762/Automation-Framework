#Author: your.email@your.domain.com
@login
Feature: Verify the Login Functionality
  I want to check whether user can login to application

  @userLogin
  Scenario: Login with valid user
    Given User navigates to the application
    When  I enter the username "admin@phptravels.com" and password "demoadmin"
    And  I click on login

