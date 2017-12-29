Feature: Change Password

  Scenario: Change Password
    Given I am on homepage
    And I Navigate to LogIn Page
    And I enter username as "sainsbury.clothing@gmail.com" and password as "Password1234"
    Then I should see Login Successfully page
    When I navigate to my account page
    And I select change password link
    And I enter old "Password1234" new "Password1234" and confirm "Password1234" to change password
    Then I should see change password confirmation page

#  Scenario: Change Password
#    Given I am on homepage
#    And I Navigate to LogIn Page
#    And I enter username as "sainsbury.clothing@gmail.com" and password as "Password1234"
#    Then I should see Login Successfully page
#    When I navigate to my account page
#    And I select change password link
#    And I enter old, new and confirm password to change password
#      |OldPassword| |Password1234|
#      |NewPassword| |Password1234|
#    Then I should see change password confirmation page