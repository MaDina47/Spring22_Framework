#TC17
Feature: Disabled dates in calendar
  Background:
    Given I launch Hotels.com
  Scenario: Verify past date and back button on Current month's calendar is disabled

     When I click on Check-in Calendar
     Then I verify past dates if any are disabled
      And I verify back button on current month is disabled
     When I click on Done button on calendar
      And I click on Check-out Calendar
    Then I verify past dates if any are disabled
    And I verify back button on current month is disabled


