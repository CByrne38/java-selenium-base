Feature: Logout

  Scenario Outline: Valid logout function
    Given the user has a valid <Username> and <Password>
    And the user has successfully logged in with a valid <Username> and <Password>
    When the user selects the logout button
    Then they are logged out
    And back to login page

    Examples:
      | Username | Password |
      | 'user'   | 'user'   |