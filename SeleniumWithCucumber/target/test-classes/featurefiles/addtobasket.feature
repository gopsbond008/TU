Feature: Add product to basket


#  Scenario Outline: Add single product to basket
#    Given I am on homepage
#    When I search for the product "<SearchTerm>"
#    Then I should see "<SearchTerm>" in search result page
#    And I select product from search result page
#    And I should see product details page
#    And I add product to basket
#    Then I should see products in basket
#
#    Examples:
#      |SearchTerm |
#      |130513031  |


    @multi
  Scenario: Add Multiple products to basket
    Given I am on homepage
    When I add multiple products to basket via search
      |Products Code |132344454   |
      |Products Type |boots       |
      |Products Brand|TU          |


      Then I should see products in basket

