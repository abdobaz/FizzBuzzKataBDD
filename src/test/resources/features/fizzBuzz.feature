Feature: fizzBuzz
when I run fizzBuzz program 
I must prints the numbers from 1 to 100. 
but for multiples of three print “Fizz” instead of the number 
and for the multiples of five print “Buzz”. 
For numbers which are multiples of both three and five print “FizzBuzz“

Scenario: show result from 1 to 2
Given I have first number as 1
And I have second number as 2
When I run fizzBuzz program
Then should show : 
"""
1
2
"""
        
Scenario: show result from 1 to 5
Given I have first number as 1
And I have second number as 5
When I run fizzBuzz program
Then should show : 
"""
1
2
Fizz
4
Buzz
"""
        
Scenario: show result from 1 to 10
Given I have first number as 1
And I have second number as 10
When I run fizzBuzz program
Then should show : 
"""
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
"""

Scenario: show result from 1 to 20
Given I have first number as 1
And I have second number as 20
When I run fizzBuzz program
Then should show : 
"""
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
"""

