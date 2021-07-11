@LPGASAccessor
Feature: Testing LPGAS with Accessor

  Background: Launching the application as accessor
    Given launching the application for accessor user
    When user login with the  username "rohitk4@winjit.com" password "Winjit@123"
    And Click on the Login button given below

  @AccessorPOE
  Scenario: To check if accessor can use POE module
    Given Click on POE
    When Select POE list from drop down list
    And click on Edit option
    And then verify POE by clicking on verify POE button
    Then Enter comments "verified" and click on approve button
