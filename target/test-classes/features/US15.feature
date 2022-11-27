@Us15
Feature:Create or Edit Patient by just Admin

  Background: medunna WebPage
    Given User goes to Medunna

  @tc01
  Scenario: New patients can only be created by admin
    Then Admin goes to sign in symbol and click on it
    And  Admin fills in username and password then clicks sign in
    And Admin clicks on the Administration
    Then Admin navigates to Create a new user and clicks on it
    And Admin saves the new Patient


