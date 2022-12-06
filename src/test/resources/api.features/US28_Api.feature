Feature: Admin olarak; Country oluşturma / Okuma ve Silme
  Scenario: Api ile cs state dogrulama

    Given User gets the c-state info whoose id is = 1255
    Then  User validates that state status code is 200
    And  User validates the cs-state's info

    @testItemGetTest
    Scenario: Api ile test items yapma
      Given User gets the test item with id = 30198
      Then User validates the status code as 200 and test item

    @testItemGetTest
    Scenario: test Items post yapma
        Given User creates a new test item with post
        Then  User validates the posted test item


