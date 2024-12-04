Feature: register test on sanangelcom
  Scenario Outline: As a "<description>" I want to get corresponding web validation "<message>"
    Given user open the url sanangel.com
    When user add one pack flower
    Then this permit add to cart