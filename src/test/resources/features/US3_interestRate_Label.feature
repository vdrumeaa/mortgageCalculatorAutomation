Feature:  As a user, I should be able to see the label “Interest rate” above the interest rate input box

    Scenario: If the User navigates to the Mortgage Calculator page, he will be able to see the “Interest rate” text of the label

      Given I am on the Mortgage Calculator page
      When I navigate to interest rate input box
      Then I will see the "Interest rate" text of the label



