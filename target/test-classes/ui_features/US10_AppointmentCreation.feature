Feature: Appointment


  Scenario: Patient creates an appointment

    Given  User goes to Medunna
    When Patient clicks on sign in button and fills in username and password
    And   Patient clicks on My pages and then goes to make an appointment button and clicks it
    And   Patient enters the "phoneNumber" and date
    Then Patient clicks on Send an Appointment Request buton and patient signs out
    And  Arts signs in the system to see his or her appointments
    Then Art approves the waiting appointment

