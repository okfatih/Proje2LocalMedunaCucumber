Feature: Admin olarak; Country oluşturma / Okuma ve Silme
  Scenario: Api ile cs state dogrulama

    Given User gets the c-state info whoose id is = 1255
    Then  User validates that state status code is 200
    And  User validates the cs-state's info
