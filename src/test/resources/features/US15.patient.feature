Feature:Us15


  Scenario: user verifes that patient with id 361241 exists
    Given user sets the connection
    And  user executes the "select * from patient where id = 361241"
    Then user verifies the exsistence of patient in the database

