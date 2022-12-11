Feature: Appointments Api Testi
  @AppointmentGet
  Scenario: API verifications of doctor appointments

    When  User sends a get request to access to doctor appointments
    Then  User validates the doctor appointments with API