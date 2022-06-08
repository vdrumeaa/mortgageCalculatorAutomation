@wip
Feature: As a user, I should see error messages when I enter invalid values like (x>0 || x<101) into the “Interest rate” input box.

Background:
Given I am  on the mortgage calculator page

 Scenario Outline: As a user, I should see error messages when I enter values smaller than 0
   Given I am on the mortgage calculator page
   When I clear the input box
    And I enter "<string>" values
   And click empty space
   Then I should see error messages "Rate must be greater than or equal to 0"
   Examples:
     |string  |
     |-1   |
     |-2  |

  Scenario Outline: As a user, I should see error messages when I enter values greater than 100
    Given I am on the mortgage calculator page
    When I clear the input box
    And I enter "<string>" values
    And click empty space
    Then I should see error messages for values greater than one hundred "Rate must be less than or equal to 100"
    Examples:
      | string |
      | 101  |
      | 102  |


