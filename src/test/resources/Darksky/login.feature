Feature: Login to Darksky

  Scenario: Verify the date in TimeMachine is matching current date
    Given I am on Darksky.com
    When I scroll down to TimeMachine Button
     And I click on TM button
    Then I verify the date in TimeMachine is matching current date
     And I quit Darksky.com

  Scenario: Verify same temperature values are displayed in the Today's data
    Given I am on Darksky.com
    When I scroll down to Today tab
     And I click on Today tab
    Then I verify same temperature values are displayed in the Today's data
     And I quit Darksky.com
