Feature: Login

  Scenario Outline: valid login details
    Given the user has a valid <username> and <password>
    And noone else is logged in already
    When the user logs in with <username> and <password>
    Then they are logged in

    Examples:
      | username | password |
      | 'user'   | 'user'   |
      | 'admin'  | 'admin'  |