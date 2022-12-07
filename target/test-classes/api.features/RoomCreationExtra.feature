Feature: Room post testi

  @PostApiRequest
  Scenario: Test Room Api

    When   User sends a post request to create a room
    Then   After that user gets the info of a new room and validates it

