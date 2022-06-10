#TC 21
  Feature: SignIn/SignUp
    Background:
      Given I launch Hotels.com

 Scenario: Verify Verification message for invalid sign in credentials

   When I click on “Sign in” button
    And I click Sign in link in opened menu bar
    And I enter invalid email address gasrur@tt.12
    And I enter invalid password !!!!!!!
    And I click on Sign in button
   Then I verify error message is displayed