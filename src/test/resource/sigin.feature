Feature: Sign in

  Scenario Outline: User able to login successfully
    Given I am on the homepage
    And I click on the sign in link
    When I enter my email "<email>" in the email field
    And I enter my password "<password>" in the password field
    And I click the login button
    Then I verify that I am logged in
    And I sign out

    Examples:
    |  email                 |   password   |
    | jraphael@gmail.com     | Friday24     |
#    | maxtest227@gmail.com   | Today1       |
#    | davin.riches@gmail.com | Today01      |
