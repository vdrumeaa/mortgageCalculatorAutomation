Feature: As a user, I would like to type special characters in the Interest Rate input box

  Scenario: If the user types any special characters in the Interest Rate input box, an error message will be displayed

    Given  I am on the mortgage calculator page
  When I clear the Interest Rate input box
  And I type special character "*" into Interest rate input box
  And I click outside the input box Interest rate
  Then I will see the error message "'*' is not a valid number" is displayed