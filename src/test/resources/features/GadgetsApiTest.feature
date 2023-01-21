Feature: Gadgets API tests

  Scenario Outline: Get object by id
    Given a get request is made for fetching details for object with "<id>"
    When response has status 200
    Then response has valid schema
    And response contains the following "<name>"

    Examples:
    | id | name |
    | 2  | Apple MacBook Pro 16 |
    | 7  | Apple MacBook Pro 16 |