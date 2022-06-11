#TC 19
  Feature: Feedback

    Background:
      Given I launch Hotels.com

    Scenario: Verify Share feedback button is displayed at the end of search results

    When Enter bora in destination
      And I select Bora Bora, Leeward Islands, French Polynesia from auto suggestion
      And I select 1 August 2022 as check-in
      And I select 10 August 2022 as check-out
      And I click apply
      And I click search button
     Then I verify text: Tell us how we can improve our site is displayed
     And I verify Button Share feedback is displayed and enabled

      #TC 24
Scenario: Verify error is displayed when user submits the empty feedback form

    When I click on “Sign in” button
      And I select “Website feedback” from Help dropdown
      And I click on Submit button
    Then I verify error message is displayed Please fill in the required information highlighted below
      And I verify star boxes section is in a red dotted box