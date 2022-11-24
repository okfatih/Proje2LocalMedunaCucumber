Feature: Registration


  Scenario Outline: Register new users for

    Given user is on registration page
    And    user enters ssn number as "<SSN>"
    Then  user enters firstname and lastname as "<firstname>" and "<lastname>"
    And  user provides a username "<username>"
    Then  user provides email id as "<email>"
    And  user enters the password as "<firstpassword>"
    Then user confirms the new password "<secondpassword>"
    Then user clicks on register button and  sees the success message as "<message>"
    Then user reads all registrant data
    Examples:
    |SSN|firstname|lastname|username|email|firstpassword|secondpassword|message|
    |563-26-3726|Edmund|Dorf|edmundcum|edmundorf31@gmail.com|edmund@3726|edmund@3726|Registration saved!|