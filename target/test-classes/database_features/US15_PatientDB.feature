Feature: database test

  Scenario Outline: user verifies patient's info
    Given user sets the connection
    Then  user gets all registered data "<query>" and "<columnName>"


    Examples: test data
      | query                  |columnName |
      | select * from patient | blood_group       |





