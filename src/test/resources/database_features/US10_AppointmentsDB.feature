@US10_DB
Feature: Appointment verification via database

  Background: database connection
    Given user sets the connection


  Scenario Outline: All appointments in data base are in the list

    Then  user gets all the registered appointments "<query>"
    Then  user closes the connection
    Examples: test data
      | query                     |
      | select * from appointment |


  @US_10DB2
  Scenario Outline: Existence of appointments is verified
    Then User verifies the appointment with column names "<query>" and "<columnName>"
    Then  user closes the connection
    Examples: test data
      | query                     | columnName |
      | select * from appointment | id         |




