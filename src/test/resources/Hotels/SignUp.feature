
#20
Feature: Terms and Conditions and Privacy Statement
  Background:
    Given I launch Hotels.com

  Scenario:  Verify TermsAndConditions link and PrivacyStatements link open correct page on new tab

  When I click on “Sign in” button
   And I click Sign up link in opened menu bar
   And I click “Terms and Conditions” link
  Then I verify “Terms and Conditions” page opens in new tab
  When I click “Privacy Statement” link
    Then I verify “Privacy Statement” page opens in new tab


#Sprint 2 TC 22
  Scenario: Verify error message for invalid data in SignUp form

    When I click on “Sign in” button
    And I click Sign up link in opened menu bar
    And Enter signup email (#!@###) in signup window
    When Enter invalid first name (!@)
    When Enter invalid last name (%^&)
    When Enter password @@@@@@
    Then I verify error is displayed Enter a valid email address
    Then I verify error is displayed First name cannot contain special characters
    Then I verify error is displayed Last name cannot contain special characters
    Then I verify “Keep me signed in” checkbox is displayed and enabled
    Then I verify Continue button is displayed and disabled