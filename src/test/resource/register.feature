@Register
Feature: Register

  Scenario: As a new user I want to create an account
    Given I am on the homepage
    And I click on the sign in link
    And I enter email address in the address field
    And I click create new account button
    And I click male gender
    And I enter first name in the name field
    And I enter last name in the name field
    And I check that email address in pre-populated
    And I enter password "Friday24"
    And I enter DOB Day "1" Month "July" Year "1986"
    And I enter Address details "Max Ltd" address "1" line "Park Road" city "Chicago" state "Illinois" zip "24378" country "United States"
    And I enter Additional Information "This is just a test"
    And I enter Home Phone number "0207 8876 920"
    And I enter Mobile Phone number "0794 8769 251"
    When I click the Register button
#    Then I am registered and logged in automatically
    And I sign out