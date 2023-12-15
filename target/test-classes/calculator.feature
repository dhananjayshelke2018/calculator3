Feature: CalculatorFeature
  As a math enthusiast
  I would like to do basic operations of calculator

  Scenario: Verify addition of two numbers
    Given I am on basic calculator page
    When I enter "2" "+" "3"
    Then I see the result as "5"


  Scenario: Verify addition of two numbers
    Given I am on basic calculator page
    When I enter "5" "+" "3"
    Then I see the result as "8"


  Scenario: Verify addition of two numbers
    Given I am on basic calculator page
    When I enter "5" "–" "1"
    Then I see the result as "4"

  Scenario: Verify addition of two numbers
    Given I am on basic calculator page
    When I enter "5" "*" "1"
    Then I see the result as "5"
    
  Scenario: Verify division of two numbers
    Given I am on basic calculator page
      When I enter '4' '/' '2'
      Then I see the result as '2'

  Scenario Outline: Verify calculator operations
    Given I am on basic calculator page
    When I enter '<number1>' '<operator>' '<number2>'
    Then I see the result as '<expectedResult>'
    Examples:
    |number1|operator|number2|expectedResult|
    |2      |+       |3      |5             |
    |4      |–       |2      |2             |
    |5      |/       |1      |5             |
    |1      |×       |6      |6             |
