@Address-New
Feature: Add New Address


  Scenario Outline: Add below new address
    Given I am on homepage
    And I Navigate to LogIn Page
    And I enter username as "sainsbury.clothing@gmail.com" and password as "Password1234"
    Then I should see Login Successfully page
    When I navigate to my account page
    And I select address book link
    And I add new address  "<title>", "<firstName>", "<lastName>", "<houseNo>", "<postCode>"
    Then I should see add new address confirmation page

    Examples:
      |title | firstName | lastName | houseNo | postCode |
      | Mr   | Chris     | White    | 24A     | EN6 3BA  |
      | Dr.  | Tom       | Gbara    | 24B     | EN6 3BA  |
      | Mrs  | Mandy     | Lan      | 25A     | EN6 3BA  |
      | Miss | Flora     | Gilbart  | 26A     | EN6 3BA  |