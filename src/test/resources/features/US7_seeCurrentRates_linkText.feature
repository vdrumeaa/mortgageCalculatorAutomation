
Feature: As a user, I should be able to see the page title “Mortgage Calculator - Free House Payment Estimate | Zillow”
  after clicking link text “See current rates” above the interest rate input box

  Scenario: See correct current page title after clicking link text “See current rates”
    Given I am on the mortgage calculator page
    When I click the link text See current rates
    Then I should see the page title "Mortgage Calculator - Free House Payment Estimate | Zillow"



