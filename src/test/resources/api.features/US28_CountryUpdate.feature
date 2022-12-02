Feature: Country creation


  Scenario: Admin can update the country in Medunna
    Given User gets country whoose id is 361381
    Then  User updates the country name
    And  User verifies that county has been updated