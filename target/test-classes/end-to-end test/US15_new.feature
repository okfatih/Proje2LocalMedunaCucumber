@E2E
Feature:end to end test

  Background: medunna WebPage
    Given User goes to Medunna


  Scenario: New patients can only be created by admin
    Then Admin goes to sign in symbol and click on it
    And  Admin fills in username and password then clicks sign in
    And Admin clicks on the Administration
    Then Admin navigates to Create a new patient and clicks on it
    And Admin saves the new Patient

  Scenario Outline: user verifies patient's info
    Given user sets the connection
    Then  user gets all registered data "<query>" and "<columnName>"


    Examples: test data
      | query                 | columnName |
      | select * from patient | first_name |
