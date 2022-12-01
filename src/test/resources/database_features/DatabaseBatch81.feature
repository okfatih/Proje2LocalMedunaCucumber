Feature: database test

  @DBtest
  Scenario Outline: user db test

    Given user sets the connection
    Then  user gets all registered data "<query>" and "<columnName>"
    Then  user verifies the user credentials

    Examples: test data
      | query                  |columnName |
      | select * from jhi_user | ssn        |