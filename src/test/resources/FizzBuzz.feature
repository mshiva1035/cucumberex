Feature: Fizz Buzz Game Play

  Scenario: Play Fizz Buzz to get Buzz
    Given Create a Fizz Buzz Game play
    When I play with number 15
    Then The result is "FizzBuzz"

  Scenario: Play Fizz Buzz to get Fizz
    Given Create a Fizz Buzz Game play
    When I play with number 3
    Then The result is "Fizz"

  Scenario: Play Fizz Buzz to get Buzz
    Given Create a Fizz Buzz Game play
    When I play with number 5
    Then The result is "Buzz"