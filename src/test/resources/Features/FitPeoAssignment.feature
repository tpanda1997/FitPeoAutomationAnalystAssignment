Feature: Validate Total Recurring Reimbursement on FitPeo

  #Background: Navigate to the FitPeo Homepage
  #Given Navigate to the FitPeo Homepage
  
  
  @assingmentByTathagatPanda @dev_windows @aut_Tathagata
  Scenario: Validate Total Recurring Reimbursement
    Given Navigate to the Revenue Calculator Page
    And Scroll Down to the Slider section
    When user adjust the slider to "820" the bottom text field value should be updated to "820"
    And when the value "560" is entered in the text field, the slider position should be updated to "560"
    And now again change the value to "820" in the text field
    And Select CPT Codes
    Then Validate Total Recurring Reimbursement value should be "$110700"
