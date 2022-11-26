Feature: Admin tarafından hasta oluşturma ve düzenleme

  Scenario: API ile hasta bilgilerini doğrulayın

    Given User gets the patient info whoose id is 55902
    Then  User validates that status number is 200
    And User validates patient's info
