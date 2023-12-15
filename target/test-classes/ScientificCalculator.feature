Feature: ScientificCalculator
  As a math enthusiast
  I would like to do basic operations of calculator

Scenario Outline: Verify scientific calculator operations
Given  I am on scientific calculator page
When I enter '<number1>' '<operator>' '<number2>'
Then I see the result as '<expectedResult>'
Examples:
|number1|operator|number2|expectedResult|
|2      |+       |3      |5             |
|4      |–       |2      |2             |
|5      |÷       |1      |5             |
|1      |×       |6      |6             |