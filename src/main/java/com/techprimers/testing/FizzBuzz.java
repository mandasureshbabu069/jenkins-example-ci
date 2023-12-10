package com.techprimers.testing;

public class FizzBuzz {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("new code commit on github for web hook test");
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";


        return String.valueOf(number);
    }
}
