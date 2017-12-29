Feature: Register New Customer


  Scenario Outline: Register below new customers
    Given I am on homepage
    And I Navigate to LogIn Page
    Given I go to register customer page
    And I register new customer "<email>", "<title>", "<firstName>", "<lastName>", "<password>", "<confirmPassword>"
    Then I should see registration confirmation page

    Examples:
      |email                | title | firstName | lastName | password     | confirmPassword |
      |email1@emai5l4567.com| Mr    | Chris     | White    | Password1234 | Password1234    |
      |email1@em99317834.com| Dr.   | Tom       | Gbara    | Password1234 | Password1234    |
      |email1@emaie1we34.com| Mrs   | Mandy     | Lan      | Password1234 | Password1234    |
      |email1@email212gg.com| Miss  | Flora     | Gilbart  | Password1234 | Password1234    |