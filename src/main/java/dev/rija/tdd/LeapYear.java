package dev.rija.tdd;

/**
 * All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
 * All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900
 * were NOT leap years, NOR will 2100 be a leap year),
 * All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
 * All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
 */
public class LeapYear {

    private static final int FOUR_HUNDRED = 400;
    private static final int FOUR = 4;
    private static final int ONE_HUNDRED = 100;

    public boolean isLeap(int year) {
        return (year % FOUR_HUNDRED == 0
                || (year % FOUR == 0 && year % ONE_HUNDRED != 0));
    }
}
