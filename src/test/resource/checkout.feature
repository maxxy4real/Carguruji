@ignore
Feature: Checkout Test

  Scenario: As a user I want to Login, search for item, make payment and complete my ordder
    Given I am on the homepage
    And I click on the sign in link
    When I enter my email "jraphael@gmail.com" in the email field
    And I enter my password "Friday24" in the password field
    And I click the login button
    And I search for dress
    And I select dress from the list
    And I add item to cart
    And proceed to checkout
    And view summary and proceed to checkout
    And I click check box to accept terms of service and click Pay
    And I choose check as payment method
    And I click confirm order
    Then I verify order is complete and successful
    And I sign out
