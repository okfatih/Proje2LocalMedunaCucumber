Feature: database test

  Scenario Outline: user verifies patient's info
    Given user sets the connection
    Then  user gets all registered data "<query>" and "<columnName>"
    Then user validates the creation of patient "<name>"

    Examples: test data
      | query                 | columnName  |name|
      | select * from patient | first_name |  Omer   |





