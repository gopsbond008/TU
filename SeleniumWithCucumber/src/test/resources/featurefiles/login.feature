Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given I am on homepage
    And I Navigate to LogIn Page
    And I enter username as "sainsbury.clothing@gmail.com" and password as "Password1234"
    Then I should see Login Successfully page

