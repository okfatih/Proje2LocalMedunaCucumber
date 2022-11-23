Feature: US001 Kayıt olmak için SSN, First Name ve Last Name bilgileri girilebilmelidir.

  Scenario: Registiration

    Given User goes to Medunna
    Then User goes to sign in symbol and clicks on it
    And  User clicks on the Sign in button
    Then User fills in correct credentials
    And  User fills in the Registiration form