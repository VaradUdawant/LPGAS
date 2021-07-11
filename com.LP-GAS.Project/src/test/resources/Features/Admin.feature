@LPGASAdmin
Feature: Testing LPGAS Project

  Background: To launch the application and user login
    Given user launching the application
    When user login module using username "lpgdevadmin@winjit.com" and password is "Winjit@123"
    And user click on Login button

  @User
  Scenario: To check admin able to add new user
    Given admin click on Masters
    When Select Users from drop down list
    And Click on create user button
    And Enter First Name "Demo" Last Name "Automation" E-mail "demo2@winjit.com" Cell No "988888889"  SA ID "1234567894562" Password "Demo@1234"
    And Select User Role "Applicant"
    And Select Gender Status Birth Date as "29/01/2001"
    And click on create user button
    
    
    @Training
  Scenario: To check admin able to create trainings
    Given admin click on the  Masters
    When select Trainings from dropdown list
    And Click on add trainings
    And Enter Course Name "LPGAS11" Venue "Nashik" Seats Available "50"
    And Select Account "SAFE APPLIANCE/TECH"
    And Select Status and Time  StartDate "06/10/2021" EndDate "01/30/2022" StartTimeHH "07" StartTimeMM  EndTimeHH "11" EndTimeMM
    Then click on the save button

  @CompanyList
  Scenario: To check admin able to add new comapny and see all the company list
    Given admin click on Masters
    When Select CompanyList from drop down list
    When click on add company
    And Enter Company Name "Demo" Email "demo@winjit.com" Phone Number "454545445" Fax Number "56789" Cell Number "985555555" Address "College Road" City "Nsk" Province "maharashtra" Postal Code "422013" Country "India"
    Then click on Save&Submit

  @ExamModule
  Scenario: To check admin able create and edit  exam module
    Given admin click on Masters
    When Select  Exams Modules from drop down list
    And click on create exam button
    And Enter Module Name "Testing" Description "Auto" Total Marks "150"
    And Select status as active
    And click on create exam button1
    And click on ok button and click on cross
    And Edit to view or edit the exam module

  @ExamMapping
  Scenario: To check admin able to map exam module
    Given admin click on Masters
    When select Exam Module Mapping from drop down list
    And Select trainings as "Demo On 3rd March 2021"
    And select exam modules form given options
    Then click on save button below

  @TrainingDetailsValidateForm
  Scenario: To check admin able to validate documents of training Details
    Given admin clicks on Training Enrolment
    When select Training Details List from the drop down list
    And click on view option
    And validate form by clicking on validate from button
    Then write a comment "valid" and click on accept button

  @MembershipDocumentValidation
  Scenario: To check amdin able to use membership module
    Given clicks on Membership
    When select membership application
    And Click on edit option
    And Click on verify Document
    Then Write Comment "Verifed" and click on approve button

  @MembershipPayment
  Scenario: To check if admin can approve membership payment
    Given Select on the membership module
    When Select membership Applicetion
    And Click on the edit or view button
    And Click on the approve payment
    And Write a comment "Payment Done"
    Then click on the approve button

  @TrainingPayment
  Scenario: To check if admin can approve training payment proof
    Given Select on the training enrolment module
    When Select training details list
    And Click  the edit or view button
    And Click on the approve payment button
    And Write in commentbox "Payment Successful"
    Then click  the approve button

  @CaptureResult
  Scenario: To check if admin can capture result
    Given Select the training module
    When Select training details from dropdown
    And select edit button infront of appliction
    And Click on capture result button
    And Enter marks in Module1 "80" Automation Tool "65" Module A "35"
    Then Genrate result
    And click on ok button which comes on pop-up window
    And click on Capture button to check result

  @AdminLogistic
  Scenario: To check if admin can verfiy logistic details
    Given Select the training Module from list
    When Select logistic details list
    And Click on view option
    And click on verify Document
    And Write comment "Verified Logistic documents"
    Then Click on Approve button

  @AdminPOE
  Scenario: To check if admin can assgin a accessor to applicant
    Given Click on the POE module
    When Click on the POE List from drop down
    And Click on the edit option
    And Select the Assign Accessor "LPG Accessor (rohitk4@winjit.com)"
    Then Click on the Assign  Accessor

  @UploadPermitCSV
  Scenario: To check if admin can
    Given Click  on GrantPermitModule
    When Click on Appliance  from the list
    And Click on Upload Permit CSV "C:\\Users\\Dell\\Downloads\\CompanyPermitImportExcel (4).csv"
    Then Click on upload CSV button

  @ValidatePermit
  Scenario: To check if admin can validate permit
    Given Click on Grant Permit Module
    When Click on Appliances from drop down list
    And Click on edit or view option
    And Click on Validate form button
    And Write in comment box "Valid"
    Then Click on the  Approve button

  @LicencesDocumentVerify
  Scenario: To check if admin can verfiy the Document for the Licence
    Given Select the Licences Module from list
    When Select Licences list
    And Click on the view option
    And click on the verify Licences Document button
    And Write in the commentbox "Valid Documents"
    Then Click on the Approve button

  @LicencesReprintValidation
  Scenario: To check if admin can verfiy the reprint for the Licence
    Given Select the Licences Module
    When Select Reprint list
    And Click on the Action option
    And Write in the comment "Approved"
    Then Click on the Approve button below

  @MembershipPaymentApproval
  Scenario: To check if admin can approve membership payment
    Given Click on Membership module
    When Click on Membership Application Module
    And Click on edit butoon in front of application
    And Click on approve payment button
    And writte a comment in comment box "Payment Done"
    Then Click on Approve Button

  @TraingPaymentApproval
  Scenario: To check if admin can approve Training payment
    Given Click on Training module
    When Click on Training Details Module
    And Click on the edit butoon in front of application
    And Click on the Approve payment button
    And Writte a comment in comment box "Payment Successful"
    Then Click on the Approve Button

  @LogisticPaymentApproval
  Scenario: To check if admin can approve Logistic Details payment
    Given Click on Training Enrolment module
    When Click on Logistic Details Module
    And Click on the edit butoon in front of the application
    And Click on the Approve payment button given
    And Writte a comment in the  comment box "Payment Done Successful"
    Then click on the Approve button below

  @CompanyTrainingList
  Scenario: To check if admin can export excel file and add company training list
    Given Click on Training Enrolment
    When Click on Training Details List
    And Click on Export Excel button to list training details
    And Click on Company Training List
    And Click on Export Excel button for list Company Training
    And Click on Company Training Application button
    And Upload excel file "C:\\Users\\Dell\\Desktop\\CompanyTrainingImportExcel.xlsx"
    And From drop down list select companty "Testing1"
    And Select any one Dietary Requirement by clicking on radio button
    And From drop down list select  Course details "Demo On 3rd March 2021"
    Then Click on Submit button

  @DeleteTraining
  Scenario: To check if admin is able to find particular training and delete it
    Given clik on masters module
    When Click on Trainings module
    And Search by Title "bbb"
    And click on delete option
    Then Click on yes I want to delete

  @AddExistingPermit
  Scenario: To check if admin able to add existing permit
    Given Click on Grant Permits
    When Click on appliances
    And Click on add existing permit
    And Enter Name of Applicant "Winjit Technologies 1" Existing Supplier Number "1344" Telephone number "998888888"  Cell number "546516516" EmailAddress "test@gmail.com"
    And Select are you manufacture
    And Name of Manufacturer "ABC" Telephone Number "788877888" Cell number "899958846" Email Address "demo@gmail.com" Street Address of factory "Mumbai"
    And Testing Authority "yes" QMS Type "T43" Test Report Number "70"
    And Select Test Report Issued Date "06/03/2021" Permit Expiry Date "07/24/2021"
    And Product Description "Electronics" Model Number "i5" Country of origin "India" Brand Name "HP"
    Then Click on Save and submitt button
