@Applicant
Feature: Testing LPGAS Project Applicant

  Background: To check applicant login
    Given user launching the application
    When user login username "poonamp2@gmail.com" and paswd "Winjit@123"
    And click on login

  @ApplicantTraining
  Scenario: To check applicant can access training module
    Given click on Training Enrolment
    When select Training Details List from dropdown list
    And click on new application
    And select exam or non-exam options from radio buttons
    And Enter Highest School Grade "A" Tertiary Qualifications "BE"  Company Name "ABCD" Contact Person "Tester1" Telephone "788988888" Postal Address "College Road"
    And Select course details from dropdown "Demo On 3rd March 2021"
    And Click on logistic requirement check box if required
    And Upload document "C:\\Users\\Dell\\Desktop\\desktop.jpg" and click on terms and condition check box
    Then click on submit button



  @ApplicantMembership
  Scenario: To check applicant can access membership module
    Given click on membership
    When select membership application from the drop down application
    And Add new application
    And Enter Postal Address "College Road" City "Pune" Province "MH" Postal Code "422013" Street Address "College Road" Phone Number "988776655" Fax "546654655"
    And upload Documents UserId "C:\\Users\\Dell\\Pictures\desktop.jpg"  CompanyProfile "C:\\Users\\Dell\\Pictures\\nature.jpg"
    And Select type "Installer" and enter QCC number "2316542"
    And click on declaration checkbox
    Then Apply on Membership button

  @ApplicantMembershipupdate
  Scenario: To check applicant can update membership application
    Given click on membership module
    When select membership application from the dropdown
    And Click on edit/view button
    And change postal address "MG Road"
    Then click on update membership


  @MembershipPaymentproof
  Scenario: To check if applicant can upload paypment proof
    Given Click on the membership
    When select Membership Application  from drop down
    And Click on view option in front of application id
    And upload the paymentproof by clicking on choose file "C:\\Users\\Dell\\Pictures\\desktop.jpg"
    Then Clik on Pyament proof button

  @TrainingPaymentproof
  Scenario: To check if applicant is able to upload training paymentproof
    Given Select Training module
    When Select Training Details list
    And Click on view option if front of appication
    And Upload the payment proof "C:\\Users\\Dell\\Pictures\\desktop.jpg"
    Then click on upload payment proof button

  @ApplicantPOE
  Scenario: to check if applicant can access POE
    Given Click on the POE
    When Clcik on POE list from dropdown
    And Click on apply POE button
    And Update Applicant Name as "Applicant1" and Mentor Name as "Mentor1"
    And Enter the details Scope "Good" Applicable SANS Code "1321" Brand Name "HP" Model Number "HP11" Category "Desktop" Permit Number "HP21" Appliance Condition "ok"  Seal Number "101"
    And Upload Zip file "C:\Users\Dell\Pictures\New folder.zip"
    Then Click on submit button

  @LogisticUpdate
  Scenario: To check if applicant is able to upload training paymentproof
    Given Select TrainingEnrolment module
    When Select LogisticDetails list
    And Click on the view option if front of appication
    And Update the values Travelling from "Mumbai" Arrival Airport "NSK" Departure Airport "Mumbai"
    Then click on update button

  @LicencesReprint
  Scenario: To check if applicant is able to request reprint of Licence
    Given Select Licence
    When Select Apply Licence from drop down
    And Click on Request Reprint button
    Then Click on Yes I want to reprint licence button
