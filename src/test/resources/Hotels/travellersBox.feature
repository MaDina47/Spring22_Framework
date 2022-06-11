
# TC 18
Feature: Traveler Box
  Background:
    Given I launch Hotels.com

  Scenario:  Verify user can update number of guests on Home page
    When I click on Travelers
     And I select “Adults as 4
     And I select “Children” as 2
     And I select first child age: 4
     And I select second child age: Under 1
     And I click Done
    Then I verify total number of guests in sum of adults and children as same as selected on step #3 and #4.