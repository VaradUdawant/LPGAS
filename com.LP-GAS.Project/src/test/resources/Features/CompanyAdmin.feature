@LPGASCompanyAdmin
Feature: Testing LPGAS with company admin

  Background: Launching the application as company admin
    Given launching the application
    When user login using username "rohitk3@winjit.com" password "Winjit@123"
    And Click on Login button

  @CompanyAppliance
  Scenario: To check if company admin able to use appliance permit module
    Given Click on appliance permit
    When select permitts from drop down
    And Click on apply new permit button
    And Update Telephone Number "978756856" Cell Number "879876548" Fax Number "46545"
    And Click on radio button Are you Manufacture as no
    And Enter Name of manufacture "Tester" Telephone Number "232131231" Cell Number "732131231" Email "test@gmail.com" Street Address "College Road"
    And Enter Test Report Number "75" Testing Authority "Tester" QMS Type "ok" Product Description "Wood" Model Number(s) "w21" Country of origin "India" Brand Name "ABCD"
    And upload Quality Management System "C:\\Users\\Dell\\Pictures\desktop.jpg" and test report "C:\\Users\\Dell\\Pictures\desktop.jpg"
    And select Test Report Issued Date "06/08/2021"
    And select Gas tpye "NG" and appliance type "Appliance"
    Then click on submit button below

  @ComapayAdminMembership
  Scenario: To check company admin can access membership module
    Given click on the membership module
    When select membership application from the dropdown list
    And Click on  new application
    And Enter the Postal Address "FC Road" City "Pune" Province "Maharastra" Postal Code "43232" Street Address "College Road" Phone Number "988776655" Fax "546654655"
    And upload Documents CompanyID "C:\Users\Dell\Pictures"  CompanyProfile "C:\Users\Dell\Pictures"
    And Select type "Hardware"
    And Click the declaration checkbox
    Then Click on Apply on Membership button

  @CompanyrenewPermit
  Scenario: To check if company admin can renew permit
    Given Click on appliance permit module
    When select renewal permit from drop down
    And Click on edit/view option
    And Upload the Quality Management System "C:\\Users\\Dell\\Desktop" and Test Report "C:\\Users\\Dell\\Pictures"
    Then Click on Renew Permit button

  @CAUpdatePermits
  Scenario: To check if Company admin can update the permits from the lsit
    Given Select the Appliance Permit Module
    When Select Permits from the list
    And Click on the edit option of which you want to uadate
    And Update the values applicant not manufacture section Name of Manufacturer "Tester" Telephone Number "984168484" Cell number "5465456" Email Address "tester@winjit.com" Country of origin "India"
    Then Click on the Udate Details button

  @CAPermitPaymentproof
  Scenario: To check if company admin can be able to upload payment proof
    Given Click on Appliance Permit
    When Select Permits module from the list
    And Select edit or view option
    And Chose file to be uploaded "C:\\Users\\Dell\\Pictures\\nature.jpg"
    Then Click on upload payment proof button
