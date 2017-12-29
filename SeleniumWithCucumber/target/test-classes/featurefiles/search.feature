@EJ-456
Feature: Search product
Background:
  Given I am on homepage

  Scenario Outline: Verify Search functionality with valid data sets
    Given I am on homepage
    When I search for the product "<SearchTerm>"
    Then I should see "<SearchTerm>" in search result page


    Examples:
    |SearchTerm |
    |Jeans      |
    |123456     |
    | TU        |
