# Sprint 2 TC 23

Feature: Sort and Filter

  Background:
    Given I launch Hotels.com

  Scenario: Verify filter-by and sort-by functionality works as expected
    When Enter Man in destination box
    And I select Manhattan NY from auto suggestion
    And I select 10-15 August 2022 in Dates Box
    And I click search button
    And I click on 5 star from star-rating filter
    And I select Price from sort-by dropdown
    Then I verify all hotels in search results are *-rated as selected in above step
    Then I verify all hotels are listed in increasing order price
