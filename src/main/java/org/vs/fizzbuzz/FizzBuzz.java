package org.vs.fizzbuzz;

public class FizzBuzz {
    public String get(int number) {
        String result = String.valueOf(number);

        if (number % 15 == 0) {
            result = "fizzbuzz";
        } else if (number % 5 == 0) {
            result = "buzz";
        } else if (number % 3 == 0) {
            result = "fizz";
        }

        return result;

    }
}
