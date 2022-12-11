Feature:DataBase 01

  @DBTest

  Scenario Outline: User DB test

    Given user sets the connection
    And   user gets the new registered user via "<query>" and "<columnName>"
    Then  user credentials is verified

    Examples: test data

      | query                  | columnName |
      | select * from jhi_user | ssn        |