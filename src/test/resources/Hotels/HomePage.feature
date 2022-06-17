Feature: Destination Error

  Background:
    Given I am on Hotels.com

  Scenario: Verify destination error is displayed if search with no destination
#    Given I am on Hotels.com
    When I click search button
    Then I verify destination error is displayed

  Scenario: Verify enter-children's age error is displayed as soon as user add a child
  and, error is NOT displayed as soon user enters children's age
  After click Search button

#    Given I am on Hotels.com
    When I click on Travelers Box
    And I add number of children
    Then I verify the age error is displayed
    When I add the children's age
    And I verify the age error is not displayed
    Then I click on Done button
    And I get the text from Travelers box
    When I enter the destination
    And I click search button
    Then I verify numbers of travelers before and after is the same



