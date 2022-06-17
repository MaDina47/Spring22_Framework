# Sprint 2 TC 26

Feature: Deals

#  Background:
#    Given I launch Hotels.com

  Scenario: Verify links on Deals page
    Given I launch Hotels.com/deals
#    When Using “More travel” go to "Deals" page
    Then I verify “Manage your booking anytime, anywhere” is displayed and enabled
    Then I verify “Stay Flexible with free cancellation” is displayed and enabled
    Then I verify “Save on your next trip to the great outdoors” is displayed and enabled
    When I click on Manage your booking anytime anywhere
    Then I verify “Search, book and Save on the go!” title is displayed
    When I go back
    And I click on “Stay Flexible with free cancellation”
    Then I verify “Amazing deals with free cancellation” OR “Stay Flexible with free cancellation” title is displayed
    When I go back
    And I click on “Save on your next trip to the great outdoors”
    Then I verify “Save on your next trip to the great outdoors” title is displayed