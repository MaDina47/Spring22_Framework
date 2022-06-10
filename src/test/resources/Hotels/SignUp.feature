
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