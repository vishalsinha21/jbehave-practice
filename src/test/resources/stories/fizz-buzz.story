Story: Fizz Buzz

Meta:
@scope jBehave practice

Narrative:
    Check what fizz buzz is all about

Scenario: Number is dividable by 3
When the number is 6
Then FizzBuzz should return fizz

Scenario: Number is dividable by 3
When the number is 9
Then FizzBuzz should return fizz

Scenario: Number is dividable by 5
When the number is 20
Then FizzBuzz should return buzz

Scenario: Number is dividable by 5
When the number is 500
Then FizzBuzz should return buzz

Scenario: Number is dividable by 15
When the number is 30
Then FizzBuzz should return fizzbuzz

Scenario: Number is dividable by 15
When the number is 450
Then FizzBuzz should return fizzbuzz

Scenario: Number is not dividable by 3, 5 or 15
When the number is 46
Then FizzBuzz should return 46

Scenario: Number is not dividable by 3, 5 or 15
When the number is 94
Then FizzBuzz should return 94

