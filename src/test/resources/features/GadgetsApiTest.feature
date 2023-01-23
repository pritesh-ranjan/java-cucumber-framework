Feature: Gadgets API tests

  Scenario Outline: Get object by id
    Given a get request is made for fetching details for object with "<id>"
    When response has status 200
    Then response has valid schema
    And response contains the following "<name>"

    Examples:
    | id | name |
    | 2  | Apple iPhone 12 Mini, 256GB, Blue |
    | 7  | Apple MacBook Pro 20 |


    Scenario Outline: Create a new object
      Given a POST request is made with "<name>" and default data
      When response has status 202
      Then verify if object is created by creating a GET request with id of response

      Examples:
      | name |
      | HP Pavilion Plus |