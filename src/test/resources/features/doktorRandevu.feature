Feature: Doktor randevulari

  @randevu
  Scenario: Doktor randevularini goruntuleyebilir

    Given User goes to Medunna
    Then User goes to sign in symbol and clicks on it
    And   User clicks on the Sign in button
    Then Doctor fills in the correct credentials
    And Doctor clicks on my pages and goes to appointments
    Then  Doctor verifies the appointment titles
    And Doctor gets all the values printed under "Start DateTime"
