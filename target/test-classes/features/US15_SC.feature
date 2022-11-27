Feature: Senaryo Outline ile us15

  @tc01_Sc
  Scenario Outline: TC01 Sistemde hasta oluşturulabilmeli
    Given User goes to Medunna
    Then Admin goes to sign in symbol and click on it
    And  Admin fills in username and password then clicks sign in
    And Admin clicks on the Administration
    Then Admin navigates to Create a new user
    And  Admin enters a "<username>" for name
    Then Admin enters a "<firstname>" for first name
    And  Admin enters a "<lastname>" for last name
    And  enters an "<email>" for email
    And  enters a "<language>" for language
    And enter an "<ssn>" for ssn
    And  selects a "<role>"for patient
    Then saves it and closes the webpage
    Examples:
      | username | firstname | lastname | email                          | language | ssn         | role         |
      | rick     | ricky     | eden     | rick@gmail.com                 | English  | 455-44-2334 | ROLE_STAFF   |
      | Özgür    | Bey       | midem    | kazindi@birparcaekmekyokmu.com | Turkish  | 455-44-2335 | ROLE_PATIENT |

