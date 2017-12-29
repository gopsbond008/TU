Feature: Checkout


  Scenario: Checkout Standard Delivery
    Given I am on homepage
    And I Navigate to LogIn Page
    And I enter username as "sainsbury.clothing@gmail.com" and password as "Password1234"
    When I search for the product "shoes"
    And I add a product to basket
    And I go to Delivery page
    And I select home delivery option in delivery options page
    And I select delivery address in delivery address page
    And I review the order in order summary page
    And I select billing address and terms and condition
    And I go to payment page
    And I enter payment details and proceed
    Then I should see orderconfirmation page










