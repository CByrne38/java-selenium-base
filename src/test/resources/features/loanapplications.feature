Feature: New Valid Loan Applications
  As a member of branch staff
  I want to be able to submit customer details
  So they can apply for loans without needing access to the website

  Scenario: Valid customer details supplied
    Given a customer has valid name and address details
    When the details are submitted
    Then the application should be successful

    @firefox
  Scenario: Customer is under 18
    Given a customer is under the age of 18
    When the details are submitted
    Then the application should not be successful


  @firefox @edge
  Scenario Outline: valid customer details supplied
    Given a customer has a valid <firstname> <lastname> <age> <address1> <address2> <address3> <address4> <postcode> <email> <loanamount>
    When the details are submitted
    Then the application should be successful

    Examples:
      | firstname | lastname | age  | address1       | address2   | address3 | address4 | postcode  | email           | loanamount |
      | 'alice'   | 'smith'  | '23' | '1 new street' | 'bradford' | ''       | ''       | 'ab1 1ab' | 'test@test.com' | '3000'     |
      | 'bob'     | 'smith'  | '23' | '1 new street' | 'bradford' | ''       | ''       | 'ab1 1ab' | 'test@test.com' | '3000'     |
