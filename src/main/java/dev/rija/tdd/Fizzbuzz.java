package dev.rija.tdd;

public class Fizzbuzz {

    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final String FIZZBUZZ = "fizzbuzz";

    public String display(int number) {
        if (isMultipleOfThree(number) && isMultipleOfFive(number)) {
            return FIZZBUZZ;
        }

        if (isMultipleOfThree(number)) {
            return FIZZ;
        }

        if (isMultipleOfFive(number)) {
            return BUZZ;
        }
        return Integer.toString(number);
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }
}
