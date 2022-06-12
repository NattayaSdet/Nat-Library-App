@smoke @regression @login
Feature: As a user, I should be able to log in.


  Scenario Outline: Verify login with credentials
    Given user on the login page
    When user uses username "<username>" and passcode "<password>" and user clicks the login button
    Then verify the user should see page title is "Login - Library"
    @student
    Examples:

      | username          | password |
      | student1@library  | d5fv9BtX |
      | student5@library  | i1oDgf2d |
      | student6@library  | NXhpXJdC |
      | student7@library  | QfYjDNXj |
      | student8@library  | 1DaJSz1z |
      | student9@library  | DFDYll1P |
      | student10@library | F8u6OrI2 |
      | student11@library | 4VRMTsAB |
      | student12@library | 8ENtWqOe |
      | student13@library | Y0kaXNMa |
      | student14@library | bL1twuqT |
      | student15@library | 9WB9sVtF |


    @librarian
    Examples:
      | username            | password |
      | librarian1@library  | qU9mrvur |
      | librarian2@library  | uYrhHmmj |
      | librarian3@library  | DFvU4b1i |
      | librarian4@library  | 3lwxJ1Kk |
      | librarian5@library  | hj65YBiE |
      | librarian6@library  | QaG7mkXA |
      | librarian7@library  | C5WUiPUP |
      | librarian8@library  | UECJkTnl |
      | librarian9@library  | MSx8u9n4 |
      | librarian10@library | ZIkOcbCa |
      | librarian11@library | fsRRgXxB |
      | librarian12@library | wHhJQDSK |

