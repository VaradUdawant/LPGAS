@LPGAS
Feature: Testing LPGAS Project

  Background: To launch the application and user login
    Given user launching the application
    When user login module using username "lpgdevadmin@winjit.com" and password is "Winjit@123"
    Then user click on Login button

  @PermitApproval
  Scenario: To check if admin can approve permit
    Given Click on Grant Permits module
    When Click on the  appliances
    And Click on the edit or view option
    And Click on Permit Approval button
    And Write in the  comment box "Permit Approved"
    And Drag the slider to number of years permit should be approved
    Then Click on approve button
