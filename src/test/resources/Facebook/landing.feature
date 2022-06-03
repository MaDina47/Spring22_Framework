Feature: Facebook landing page

  Scenario: Login Facebook and open Facebook Pay, Oculus, Instagram, Portal and Bulletin then close 4 windows except Instagram
    Given I am on facebook
    When I click on Facebook Pay, Oculus, Instagram, Portal and Bulletin
     And I close 4 windows except Instagram
    Then Verify number of window-Handles is 1
    Then Verify Page Title is Instagram
    Then Verify Log in button on Instagram is disabled by default

